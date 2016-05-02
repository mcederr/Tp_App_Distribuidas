package serializado;

import java.io.Serializable;

public class ItemOrdenPedidoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String estado;
	private RodamientoTO rodamiento;
	private int cantidad;
	private CotizacionTO cotizacion;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
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
	public CotizacionTO getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(CotizacionTO cotizacion) {
		this.cotizacion = cotizacion;
	}
	
}
