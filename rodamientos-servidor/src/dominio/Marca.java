package dominio;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import serializado.MarcaTO;

@Embeddable
public class Marca {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Origen")
	private String origen;
	@Column(name="Categoria")
	private String categoria;
	
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
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public MarcaTO crearMarcaTO(Marca m) {
		MarcaTO marcaTO = new MarcaTO();
		marcaTO.setCategoria(m.getCategoria());
		marcaTO.setNombre(m.getNombre());
		marcaTO.setOrigen(m.getOrigen());
		
		return marcaTO;
	}
}
