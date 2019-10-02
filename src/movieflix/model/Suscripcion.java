package movieflix.model;

/**
* 
* Esta clase define el objeto "Suscripción" que liga los objetos películas y usuarios
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
	 * Método get de id
	 * @return retorna el id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * Método set de id
	 * @params id de la suscripción
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * Método get de idUsuario
	 * @return idUsuario de la suscripción
	 */
	public int getIdUsusario() {
		return idUsusario;
	}
	/**
	 * 
	 * Método set de idUsuario
	 * @params idUsuario de la suscripción
	 */
	public void setIdUsusario(int idUsusario) {
		this.idUsusario = idUsusario;
	}
	/**
	 * 
	 * Método get de idCategoría
	 * @return idCategoría de la categoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}
	/**
	 * 
	 * Método set de la categoría
	 * @params idCategoría el Id de la categoría
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
