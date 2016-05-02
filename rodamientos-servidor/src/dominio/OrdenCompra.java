package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenCompra {

	private int id;
	private Proveedor proveedor;
	private Date fechaCreacion;
	private String estado;
	private List<OrdenPedido> ordenesPedidos = new ArrayList<OrdenPedido>();
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
