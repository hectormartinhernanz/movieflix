package movieflix.datos;

import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public interface IDatos {
	public boolean altaUsuario(Usuario u);
	public boolean bajaUsuario(int id);
	public ArrayList<Usuario> obtenerListaUsuario();
	public ArrayList<Usuario> mostrarUsuario(int id);
	public boolean modificarUsuario(int id);
	
	public boolean altaPelicula(Pelicula p);
	public boolean bajaPelicula(int id);
	public ArrayList<Pelicula>obtenerListaPelicula();
	public boolean modificarPelicula(int id);
}
