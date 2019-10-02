package movieflix.datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public class Datos implements IDatos {

	private final static String BBDD = "jdbc:mysql://10.90.36.111/movieflix?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private final static String USER = "root";
	private final static String PASSWORD = "password";
	private static Connection conexion;
	private static ArrayList<Pelicula>alPel;
	
	public void cargarInicial() {
		PreparedStatement ps;
		try {
			Pelicula p;
			String linea;
			String nombre;
			int anyo;
			int idCat;
			String sql = "SELECT id FROM peliculas";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(sql);
			String[] parte;

			if (rs.next() == false) {
				sql = "INSERT INTO peliculas (nombre,anyo,idCat)VALUES(?,?,?);";
				ps = conexion.prepareStatement(sql);
				BufferedReader br = new BufferedReader(new FileReader("peliculas_numCat.txt"));
				
				while(((linea = br.readLine())!=null)) {
					parte = linea.split(",");
					ps.setString(1,parte[0]);
					ps.setInt(2,Integer.parseInt(parte[1]));
					ps.setInt(3,Integer.parseInt(parte[2]));
					ps.executeUpdate();
					parte = linea.split(",");
					nombre = parte[0];
					anyo = Integer.parseInt(parte[1].replaceAll("\\s*$", "").replaceAll("^\\s*", ""));
					idCat = Integer.parseInt(parte[2].replaceAll("\\s*$", "").replaceAll("^\\s*", ""));
					p = new Pelicula(nombre,anyo,idCat);
					if(!alPel.equals(p)) {
						alPel.add(p);
						ps.setString(1,p.getNombre());
						ps.setInt(2,p.getAnyo());
						ps.setInt(3,p.getCat());
						ps.executeUpdate();
					}
				}
				ps.close();
				br.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conexion!=null) {
				try {
					conexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public boolean altaUsuario(Usuario u) {
		return false;
	}

	@Override
	public boolean bajaUsuario(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Usuario> obtenerListaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificarUsuario(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean altaPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bajaPelicula(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pelicula> obtenerListaPelicula() {
		
		try{
		
		ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
		String sql = "SELECT * FROM peliculas;";
		Connection con =DriverManager.getConnection(BBDD, USER, PASSWORD); 
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
	
		while(rs.next()) 
		{
		
			lista.add(new Pelicula(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
			
			
		}
		st.close();
		rs.close();
		return lista;
		}
		catch(SQLException e) {
			System.out.println("Error con base de datos: "+e.toString());

			return null;}
		finally {

		}
		
		
	}

	@Override
	public boolean modificarPelicula(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	private void cargarConexion() throws SQLException {
		conexion = DriverManager.getConnection(BBDD, USER, PASSWORD);
	}

	public void cerrarConexion() throws SQLException {
		conexion.close();
	}
}
