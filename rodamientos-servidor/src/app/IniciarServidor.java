package app;

import bean.srv.SolicitudCotizacionSRV;

public class IniciarServidor {
    
	public static void main(String[] args) {
		System.setProperty("java.security.policy", "java.policy");
		if(System.getSecurityManager() == null) {
            //System.setSecurityManager(new SecurityManager());
        } 
		
		new BS().publicarServicio();
		//TO DO: HACER UN TEST DESDE PRESENTACION Y MOVER ESTO
		SolicitudCotizacionSRV sc = new SolicitudCotizacionSRV();
	}
}
