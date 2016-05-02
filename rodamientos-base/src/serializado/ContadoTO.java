package serializado;

import java.io.Serializable;

public class ContadoTO extends FormaDePagoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Float descuento;
	
	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}
}
