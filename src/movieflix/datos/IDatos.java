package movieflix.datos;

import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public interface IDatos {
	public void altaUsuario(Usuario u);
	public void bajaUsuario(int id);
	public ArrayList<Usuario> obtenerListaUsuario();
	public void modificarUsuario(Usuario u);
	public void mostrarUsuario(int id);
	public void altaPelicula(Pelicula p);
	public void bajaPelicula(int id);
	public ArrayList<Pelicula>obtenerListaPelicula();
	public void modificarPelicula(Pelicula p);
}
