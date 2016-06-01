package dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import serializado.ItemCotizacionTO;
import serializado.ItemFacturaTO;

@Entity
@Table(name="ITEM_COTIZACION")
public class ItemCotizacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_Rodamiento")
	private Rodamiento rodamiento;
	
	@Column(name="CANTIDAD")
	private int cantidad;
	
	@Column(name="PRECIO")
	private Double precio;
	
	@ManyToOne()
	@JoinColumn(name="Id_ListaPrecio")
	private ListaPrecio listaPrecio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Rodamiento getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public ListaPrecio getListaPrecio() {
		return listaPrecio;
	}
	public void setListaPrecio(ListaPrecio listaPrecio) {
		this.listaPrecio = listaPrecio;
	}
	public ItemCotizacionTO crearItemCotizacionTO(ItemCotizacion item){
		ItemCotizacionTO itemTO = new ItemCotizacionTO();
		itemTO.setRodamiento(item.getRodamiento().crearRodamientoTO(item.getRodamiento()));
		itemTO.setPrecio(item.getPrecio());
		itemTO.setCantidad(item.getCantidad());
		
		//Falta la lista de precio
		
		return itemTO;
	}
}
