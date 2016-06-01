package dominio;

import java.util.ArrayList;
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
import javax.persistence.Transient;

@Entity
@Table(name="ORDEN_COMPRA")
public class OrdenCompra {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_proveedor")
	private Proveedor proveedor;
	
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;
	
	@Column(name="ESTADO")
	private String estado;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_ORDEN_COMPRA")
	private List<OrdenPedido> ordenesPedidos = new ArrayList<OrdenPedido>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_ORDEN_COMPRA")
	private List<ItemOrdenCompra> itemsOrdenCompra = new ArrayList<ItemOrdenCompra>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<OrdenPedido> getOrdenesPedidos() {
		return ordenesPedidos;
	}
	public void setOrdenesPedidos(List<OrdenPedido> ordenesPedidos) {
		this.ordenesPedidos = ordenesPedidos;
	}
	public List<ItemOrdenCompra> getItemsOrdenCompra() {
		return itemsOrdenCompra;
	}
	public void setItemsOrdenCompra(List<ItemOrdenCompra> itemsOrdenCompra) {
		this.itemsOrdenCompra = itemsOrdenCompra;
	}
	
}
