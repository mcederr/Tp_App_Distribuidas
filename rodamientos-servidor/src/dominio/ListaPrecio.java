package dominio;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name="ListaPrecios")
public class ListaPrecio {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column (name="Fecha_vigencia", columnDefinition="Date")
	private Date fechaVigencia;
	@Column(name="Vigencia", columnDefinition="bit")
	private Boolean estaVigente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_Proveedor")
	private Proveedor proveedor;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idListaprecios")
	private List<ItemListaPrecio> itemsListaPrecio = new ArrayList<ItemListaPrecio>();
	
	@Embedded
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
