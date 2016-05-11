package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import serializado.CondicionVentaTO;

@Entity
@Table(name="CONDICION_VENTA")
public class CondicionVenta {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="COEFICIENTE")
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
