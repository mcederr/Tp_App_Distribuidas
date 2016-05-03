package dominio;

import serializado.ItemOrdenCompraTO;
import serializado.ItemOrdenPedidoTO;

public class ItemOrdenCompra {

	private int id;
	private Rodamiento rodamiento;
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
	public ItemOrdenCompraTO crearItemOrdenCompraTO(ItemOrdenCompra item){
		ItemOrdenCompraTO itemTO = new ItemOrdenCompraTO();
		itemTO.setRodamiento(item.getRodamiento().crearRodamientoTO(item.getRodamiento()));
		itemTO.setCantidad(item.getCantidad());
		
		return itemTO;
	}
}
