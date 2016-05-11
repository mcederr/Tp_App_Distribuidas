package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Financiacion extends FormaDePago{

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="CANTIDAD_DIAS")
	private int cantidadDias;
	
	@Column(name="RECARGO")
	private Float recargo;
	
	public int getCantidadDias() {
		return cantidadDias;
	}
	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	public Float getRecargo() {
		return recargo;
	}
	public void setRecargo(Float recargo) {
		this.recargo = recargo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
