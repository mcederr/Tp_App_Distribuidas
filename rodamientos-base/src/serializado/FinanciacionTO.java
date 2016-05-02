package serializado;

import java.io.Serializable;

public class FinanciacionTO extends FormaDePagoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cantidadDias;
	private Float recargo;
		
	public int getCantidadDias() {
		return cantidadDias;
	}
	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	public Float getRecargo() {
		return recargo;
	}
	public void setRecargo(Float recargo) {
		this.recargo = recargo;
	}
	
}
