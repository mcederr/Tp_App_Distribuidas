package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OficinaVentaTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ClienteTO> clientes = new ArrayList<ClienteTO>();
	private List<CotizacionTO> cotizaciones = new ArrayList<CotizacionTO>();
	private List<OrdenPedidoTO> ordenesPedido = new ArrayList<OrdenPedidoTO>();

	public List<ClienteTO> getClientes() {
		return clientes;
	}
	public void setClientes(List<ClienteTO> clientes) {
		this.clientes = clientes;
	}
	public List<CotizacionTO> getCotizaciones() {
		return cotizaciones;
	}
	public void setCotizaciones(List<CotizacionTO> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}
	public List<OrdenPedidoTO> getOrdenesPedido() {
		return ordenesPedido;
	}
	public void setOrdenesPedido(List<OrdenPedidoTO> ordenesPedido) {
		this.ordenesPedido = ordenesPedido;
	}
}
