package movieflix.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public class Datos implements IDatos{
	
	private final static String BBDD="jdbc:mysql://10.90.36.111/movieflix";
	private final static String USER="root";
	private final static String PASSWORD="password";
	private Connection conexion;
	
	@Override
	public boolean altaUsuario(Usuario u) {
		// TODO Auto-generated method stub
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
