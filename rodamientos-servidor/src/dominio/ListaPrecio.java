package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaPrecio {

	private int id;
	private Date fechaVigencia;
	private Boolean estaVigente;
	private Proveedor proveedor;
	private List<ItemListaPrecio> itemsListaPrecio = new ArrayList<ItemListaPrecio>();
	private DescuentoEspecial descuentoEspecial;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public List<ItemListaPrecio> getItemsListaPrecio() {
		return itemsListaPrecio;
	}
	public void setItemsListaPrecio(List<ItemListaPrecio> itemsListaPrecio) {
		this.itemsListaPrecio = itemsListaPrecio;
	}
	public DescuentoEspecial getDescuentoEspecial() {
		return descuentoEspecial;
	}
	public void setDescuentoEspecial(DescuentoEspecial descuentoEspecial) {
		this.descuentoEspecial = descuentoEspecial;
	}
	
}
