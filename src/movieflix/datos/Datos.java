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
import movieflix.utilidades.LeerDatos;

public class Datos implements IDatos {

	private final static String BBDD = "jdbc:mysql://10.90.36.111/movieflix?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private final static String USER = "root";
	private final static String PASSWORD = "password";
	private static Connection conexion;
	private static ArrayList<Pelicula> alPel;

	public void cargarInicial() {
		PreparedStatement ps;
		try {
			String linea;
			String sql = "SELECT id FROM peliculas";
			cargarConexion();
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(sql);
			String[] parte;

			if (rs.next() == false) {
				sql = "INSERT INTO peliculas (nombre,anyo,idCat)VALUES(?,?,?);";
				ps = conexion.prepareStatement(sql);
				BufferedReader br = new BufferedReader(new FileReader("peliculas_numCat.txt"));

				while (((linea = br.readLine()) != null)) {
					parte = linea.split(",");
					ps.setString(1, parte[0]);
					ps.setInt(2, Integer.parseInt(parte[1]));
					ps.setInt(3, Integer.parseInt(parte[2]));
					ps.executeUpdate();
					parte = linea.split(",");
					ps.setString(1, parte[0]);
					ps.setInt(2, Integer.parseInt(parte[1].replaceAll("\\s*$", "").replaceAll("^\\s*", "")));
					ps.setInt(3, Integer.parseInt(parte[2].replaceAll("\\s*$", "").replaceAll("^\\s*", "")));
					ps.executeUpdate();
				}
				ps.close();
				br.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el fichero de carga de la base de datos.");
		} catch (IOException e) {
			System.out.println("No se cerro correctamente el fichero.");
		} finally {
			try {
				if (conexion.isClosed()) {
					cerrarConexion();
				}
			} catch (SQLException e) {
				System.out.println("Fallo a cerrar la conexion");
			}
		}
	}

	@Override
	public void altaUsuario(Usuario u) {
		try {
			@SuppressWarnings("deprecation")
			String day = "" + u.getFechaNacimiento().getDate();
			@SuppressWarnings("deprecation")
			String month = "" + (u.getFechaNacimiento().getMonth() + 1);
			@SuppressWarnings("deprecation")
			String year = "" + (u.getFechaNacimiento().getYear() + 1900);
			if (day.length() < 10) {
				day = "0" + day;
			}
			if (month.length() < 10) {
				month = "0" + month;
			}

			System.out.println(day + "" + month + "" + year);
			String sql = ("INSERT INTO usuarios (nombreCompleto, fechaNacimiento, ciudadResidencia) " + "VALUES ('"
					+ u.getNombre() + "', '" + year + "-" + month + "-" + day + "', '" + u.getCiudadResidencia()
					+ "');");
			Connection con = DriverManager.getConnection(BBDD, USER, PASSWORD);
			Statement st = con.createStatement();
			st.executeUpdate(sql);

			st.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Excepci�n SQL :" + e.toString());
		}
	}

	@Override
	public void bajaUsuario(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<Usuario> obtenerListaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarUsuario(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void altaPelicula(Pelicula p) {
		String sql = "INSERT INTO peliculas (nombre,anyo,idCat)VALUES(?,?,?);";
		PreparedStatement ps;

		try {
			cargarConexion();
			ps = conexion.prepareStatement(sql);
			ps.setString(1, p.getNombre());
			ps.setInt(2, p.getAnyo());
			ps.setInt(3, p.getCat());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conexion.isClosed()) {
					cerrarConexion();
				}
			} catch (SQLException e) {
				System.out.println("Fallo a cerrar la conexion");
			}
		}
	}

	@Override
	public void bajaPelicula(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<Pelicula> obtenerListaPelicula() {
		ArrayList<Pelicula> lista =null;
		try {
			lista = new ArrayList<Pelicula>();
			String sql = "SELECT * FROM peliculas;";
			Connection con = DriverManager.getConnection(BBDD, USER, PASSWORD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				lista.add(new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
			st.close();
			rs.close();			
		} catch (SQLException e) {
			System.out.println("Error con base de datos: " + e.toString());
		} finally {
			try {
				if (!conexion.isClosed()) {
					cerrarConexion();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lista;
	}
	
	
	//*********************************
	//TERMINAR
	public ArrayList<Pelicula> obtenerListaPeliculasSuscritas() {
		ArrayList<Pelicula> lista =null;
		try {
			lista = new ArrayList<Pelicula>();
			String sql = "SELECT idCategoria FROM suscripciones WHERE suscripciones.idusuario=;";
			Connection con = DriverManager.getConnection(BBDD, USER, PASSWORD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				lista.add(new Pelicula(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
			st.close();
			rs.close();			
		} catch (SQLException e) {
			System.out.println("Error con base de datos: " + e.toString());
		} finally {
			try {
				if (!conexion.isClosed()) {
					cerrarConexion();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lista;
	}
	//*************************************
	

	@Override
	public void modificarPelicula(int id) {
		// TODO Auto-generated method stub
	}

	private void cargarConexion() throws SQLException {
		conexion = DriverManager.getConnection(BBDD, USER, PASSWORD);
	}

	public void cerrarConexion() throws SQLException {
		conexion.close();
	}
}
