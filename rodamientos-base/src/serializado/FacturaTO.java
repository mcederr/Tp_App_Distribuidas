package serializado;

import java.io.Serializable;
import java.util.Date;

public class FacturaTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClienteTO cliente;
	private Double total;
	private Date fechaCreacion;
	private FormaDePagoTO formaDePago;

	public ClienteTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteTO cliente) {
		this.cliente = cliente;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public FormaDePagoTO getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePagoTO formaDePago) {
		this.formaDePago = formaDePago;
	}
}
