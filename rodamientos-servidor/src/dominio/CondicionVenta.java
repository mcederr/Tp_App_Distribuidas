package dominio;

import serializado.CondicionVentaTO;

public class CondicionVenta {

	private int id;
	private String tipo;
	private Double coeficiente;
	
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
	public CondicionVentaTO crearCondicionVenta(CondicionVenta cv){
		CondicionVentaTO cvto = new CondicionVentaTO();
		cvto.setCoeficiente(cv.getCoeficiente());
		cvto.setTipo(cv.getTipo());
		
		return cvto;
	}
}
