package dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import serializado.ItemSolicitudCotizacionTO;

@Entity
@Table(name="ITEM_SOLICITUD_COTIZACION")
public class ItemSolicitudCotizacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_Rodamiento")
	private Rodamiento rodamiento;
	
	@Column(name="CANTIDAD")
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
//		itemTO.setRodamiento(itemSoliCoti.getRodamiento().crearRodamientoTO(itemSoliCoti.getRodamiento()));
//		itemTO.setCantidad(itemSoliCoti.getCantidad());
		
		return itemTO;
	}
}
