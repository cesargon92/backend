package cl.ejemplo.ejemplo2.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
public class Usaurio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private int idUsaurio;
	
	@Column(name = "primer_nombre", nullable = false, length = 255)
	private String primerNombre;
	
	@Column(name = "segundo_nombre", nullable = true, length = 255)
	private String segundoNombre;
	
	@Column(name = "apellido_paterno", nullable = false, length = 255)
	private String apellidoPaterno;
	
	@Column(name = "apellido_materno", nullable = true, length = 255)
	private String apellidoMaterno;
	
	@Column(name = "telefono", nullable = true, length = 30)
	private String telefono;
	
	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;
	
	public int getIdUsaurio() {
		return idUsaurio;
	}
	public void setIdUsaurio(int idUsaurio) {
		this.idUsaurio = idUsaurio;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
