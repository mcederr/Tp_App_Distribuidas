package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaPrecioTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaVigencia;
	private Boolean estaVigente;
	private ProveedorTO proveedor;
	private List<ItemListaPrecioTO> itemsListaPrecio = new ArrayList<ItemListaPrecioTO>();
	private DescuentoEspecialTO descuentoEspecial;

	public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public Boolean getEstaVigente() {
		return estaVigente;
	}
	public void setEstaVigente(Boolean estaVigente) {
		this.estaVigente = estaVigente;
	}
	public ProveedorTO getProveedor() {
		return proveedor;
	}
	public void setProveedor(ProveedorTO proveedor) {
		this.proveedor = proveedor;
	}
	public List<ItemListaPrecioTO> getItemsListaPrecio() {
		return itemsListaPrecio;
	}
	public void setItemsListaPrecio(List<ItemListaPrecioTO> itemsListaPrecio) {
		this.itemsListaPrecio = itemsListaPrecio;
	}
	public DescuentoEspecialTO getDescuentoEspecial() {
		return descuentoEspecial;
	}
	public void setDescuentoEspecial(DescuentoEspecialTO descuentoEspecial) {
		this.descuentoEspecial = descuentoEspecial;
	}
	
}
