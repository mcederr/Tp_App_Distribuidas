package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenCompraTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProveedorTO proveedor;
	private Date fechaCreacion;
	private String estado;
	private List<OrdenPedidoTO> ordenesPedidos = new ArrayList<OrdenPedidoTO>();
	private List<ItemOrdenCompraTO> itemsOrdenCompra = new ArrayList<ItemOrdenCompraTO>();

	public ProveedorTO getProveedor() {
		return proveedor;
	}
	public void setProveedor(ProveedorTO proveedor) {
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
	public List<OrdenPedidoTO> getOrdenesPedidos() {
		return ordenesPedidos;
	}
	public void setOrdenesPedidos(List<OrdenPedidoTO> ordenesPedidos) {
		this.ordenesPedidos = ordenesPedidos;
	}
	public List<ItemOrdenCompraTO> getItemsOrdenCompra() {
		return itemsOrdenCompra;
	}
	public void setItemsOrdenCompra(List<ItemOrdenCompraTO> itemsOrdenCompra) {
		this.itemsOrdenCompra = itemsOrdenCompra;
	}
	
}
