/**
* 
* Esta clase define el objeto "Película" que es uno de los elementos principales de la aplicación y la base de datos
* 
* @author: Rocio Borrazás
* @version: 30/09/2019
*/

package movieflix.model;

public class Pelicula {
	
	
	private int id, anyo;
	private String nombre;
	private Categoria cat;
	
	/** 
	 * Método get Id
	 *@return retorna id
	 */ 
	public int getId() {
		return id;
	}
	/**
	 * 
	 * Método set del id
	 * @param el parámetro id que identifica la película de forma unívoca
	 * 
	 */
	public void setId(int id) {
		this.id = id;
	}
	/** 
	 * Método get Año
	 *@return retorna año
	 */ 
	public int getAnyo() {
		return anyo;
	}
	
	/**
	 * 
	 * Método set del año
	 * @param año 
	 * 
	 */
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	/**
	 * 
	 * Método get de la categoría
	 * @return retorna categoria
	 */
	public Categoria getCat() {
		return cat;
	}
	
	/**
	 * 
	 * Método set de la categoría
	 * @param parámetro de la categoría
	 */
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	/**
	 * 
	 * Método get del nombre
	 * @return retorna nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * Método set del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
