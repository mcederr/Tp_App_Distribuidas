package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Remito {

	private int id;
	private Date fechaCreacion;
	private List<OrdenPedido> ordenesPedidos = new ArrayList<OrdenPedido>();
	private List<ItemRemito> itemsRemito = new ArrayList<ItemRemito>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<OrdenPedido> getOrdenesPedidos() {
		return ordenesPedidos;
	}
	public void setOrdenesPedidos(List<OrdenPedido> ordenesPedidos) {
		this.ordenesPedidos = ordenesPedidos;
	}
	public List<ItemRemito> getItemsRemito() {
		return itemsRemito;
	}
	public void setItemsRemito(List<ItemRemito> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}
	
}
