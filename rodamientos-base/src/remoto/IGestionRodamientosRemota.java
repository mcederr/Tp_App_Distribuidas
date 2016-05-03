package remoto;

import java.rmi.Remote;
import java.rmi.RemoteException;

import remoto.persistencia.Persistencia;

public interface IGestionRodamientosRemota extends Persistencia, Remote{
	//
	public static final String SERVICIO_RMI = "//localhost/GestionRodamientos";
	
	public int prueba(int a) throws RemoteException;
	
}
