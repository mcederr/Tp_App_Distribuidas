package bean.srv;

import bean.dao.HibernateSolicitudCotizacionDAO;

public class SolicitudCotizacionSRV {
	private static HibernateSolicitudCotizacionDAO dao;
	static {
		dao = HibernateSolicitudCotizacionDAO.getInstancia();
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
