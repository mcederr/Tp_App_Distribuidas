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
import javax.persistence.Table;

@Entity 
@Table(name="Remito")
public class Remito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="FechaCreacion")
	private Date fechaCreacion;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idRemito")
	private List<OrdenPedido> ordenesPedidos = new ArrayList<OrdenPedido>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idRemito")
	private List<ItemRemito> itemsRemito = new ArrayList<ItemRemito>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<OrdenPedido> getOrdenesPedidos() {
		return ordenesPedidos;
	}
	public void setOrdenesPedidos(List<OrdenPedido> ordenesPedidos) {
		this.ordenesPedidos = ordenesPedidos;
	}
	public List<ItemRemito> getItemsRemito() {
		return itemsRemito;
	}
	public void setItemsRemito(List<ItemRemito> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}
	
}
