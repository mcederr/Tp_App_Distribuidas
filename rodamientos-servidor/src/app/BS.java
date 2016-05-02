package app;

import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dominio.rmi.GestionRodamientos;
import remoto.IGestionRodamientosRemota;


public class BS {
    
    public void publicarServicio() {
    	try {
    		IGestionRodamientosRemota rodamiento = new GestionRodamientos();
    		IGestionRodamientosRemota stub = (IGestionRodamientosRemota) UnicastRemoteObject.exportObject(rodamiento, 0);
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Naming.rebind(IGestionRodamientosRemota.SERVICIO_RMI, stub);
            verVinculos();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void verVinculos() {
        try {
      	  String[] vinculos = Naming.list( "" );
      	  System.out.println(InetAddress.getLocalHost().getHostAddress());
      	  for ( int i = 0; i < vinculos.length; i++ ){
      		System.out.print( "\n"+vinculos[i] );
      	  }
        }
        catch (Exception e) {
      	  e.printStackTrace();
        }
     }
    
    public void cerrar() {
		try {
			Naming.unbind("GestionRodamientos");
		} catch (Exception e) {
		} finally {
			System.exit(0);
		}
    }
}
