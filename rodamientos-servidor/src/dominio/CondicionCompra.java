package dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionOfElements;

import serializado.CondicionCompraTO;

@Entity
@Table(name="CONDICION_COMPRA")
//@Embeddable
public class CondicionCompra {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="COEFICIENTE")
	private Double coeficiente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_FormaPago")
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
