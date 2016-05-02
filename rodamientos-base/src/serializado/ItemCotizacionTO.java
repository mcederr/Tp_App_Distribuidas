package serializado;

import java.io.Serializable;

public class ItemCotizacionTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RodamientoTO rodamiento;
	private int cantidad;
	private Double precio;
	private ListaPrecioTO listaPrecio;
	
	public RodamientoTO getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(RodamientoTO rodamiento) {
		this.rodamiento = rodamiento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public ListaPrecioTO getListaPrecio() {
		return listaPrecio;
	}
	public void setListaPrecio(ListaPrecioTO listaPrecio) {
		this.listaPrecio = listaPrecio;
	}
	
}
