package dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import serializado.MarcaTO;
import serializado.RodamientoTO;

@Entity
@Table(name="RODAMIENTO")
public class Rodamiento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", columnDefinition="smallint")
	private int id;
	
	@Column(name="PREFIJO")
	private String prefijo;
	
	@Column(name="SUFIJO")
	private String sufijo;
	
//	@Column(name="MARCA")
	//@Transient 
	@Embedded 
	private Marca marca;
	
	@Column(name="SERIE")
	private String serie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getSufijo() {
		return sufijo;
	}
	public void setSufijo(String sufijo) {
		this.sufijo = sufijo;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public RodamientoTO crearRodamientoTO(Rodamiento r){
		
		MarcaTO mto = r.getMarca().crearMarcaTO(r.getMarca()); 
		RodamientoTO rto = new RodamientoTO();
		rto.setMarca(mto);
		rto.setPrefijo(r.getPrefijo());
		rto.setSerie(r.getSerie());
		rto.setSufijo(r.getSufijo());
		
		return rto;
		
	}
}
