package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import serializado.ItemSolicitudCotizacionTO;
import serializado.SolicitudCotizacionTO;

@Entity
@Table(name="SOLICITUD_COTIZACION")
public class SolicitudCotizacion {

	@Id @Column(name="ID", columnDefinition="smallint")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_SOLICITUD_COTIZACION")
	private List<ItemSolicitudCotizacion> itemsSolicitudCotizacion = new ArrayList<ItemSolicitudCotizacion>();
	
	@Column(name="PRECIO")
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
