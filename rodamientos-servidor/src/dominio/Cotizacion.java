package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="COTIZACION")
public class Cotizacion {

	@Id @Column(name="ID", columnDefinition="smallint")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_CLIENTE")
	private Cliente cliente;
	
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;
	
	@Column(name="TOTAL")
	private Double total;
	
	@Column(name="FECHAVIGENCIA")
	private Date fechaVigencia;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_COTIZACION")
	private List<ItemCotizacion> itemsCotizacion = new ArrayList<ItemCotizacion>();
	
	@Column(name="ESTA_VIGENTE")
	private Boolean estaVigente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public List<ItemCotizacion> getItemsCotizacion() {
		return itemsCotizacion;
	}
	public void setItemsCotizacion(List<ItemCotizacion> itemsCotizacion) {
		this.itemsCotizacion = itemsCotizacion;
	}
	public Boolean getEstaVigente() {
		return estaVigente;
	}
	public void setEstaVigente(Boolean estaVigente) {
		this.estaVigente = estaVigente;
	}
		
}
