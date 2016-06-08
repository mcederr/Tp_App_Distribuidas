package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import serializado.ProveedorTO;

@Entity @Table(name="Proveedores")

public class Proveedor {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Razon_Social")
	private String razonSocial;
	@Embedded
	private Direccion direccion;
	@Column(name="Telefono")
	private String telefono;
	
	@Column(name="Mail")
	private String mail;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_proveedor")
	private List<ListaPrecio> listasPrecios = new ArrayList<ListaPrecio>();
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_CondicionCompra")
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
	
	public CondicionCompra getCondicionCompra() {
		return condicionCompra;
	}
	public void setCondicionCompra(CondicionCompra condicionCompra) {
		this.condicionCompra = condicionCompra;
	}
	public ProveedorTO crearProveedorTO(Proveedor p){
		ProveedorTO pto = new ProveedorTO();
		pto.setCondicionCompra(p.getCondicionCompra().crearCondicionCompra(p.getCondicionCompra()));
		pto.setDireccion(p.getDireccion().crearDireccionTO(p.getDireccion()));
		
		//Falta la lista de precios
		
		pto.setMail(p.getMail());
		pto.setRazonSocial(p.getRazonSocial());
		pto.setTelefono(p.getTelefono());
		
		return pto;
	}
	
}
