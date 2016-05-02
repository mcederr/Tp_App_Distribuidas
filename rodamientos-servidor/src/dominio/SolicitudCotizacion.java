package dominio;

import java.util.ArrayList;
import java.util.List;

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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	} 
		
}
