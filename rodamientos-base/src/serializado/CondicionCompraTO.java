package serializado;

import java.io.Serializable;

public class CondicionCompraTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	private Double coeficiente;
	private FormaDePagoTO formaDePago;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getCoeficiente() {
		return coeficiente;
	}
	public void setCoeficiente(Double coeficiente) {
		this.coeficiente = coeficiente;
	}
	public FormaDePagoTO getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePagoTO formaDePago) {
		this.formaDePago = formaDePago;
	}
	
}
