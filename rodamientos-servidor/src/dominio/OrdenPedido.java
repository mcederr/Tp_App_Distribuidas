package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenPedido {

	private int id;
	private List<ItemOrdenPedido> itemsOrdenPedido = new ArrayList<ItemOrdenPedido>();
	private Date fechaCreacion;
	private Cliente cliente;
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
