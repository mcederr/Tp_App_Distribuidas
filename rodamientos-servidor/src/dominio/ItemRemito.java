package dominio;

import serializado.ItemRemitoTO;

public class ItemRemito {

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
	public ItemRemitoTO crearItemRemitoTO(ItemRemito itemRemito){
		ItemRemitoTO itemTO = new ItemRemitoTO();
		itemTO.setRodamiento(itemRemito.getRodamiento().crearRodamientoTO(itemRemito.getRodamiento()));
		itemTO.setCantidad(itemRemito.getCantidad());
		
		return itemTO;
	}
}
