package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CotizacionTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClienteTO cliente;
	private Date fechaCreacion;
	private Double total;
	private Date fechaVigencia;
	private List<ItemCotizacionTO> itemsCotizacion = new ArrayList<ItemCotizacionTO>();
	private Boolean estaVigente;
	
	public ClienteTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteTO cliente) {
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
	public List<ItemCotizacionTO> getItemsCotizacion() {
		return itemsCotizacion;
	}
	public void setItemsCotizacion(List<ItemCotizacionTO> itemsCotizacion) {
		this.itemsCotizacion = itemsCotizacion;
	}
	public Boolean getEstaVigente() {
		return estaVigente;
	}
	public void setEstaVigente(Boolean estaVigente) {
		this.estaVigente = estaVigente;
	}
		
}
