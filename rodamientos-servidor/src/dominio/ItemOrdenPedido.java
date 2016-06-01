package dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import serializado.ItemOrdenPedidoTO;
import serializado.ItemSolicitudCotizacionTO;

@Entity
@Table(name="ITEM_ORDEN_PEDIDO")
public class ItemOrdenPedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="ESTADO")
	private String estado;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_Rodamiento")
	private Rodamiento rodamiento;
	
	@Column(name="CANTIDAD")
	private int cantidad;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_COTIZACION")
	private Cotizacion cotizacion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public Cotizacion getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}
	public ItemOrdenPedidoTO crearItemOrdenPedidoTO(ItemOrdenPedido item){
		ItemOrdenPedidoTO itemTO = new ItemOrdenPedidoTO();
		itemTO.setRodamiento(item.getRodamiento().crearRodamientoTO(item.getRodamiento()));
		itemTO.setCantidad(item.getCantidad());
		
		return itemTO;
	}
}
