package movieflix.model;

/**
* 
* Esta clase define el objeto "Suscripci�n" que liga los objetos pel�culas y usuarios
* 
* @author: Rafael Ruiz
* @version: 30/09/2019
* 
* 
*/

public class Suscripcion {
	private int id;
	private int idUsusario;
	private int idCategoria;
	
	/**
	 * 
	 * M�todo get de id
	 * @return retorna el id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * M�todo set de id
	 * @params id de la suscripci�n
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * M�todo get de idUsuario
	 * @return idUsuario de la suscripci�n
	 */
	public int getIdUsusario() {
		return idUsusario;
	}
	/**
	 * 
	 * M�todo set de idUsuario
	 * @params idUsuario de la suscripci�n
	 */
	public void setIdUsusario(int idUsusario) {
		this.idUsusario = idUsusario;
	}
	/**
	 * 
	 * M�todo get de idCategor�a
	 * @return idCategor�a de la categoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}
	/**
	 * 
	 * M�todo set de la categor�a
	 * @params idCategor�a el Id de la categor�a
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
