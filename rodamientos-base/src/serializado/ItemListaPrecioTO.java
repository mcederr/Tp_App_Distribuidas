package serializado;

import java.io.Serializable;

public class ItemListaPrecioTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RodamientoTO rodamiento;
	private Double precio;
	private int stock;

	public RodamientoTO getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(RodamientoTO rodamiento) {
		this.rodamiento = rodamiento;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
