package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SolicitudCotizacionTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ItemSolicitudCotizacionTO> itemsSolicitudCotizacion = new ArrayList<ItemSolicitudCotizacionTO>();
	private Double precio;
	
	public List<ItemSolicitudCotizacionTO> getItemsSolicitudCotizacion() {
		return itemsSolicitudCotizacion;
	}
	public void setItemsSolicitudCotizacion(
			List<ItemSolicitudCotizacionTO> itemsSolicitudCotizacion) {
		this.itemsSolicitudCotizacion = itemsSolicitudCotizacion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	} 
		
}
