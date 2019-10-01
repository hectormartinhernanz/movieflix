package movieflix.model;
import java.util.Date;

/**
* 
* Esta clase define al usuario que es uno de los elementos clave de la gestión de MovieFlix (Marca Registrada)
* 
* @author: Rafael Ruiz
* @version: 30/09/2019
* 
* 
*/

public class Usuario {
	private int id;
	private String nombre;
	private Date fechaNacimiento;
	private String ciudadResidencia;
	
	/**
	* Método get id
	*  @return retorna el id del usuario, forma unívoca de identificar al usuario
	*/
	public int getId() {
		return id;
	}
	/**
	* Método set id
	*  @params el id del usuario
	*/
	public void setId(int id) {
		this.id = id;
	}
	/**
	* Método get id
	*  @return retorna el nombre de usuario
	*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	* Método get id
	*  @return retorna la fecha de nacimiento del usuario
	*/
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	* Método set de la fecha de nacimiento
	*  @params retorna la ciudad de residencia
	*/
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	* Método get ciudad de residencia
	*  @return retorna la ciudad de residencia
	*/
	public String getCiudadResidencia() {
		return ciudadResidencia;
	}
	
	/**
	* Método set de la cidudad de nacimiento
	*  @params retorna la ciudad de residencia
	*/
	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}
	
	/**
	* 
	* Constructor de la clase usuario utilizando los parámetro de ID, NOMBRE y FECHA DE NACIMIENTO
	* @params: Id de usuario, nombre y fecha de nacimiento
	*  
	*/
	public Usuario(int id, String nombre, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	* 
	* Constructor de la clase usuario utilizando los parámetro de ID, NOMBRE, FECHA DE NACIMIENTO y CIUDAD DE RESIDENCIA
	* @params: Id de usuario, nombre, fecha de nacimiento y ciudad de residencia
	*  
	*/
	public Usuario(int id, String nombre, Date fechaNacimiento, String ciudadResidencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadResidencia = ciudadResidencia;
	}
}
