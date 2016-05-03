package dominio;

import java.util.ArrayList;
import java.util.List;

import serializado.ClienteTO;


public class Cliente{

	private int id;
	private String razonSocial;
	private Direccion direccion;
	private String telefono;
	private String cuit;
	private List<SolicitudCotizacion> solicitudesCotizacion = new ArrayList<SolicitudCotizacion>();
	private CondicionVenta condcondicionVenta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
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
	public List<SolicitudCotizacion> getSolicitudesCotizacion() {
		return solicitudesCotizacion;
	}
	public void setSolicitudesCotizacion(
			List<SolicitudCotizacion> solicitudesCotizacion) {
		this.solicitudesCotizacion = solicitudesCotizacion;
	}
	public CondicionVenta getCondcondicionVenta() {
		return condcondicionVenta;
	}
	public void setCondcondicionVenta(CondicionVenta condcondicionVenta) {
		this.condcondicionVenta = condcondicionVenta;
	}
	public ClienteTO crearClienteTO(Cliente c){
		
		ClienteTO cto = new ClienteTO();
		cto.setCondcondicionVenta(c.getCondcondicionVenta().crearCondicionVenta(c.getCondcondicionVenta()));
		cto.setCuit(c.getCuit());
		cto.setDireccion(c.getDireccion().crearDireccionTO(c.getDireccion()));
		cto.setRazonSocial(c.getRazonSocial());
		for (int i = 0; i < c.getSolicitudesCotizacion().size(); i++) {
			cto.addSolicitudesCotizacion(c.getSolicitudesCotizacion().get(i).crearSolicitudCotizacionTO(c.getSolicitudesCotizacion().get(i)));
		}
		
		return cto;
		
	}
}
