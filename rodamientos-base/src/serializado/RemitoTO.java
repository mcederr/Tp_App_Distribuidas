package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemitoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaCreacion;
	private List<OrdenPedidoTO> ordenesPedidos = new ArrayList<OrdenPedidoTO>();
	private List<ItemRemitoTO> itemsRemito = new ArrayList<ItemRemitoTO>();
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<OrdenPedidoTO> getOrdenesPedidos() {
		return ordenesPedidos;
	}
	public void setOrdenesPedidos(List<OrdenPedidoTO> ordenesPedidos) {
		this.ordenesPedidos = ordenesPedidos;
	}
	public List<ItemRemitoTO> getItemsRemito() {
		return itemsRemito;
	}
	public void setItemsRemito(List<ItemRemitoTO> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}
	
}
