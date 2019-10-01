/**
* 
* Esta clase define el objeto "Pel�cula" que es uno de los elementos principales de la aplicaci�n y la base de datos
* 
* @author: Rocio Borraz�s
* @version: 30/09/2019
*/

package movieflix.model;

public class Pelicula {
	
	
	private int id, anyo;
	private String nombre;
	private Categoria cat;
	

	public int getId() {
		return id;
	}
	/**
	 * 
	 * M�todo set del id
	 * @param el par�metro id que identifica la pel�cula de forma un�voca
	 * 
	 */
	public void setId(int id) {
		this.id = id;
	}
	/** 
	 * M�todo get A�o
	 *@return retorna a�o
	 */ 
	public int getAnyo() {
		return anyo;
	}
	
	/**
	 * 
	 * M�todo set del a�o
	 * @param a�o 
	 * 
	 */
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	/**
	 * 
	 * M�todo get del nombre
	 * @return retorna nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * M�todo set del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
public String toString() {
	return"";
}
	
	
}
