package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ClienteTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String razonSocial;
	private DireccionTO direccion;
	private String telefono;
	private String cuit;
	private List<SolicitudCotizacionTO> solicitudesCotizacion = new ArrayList<SolicitudCotizacionTO>();
	private CondicionVentaTO condcondicionVenta;
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public DireccionTO getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionTO direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public List<SolicitudCotizacionTO> getSolicitudesCotizacion() {
		return solicitudesCotizacion;
	}
	public void setSolicitudesCotizacion(
			List<SolicitudCotizacionTO> solicitudesCotizacion) {
		this.solicitudesCotizacion = solicitudesCotizacion;
	}
	public CondicionVentaTO getCondcondicionVenta() {
		return condcondicionVenta;
	}
	public void setCondcondicionVenta(CondicionVentaTO condcondicionVenta) {
		this.condcondicionVenta = condcondicionVenta;
	}
}
