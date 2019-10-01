/**
* 
* Esta clase define el objeto "Categoría" que es uno de los elementos principales de la aplicación y la base de datos
* 
* @author: Pedro Javier Umpiérrez Fernández
* @version: 30/09/2019
* 
* 
* 
*/

package movieflix.model;

public class Categoria {
	
	private String id;
	private String nombre;
	
	/**
	 * 
	 * Método constructor vacío por defecto
	 */
	public Categoria () {
		super();	
	}
	
	/**
	 * 
	 * Método get de id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 
	 * @param id es el identificador unívoco del objeto Categoría
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	/**
	 * 
	 * Método get de nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre es la categoría
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * 
	 * Método to String por defecto
	 */
	public String toString() {
		return "";
		
		
	}

}
