package inicio;

import bean.dao.CotizacionXML;
import bean.dao.SolicitudCotizacionXML;
import dominio.SolicitudCotizacion;
import bean.srv.SolicitudCotizacionSRV;

public class main {

	public static void main(String[] args) {
		
		//Obtengo los datos cargados en el XML
		SolicitudCotizacionXML a = new SolicitudCotizacionXML();
		SolicitudCotizacion sc = a.leerXML();
		
		
		//Lo guardo en la b.datos
		SolicitudCotizacionSRV scsrv = new SolicitudCotizacionSRV();
		scsrv.guardarSolicitud(sc);
		
		CotizacionXML c=new CotizacionXML();
		c.saveDomXML();
		
		c.guardarDatosCotizacionXML();
		
		
	}

}
