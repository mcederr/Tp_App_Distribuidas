package dominio;

import serializado.ItemCotizacionTO;
import serializado.ItemFacturaTO;

public class ItemCotizacion {

	private int id;
	private Rodamiento rodamiento;
	private int cantidad;
	private Double precio;
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
