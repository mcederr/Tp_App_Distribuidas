package dominio;

import serializado.CondicionCompraTO;
import serializado.CondicionVentaTO;

public class CondicionCompra {

	private int id;
	private String tipo;
	private Double coeficiente;
	private FormaDePago formaDePago;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	public CondicionCompraTO crearCondicionCompra(CondicionCompra cc){
		CondicionCompraTO ccto = new CondicionCompraTO();
		ccto.setCoeficiente(cc.getCoeficiente());
		ccto.setTipo(cc.getTipo());
		
		return ccto;
	}
}
