package dominio;

import serializado.ItemListaPrecioTO;
import serializado.ItemOrdenCompraTO;

public class ItemListaPrecio {

	private int id;
	private Rodamiento rodamiento;
	private Double precio;
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
