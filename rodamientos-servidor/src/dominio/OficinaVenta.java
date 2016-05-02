package dominio;

import java.util.ArrayList;
import java.util.List;

public class OficinaVenta {

	private int id;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Cotizacion> cotizaciones = new ArrayList<Cotizacion>();
	private List<OrdenPedido> ordenesPedido = new ArrayList<OrdenPedido>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Cotizacion> getCotizaciones() {
		return cotizaciones;
	}
	public void setCotizaciones(List<Cotizacion> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}
	public List<OrdenPedido> getOrdenesPedido() {
		return ordenesPedido;
	}
	public void setOrdenesPedido(List<OrdenPedido> ordenesPedido) {
		this.ordenesPedido = ordenesPedido;
	}
}
