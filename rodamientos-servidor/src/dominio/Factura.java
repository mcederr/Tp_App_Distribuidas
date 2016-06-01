package dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="Facturas")
public class Factura {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Embedded
	private Cliente cliente;
	
	@Column(name="Total")
	private Double total;
	
	@Column(name="FechaCreacion")
	private Date fechaCreacion;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_FormaPago")
	private FormaDePago formaDePago;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_factura")
	List<ItemFactura> itemsfactura;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
}
