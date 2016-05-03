package dominio;

import serializado.MarcaTO;


public class Marca {

	private int id;
	private String nombre;
	private String origen;
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
