package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import serializado.ClienteTO;

@Entity
@Table(name="CLIENTE")
public class Cliente{

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;
	
	@Transient private Direccion direccion;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@Column(name="CUIT")
	private String cuit;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<SolicitudCotizacion> solicitudesCotizacion = new ArrayList<SolicitudCotizacion>();
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_CONDICION_COMPRA")
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
