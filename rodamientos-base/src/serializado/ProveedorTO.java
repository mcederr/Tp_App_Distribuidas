package serializado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProveedorTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String razonSocial;
	private DireccionTO direccion;
	private String telefono;
	private String mail;
	private List<ListaPrecioTO> listasPrecios = new ArrayList<ListaPrecioTO>();
	private CondicionCompraTO condicionCompra;

	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public DireccionTO getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionTO direccion) {
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
	public List<ListaPrecioTO> getListasPrecios() {
		return listasPrecios;
	}
	public void setListasPrecios(List<ListaPrecioTO> listasPrecios) {
		this.listasPrecios = listasPrecios;
	}
	public CondicionCompraTO getCondicionCompra() {
		return condicionCompra;
	}
	public void setCondicionCompra(CondicionCompraTO condicionCompra) {
		this.condicionCompra = condicionCompra;
	}
	
}
