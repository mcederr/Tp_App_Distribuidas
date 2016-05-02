package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cotizacion {

	private int id;
	private Cliente cliente;
	private Date fechaCreacion;
	private Double total;
	private Date fechaVigencia;
	private List<ItemCotizacion> itemsCotizacion = new ArrayList<ItemCotizacion>();
	private Boolean estaVigente;
	
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
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public List<ItemCotizacion> getItemsCotizacion() {
		return itemsCotizacion;
	}
	public void setItemsCotizacion(List<ItemCotizacion> itemsCotizacion) {
		this.itemsCotizacion = itemsCotizacion;
	}
	public Boolean getEstaVigente() {
		return estaVigente;
	}
	public void setEstaVigente(Boolean estaVigente) {
		this.estaVigente = estaVigente;
	}
		
}
