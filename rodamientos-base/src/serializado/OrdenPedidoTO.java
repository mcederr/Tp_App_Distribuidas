package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenPedidoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ItemOrdenPedidoTO> itemsOrdenPedido = new ArrayList<ItemOrdenPedidoTO>();
	private Date fechaCreacion;
	private ClienteTO cliente;
	private String estado;
	
	public List<ItemOrdenPedidoTO> getItemsOrdenPedido() {
		return itemsOrdenPedido;
	}
	public void setItemsOrdenPedido(List<ItemOrdenPedidoTO> itemsOrdenPedido) {
		this.itemsOrdenPedido = itemsOrdenPedido;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public ClienteTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteTO cliente) {
		this.cliente = cliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
