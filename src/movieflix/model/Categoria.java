/**
* 
* Esta clase define el objeto "Categor�a" que es uno de los elementos principales de la aplicaci�n y la base de datos
* 
* @author: Pedro Javier Umpi�rrez Fern�ndez
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
	 * M�todo constructor vac�o por defecto
	 */
	public Categoria () {
		super();	
	}
	
	/**
	 * 
	 * M�todo get de id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 
	 * @param id es el identificador un�voco del objeto Categor�a
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	/**
	 * 
	 * M�todo get de nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre es la categor�a
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * 
	 * M�todo to String por defecto
	 */
	public String toString() {
		return "";
		
		
	}

}
