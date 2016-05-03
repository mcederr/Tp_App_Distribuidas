package dominio;

import java.util.ArrayList;
import java.util.List;

import serializado.ItemSolicitudCotizacionTO;
import serializado.MarcaTO;
import serializado.RodamientoTO;
import serializado.SolicitudCotizacionTO;

public class SolicitudCotizacion {

	private int id;
	private List<ItemSolicitudCotizacion> itemsSolicitudCotizacion = new ArrayList<ItemSolicitudCotizacion>();
	private Double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ItemSolicitudCotizacion> getItemsSolicitudCotizacion() {
		return itemsSolicitudCotizacion;
	}
	public void setItemsSolicitudCotizacion(
			List<ItemSolicitudCotizacion> itemsSolicitudCotizacion) {
		this.itemsSolicitudCotizacion = itemsSolicitudCotizacion;
	}
	public void addItemsSolicitudCotizacion(ItemSolicitudCotizacion itemSolCot){
		this.itemsSolicitudCotizacion.add(itemSolCot);
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public SolicitudCotizacionTO crearSolicitudCotizacionTO(SolicitudCotizacion sc){
		SolicitudCotizacionTO scto = new SolicitudCotizacionTO();
		for (int i = 0; i < sc.getItemsSolicitudCotizacion().size(); i++) {
		
			ItemSolicitudCotizacionTO itemTO = sc.getItemsSolicitudCotizacion().get(i).crearItemSolicitudCotizacionTO(sc.getItemsSolicitudCotizacion().get(i));
			scto.addItemsSolicitudCotizacion(itemTO);
		}
		scto.setPrecio(sc.getPrecio());
		
		return scto;
	}
	
		
}
