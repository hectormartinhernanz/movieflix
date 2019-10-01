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
			alPel = new ArrayList();
			cargarConexion();
			Pelicula p;
			String linea;
			String sql = "SELECT id FROM peliculas";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next() == false) {
				sql = "INSERT INTO peliculas (nombre,anyo,idCat)VALUES(?,?,?);";
				ps = conexion.prepareStatement(sql);
				BufferedReader br = new BufferedReader(new FileReader("peliculas_numCat.txt"));
				while(((linea = br.readLine())!=null)) {
					String[] parte = linea.split(",");
					ps.setString(1,parte[0]);
					ps.setInt(2,Integer.parseInt(parte[1]));
					ps.setInt(3,Integer.parseInt(parte[2]));
					ps.executeUpdate();
				}
				ps.close();
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
		// TODO Auto-generated method stub
		return null;
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
