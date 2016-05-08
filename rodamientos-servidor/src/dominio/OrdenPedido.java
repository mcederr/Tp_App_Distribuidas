package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ORDEN_PEDIDO")
public class OrdenPedido {

	@Id @Column(name="ID", columnDefinition="smallint")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_ORDEN_PEDIDO")
	private List<ItemOrdenPedido> itemsOrdenPedido = new ArrayList<ItemOrdenPedido>();
	
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;
	
	@Transient private Cliente cliente;
	private String estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ItemOrdenPedido> getItemsOrdenPedido() {
		return itemsOrdenPedido;
	}
	public void setItemsOrdenPedido(List<ItemOrdenPedido> itemsOrdenPedido) {
		this.itemsOrdenPedido = itemsOrdenPedido;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
