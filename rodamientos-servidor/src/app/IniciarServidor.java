package app;

public class IniciarServidor {
    
	public static void main(String[] args) {
		System.setProperty("java.security.policy", "java.policy");
		if(System.getSecurityManager() == null) {
            //System.setSecurityManager(new SecurityManager());
        } 
		
		new BS().publicarServicio();
	}
}
