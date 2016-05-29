package dominio;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import serializado.ItemRemitoTO;

@Entity 
@Table(name="ItemRemito")
public class ItemRemito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Embedded
	private Rodamiento rodamiento;
	
	@Column(name="Cantidad")
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
	public ItemRemitoTO crearItemRemitoTO(ItemRemito itemRemito){
		ItemRemitoTO itemTO = new ItemRemitoTO();
		itemTO.setRodamiento(itemRemito.getRodamiento().crearRodamientoTO(itemRemito.getRodamiento()));
		itemTO.setCantidad(itemRemito.getCantidad());
		
		return itemTO;
	}
}
