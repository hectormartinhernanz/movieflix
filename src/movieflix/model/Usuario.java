package movieflix.model;
import java.util.Date;

/**
* 
* Esta clase define al usuario que es uno de los elementos clave de la gesti�n de MovieFlix (Marca Registrada)
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
	* M�todo get id
	*  @return retorna el id del usuario, forma un�voca de identificar al usuario
	*/
	public int getId() {
		return id;
	}
	/**
	* M�todo set id
	*  @params el id del usuario
	*/
	public void setId(int id) {
		this.id = id;
	}
	/**
	* M�todo get id
	*  @return retorna el nombre de usuario
	*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	* M�todo get id
	*  @return retorna la fecha de nacimiento del usuario
	*/
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	* M�todo set de la fecha de nacimiento
	*  @params retorna la ciudad de residencia
	*/
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	* M�todo get ciudad de residencia
	*  @return retorna la ciudad de residencia
	*/
	public String getCiudadResidencia() {
		return ciudadResidencia;
	}
	
	/**
	* M�todo set de la cidudad de nacimiento
	*  @params retorna la ciudad de residencia
	*/
	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}	
	
	public Usuario(String nombre, Date fechaNacimiento, String ciudadResidencia) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadResidencia = ciudadResidencia;
	}
	
	/**
	* 
	* Constructor de la clase usuario utilizando los par�metro de ID, NOMBRE y FECHA DE NACIMIENTO
	* @params: Id de usuario, nombre y fecha de nacimiento
	*  
	*/
	public Usuario(String nombre, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		
	}	
	
	public Usuario(int id, String nombre, Date fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	* 
	* Constructor de la clase usuario utilizando los par�metro de ID, NOMBRE, FECHA DE NACIMIENTO y CIUDAD DE RESIDENCIA
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
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciudadResidencia=" + ciudadResidencia + "]";
	}
	
	
	
}
