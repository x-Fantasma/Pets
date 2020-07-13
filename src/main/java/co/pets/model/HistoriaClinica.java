package co.pets.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "historiaClinica")
public class HistoriaClinica implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;	
	@Column(name = "estado", nullable = false, length = 50)
	private String estado;
	@Column(name = "condicionCorporal", nullable = false, length = 50)
	private String condicionCorporal;
	@Column(name = "observaciones", nullable = true, length = 2000)
	private String observaciones;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "codigo_mascota")
	private Mascota mascota;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCondicionCorporal() {
		return condicionCorporal;
	}

	public void setCondicionCorporal(String condicionCorporal) {
		this.condicionCorporal = condicionCorporal;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
}
