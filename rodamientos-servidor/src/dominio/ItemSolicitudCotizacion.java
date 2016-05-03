package dominio;

import serializado.ItemSolicitudCotizacionTO;


public class ItemSolicitudCotizacion {

	private int id;
	private Rodamiento rodamiento;
	private int cantidad;

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
	public ItemSolicitudCotizacionTO crearItemSolicitudCotizacionTO(ItemSolicitudCotizacion itemSoliCoti){
		ItemSolicitudCotizacionTO itemTO = new ItemSolicitudCotizacionTO();
		itemTO.setRodamiento(itemSoliCoti.getRodamiento().crearRodamientoTO(itemSoliCoti.getRodamiento()));
		itemTO.setCantidad(itemSoliCoti.getCantidad());
		
		return itemTO;
	}
}
