package bean.srv;

import dominio.Cliente;
import dominio.Cotizacion;
import dominio.ListaPrecio;
import dominio.OrdenPedido;
import dominio.Proveedor;
import dominio.SolicitudCotizacion;
import bean.dao.CotizacionXML;
import bean.dao.HibernateSolicitudCotizacionDAO;

public class SolicitudCotizacionSRV {
	private static HibernateSolicitudCotizacionDAO dao;
	static {
		dao = HibernateSolicitudCotizacionDAO.getInstancia();
	}
	
public void guardarSolicitud(SolicitudCotizacion solicitud){
		
		dao.guardarSolicitud(solicitud);
	
	}

public void guardarListaPrecio(ListaPrecio listaprecio){
	
	dao.guardarListaPrecio(listaprecio);

}

public void guardarOrdenPedido(OrdenPedido ordenpedido){
	
	dao.guardarOrdenPedido(ordenpedido);

}

public void guardarCliente(Cliente cliente){
	
	dao.guardarCliente(cliente);

}

public void guardarProveedor(Proveedor proveedor){
	
	dao.guardarProveedor(proveedor);

}

	
//	public List<Club> listClubes(){
//		return dao.listClubes();
//	}
//	
//	public List<Jugador> listJugadores(){
//		return dao.listJugadores();
//	}
//	
//	public List<Object[]> jugadoresPorClub(){
//		return dao.jugadoresPorClub();
//	}
}
