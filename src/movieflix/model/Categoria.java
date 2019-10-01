/*
 * @author: Pedro Javier Umpiérrez Fernández
 * @version: 30/09/2019*/


package movieflix.model;

public class Categoria {
	
	private int id;
	private String nombre;
	
	
	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Categoria () {
		super();	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "";
		
		
	}

}
