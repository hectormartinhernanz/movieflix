package movieflix.datos;

import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public interface IDatos {
	public boolean altaUsuario();
	public boolean bajaUsuario();
	public ArrayList<Usuario> obtenerListaUsuario();
	public boolean modificarUsuario(Usuario u);
	
	public boolean altaPelicula();
	public boolean bajaPelicula();
	public ArrayList<Pelicula>obtenerListaPelicula();
	public boolean modificarPelicula(Pelicula p);
	
}
