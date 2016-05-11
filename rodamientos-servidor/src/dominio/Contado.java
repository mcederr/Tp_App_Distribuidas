package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FORMA_DE_PAGO")
public class Contado extends FormaDePago {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="DESCUENTO")
	private Float descuento;

	public Float getDescuento() {
		return descuento;
	}
	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
