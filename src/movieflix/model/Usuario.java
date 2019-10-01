package movieflix.model;

import java.util.Date;

public class Usuario {
	private int id;
	private String nombre;
	private Date fechaNacimiento;
	private String ciudadResidencia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCiudadResidencia() {
		return ciudadResidencia;
	}
	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}	
	
	public Usuario(String nombre, Date fechaNacimiento, String ciudadResidencia) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadResidencia = ciudadResidencia;
	}
	
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
	public Usuario(int id, String nombre, Date fechaNacimiento, String ciudadResidencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadResidencia = ciudadResidencia;
	}
}
