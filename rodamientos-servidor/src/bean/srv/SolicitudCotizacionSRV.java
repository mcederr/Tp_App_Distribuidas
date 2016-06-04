package bean.srv;

import dominio.Cotizacion;
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
