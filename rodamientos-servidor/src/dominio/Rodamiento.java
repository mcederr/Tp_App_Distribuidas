package dominio;

import serializado.MarcaTO;
import serializado.RodamientoTO;


public class Rodamiento {

	private int id;
	private String prefijo;
	private String sufijo;
	private Marca marca;
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
