package movieflix.servicios;

import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public interface IMovieServ {
	
	public void altaUsuario();
	public void bajaUsuario();
	public ArrayList<Usuario> mostrarListaUsuario();
	public boolean mostrarUsuario();
	public boolean modificarUsuario(Usuario u);
	
	public void altaPelicula();
	public void bajaPelicula();
	//public ArrayList<Pelicula>mostrarListaPelicula();
	public void mostrarListaPelicula();

}
