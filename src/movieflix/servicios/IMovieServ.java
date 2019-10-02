package movieflix.servicios;

import java.util.ArrayList;

import movieflix.model.Pelicula;
import movieflix.model.Usuario;

public interface IMovieServ {
	
	public boolean altaUsuario();
	public boolean bajaUsuario();
	public ArrayList<Usuario> mostrarListaUsuario();
	public boolean modificarUsuario(Usuario u);
	
	public boolean altaPelicula();
	public boolean bajaPelicula();
	//public ArrayList<Pelicula>mostrarListaPelicula();
	public boolean mostrarListaPelicula();
	public boolean modificarPelicula(Pelicula p);
	public void mostrarPeliculasSucritas(int id);

}
