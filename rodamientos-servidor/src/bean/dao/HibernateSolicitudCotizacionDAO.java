package bean.dao;

import hbt.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dominio.Cotizacion;
import dominio.SolicitudCotizacion;


public class HibernateSolicitudCotizacionDAO {
	private static HibernateSolicitudCotizacionDAO instancia = null;
	private static SessionFactory sf = null;

	public static HibernateSolicitudCotizacionDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateSolicitudCotizacionDAO();
		} 
		return instancia;
	}
	
	//Metodos que se pueden realizar contra la b.datos
		public void guardarSolicitud(SolicitudCotizacion solCotizacion){
			
			Session session = sf.openSession();
			session.beginTransaction();

			session.persist(solCotizacion);

			
			session.flush();
			session.getTransaction().commit();
			session.close();
		
		}
	
	
	
//	
//	@SuppressWarnings("unchecked")
//	public List<Club> listClubes(){
//		Session session = sf.openSession();
//		List<Club> list = session.createQuery("from Club").list();
//		session.close();
//		return list;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<Jugador> listJugadores(){
//		Session session = sf.openSession();
//		List<Jugador> list = session.createQuery(
//				"select j from Jugador j join j.club order by j.club")
//				.list();
//		session.close();
//		return list;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<Object[]> jugadoresPorClub(){
//		Session session = sf.openSession();
//		List<Object[]> list = session.createQuery(
//				"select j.club.nombre, count(*) from Jugador j join j.club  group by j.club.nombre")
//				.list();
//		session.close();
//		return list;
//	}
	

}
