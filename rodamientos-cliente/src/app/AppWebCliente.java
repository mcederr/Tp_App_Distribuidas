package app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import remoto.IGestionRodamientosRemota;

public class AppWebCliente {

	private IGestionRodamientosRemota gestionRodamientos;
	
	public AppWebCliente() {
		this.gestionRodamientos = obtenerStub();
	}
	
	private IGestionRodamientosRemota obtenerStub(){
		try {
			return (IGestionRodamientosRemota) (Naming.lookup("//localhost/GestionRodamientos"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private void calcular(int a){
		try {
			System.out.println(a + " + " + 1 + " : " + gestionRodamientos.prueba(a));
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AppWebCliente().calcular(4);
	}

}
