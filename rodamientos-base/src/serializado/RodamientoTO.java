package serializado;

import java.io.Serializable;


public class RodamientoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String prefijo;
	private String sufijo;
	private MarcaTO marca;
	private String serie;
	
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
	public MarcaTO getMarca() {
		return marca;
	}
	public void setMarca(MarcaTO marca) {
		this.marca = marca;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
}
