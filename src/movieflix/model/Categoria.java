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
	
	private int id;
	private String nombre;
	
	/**
	 * 
	 * M�todo constructor vac�o por defecto
	 */
	
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
