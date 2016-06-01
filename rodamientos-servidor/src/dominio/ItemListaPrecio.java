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
import javax.persistence.Table;

import serializado.ItemListaPrecioTO;
import serializado.ItemOrdenCompraTO;

@Entity @Table(name="Item_ListaPrecio")
public class ItemListaPrecio {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_Rodamiento")
	private Rodamiento rodamiento;
	
	@Column (name="Precio")
	private Double precio;
	
	@Column(name="Stock")
	private int stock;
	
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public ItemListaPrecioTO crearItemListaPrecioTO(ItemListaPrecio item){
		ItemListaPrecioTO itemTO = new ItemListaPrecioTO();
		itemTO.setRodamiento(item.getRodamiento().crearRodamientoTO(item.getRodamiento()));
		itemTO.setPrecio(item.getPrecio());
		itemTO.setStock(item.getStock());
		
		return itemTO;
	}
}
