/*
 * @author: Rocio Borrazás
 * @version: 30/09/2019*/


package movieflix.model;

public class Pelicula {
	
	
	private int id;
	private String nombre;
	private int anyo;
	private int cat;

	public Pelicula(int id, String nombre, int anyo, int cat) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.anyo = anyo;
		this.cat = cat;
	}

	public Pelicula(String nombre, int anyo, int cat) {
		super();
		this.nombre = nombre;
		this.anyo = anyo;
		this.cat = cat;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public int getCat() {
		return cat;
	}
	public void setCat(int cat) {
		this.cat = cat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
