package movieflix.model;

public class Pelicula {
	
	
	
	private int id, anyo;
	private String nombre;
	private Categoria cat;

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
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
