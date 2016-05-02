package dominio;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {

	private int id;
	private String razonSocial;
	private Direccion direccion;
	private String telefono;
	private String mail;
	private List<ListaPrecio> listasPrecios = new ArrayList<ListaPrecio>();
	private CondicionCompra condicionCompra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<ListaPrecio> getListasPrecios() {
		return listasPrecios;
	}
	public void setListasPrecios(List<ListaPrecio> listasPrecios) {
		this.listasPrecios = listasPrecios;
	}
	
}
