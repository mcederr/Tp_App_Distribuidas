package dominio;

import serializado.ItemFacturaTO;

public class ItemFactura {

	private int id;
	private Rodamiento rodamiento;
	private int cantidad;
	private Double precio;
	
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
	public ItemFacturaTO crearItemListaPrecioTO(ItemFactura item){
		ItemFacturaTO itemTO = new ItemFacturaTO();
		itemTO.setRodamiento(item.getRodamiento().crearRodamientoTO(item.getRodamiento()));
		itemTO.setPrecio(item.getPrecio());
		itemTO.setCantidad(item.getCantidad());
		
		return itemTO;
	}
}
