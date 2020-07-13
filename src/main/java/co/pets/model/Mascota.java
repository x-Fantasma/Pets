package co.pets.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import co.pets.exceptions.impl.MascotaExceptions;

@Entity
@Table(name = "mascota")
public class Mascota implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nroChip", nullable = false, length = 100)
	private String nroChip;
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	@Column(name = "especie", nullable = false, length = 20)
	private String especie;
	@Column(name = "peso", nullable = true, length = 20 )
	private float peso;
	@Column(name = "raza", nullable = false, length = 30)
	private String raza;
	@Column(name = "color", nullable = false, length = 20)
	private String color;
	@Column (name = "sexo", nullable = false, length = 10)
	private String sexo;
	@Column (name = "fechaNacimiento")
	private Date fechaNacimiento;
	@Column (name = "senasParticulares", nullable = true, length = 300)
	private String senasParticulares;
	@Column (name = "personalidad", nullable = true, length = 50)
	private String personalidad;
	@Column (name = "estado", nullable = false, length = 50)
	private String estado;
	@Column (name = "fechaIngreso")
	private Date fechaIngreso;
	
	@Transient
	private float edad;
	
	public Mascota() {
		this.fechaIngreso = new Date();
	}

	@Autowired
	public Mascota(String nombre, String especie, float peso, String raza, String color, String sexo, 
			String senasParticulares, String personalidad, String estado, float edad) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.peso = peso;
		this.raza = raza;
		this.color = color;
		this.sexo = sexo;
		this.senasParticulares = senasParticulares;
		this.personalidad = personalidad;
		this.estado = estado;
		this.edad = edad;
	}
	
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNroChip() {
		return nroChip;
	}
	public void setNroChip(String nroChip) {
		this.nroChip = nroChip;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setfechaNacimiento(float meses) throws MascotaExceptions {
		Date fechaHoy = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaHoy);
		calendar.add(Calendar.MONTH, (int) -meses);
		this.fechaNacimiento = calendar.getTime();
	}
	public String getSenasParticulares() {
		return senasParticulares;
	}
	public void setSenasParticulares(String señasParticulares) {
		this.senasParticulares = señasParticulares;
	}
	public String getPersonalidad() {
		return personalidad;
	}
	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getEdad() {
		return edad;
	}	
}
