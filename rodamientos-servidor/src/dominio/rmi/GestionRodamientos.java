package dominio.rmi;
import java.rmi.RemoteException;

import remoto.IGestionRodamientosRemota;

public class GestionRodamientos implements IGestionRodamientosRemota{

	@Override
	public int prueba(int a) throws RemoteException {
		// TODO Auto-generated method stub
				
		return a + 1;
	}

	
}
