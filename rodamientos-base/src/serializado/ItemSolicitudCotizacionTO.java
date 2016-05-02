package serializado;

import java.io.Serializable;


public class ItemSolicitudCotizacionTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RodamientoTO rodamiento;
	private int cantidad;

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

}
