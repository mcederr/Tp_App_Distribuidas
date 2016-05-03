package dominio;

import serializado.DireccionTO;

public class Direccion {

	private int id;
	private String localidad;
	private String calle;
	private int numero;
	private String codigoPostal;
	private String provincia;
	private String pais;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public DireccionTO crearDireccionTO(Direccion d){
		DireccionTO dto = new DireccionTO();
		dto.setCalle(d.getCalle());
		dto.setCodigoPostal(d.getCodigoPostal());
		dto.setLocalidad(d.getLocalidad());
		dto.setNumero(d.getNumero());
		dto.setPais(d.getPais());
		dto.setProvincia(d.getProvincia());
		
		return dto;
	}
}
