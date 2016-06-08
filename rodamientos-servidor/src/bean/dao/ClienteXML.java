package bean.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import dominio.Cliente;
import dominio.CondicionVenta;
import dominio.Direccion;
import dominio.ItemSolicitudCotizacion;
import dominio.Marca;
import dominio.OrdenPedido;
import dominio.Rodamiento;
import dominio.SolicitudCotizacion;

public class ClienteXML {

	static final String ARCHIVO = "Cliente.xml";

	public Cliente leerXML() {

		Cliente c=new Cliente();
		SolicitudCotizacion solcot=new SolicitudCotizacion();
		ArrayList<SolicitudCotizacion> sol = new ArrayList<SolicitudCotizacion>();
		ArrayList<OrdenPedido> ordped= new ArrayList<OrdenPedido>();
		Direccion d=new Direccion();
		CondicionVenta con=new CondicionVenta();
		OrdenPedido op=new OrdenPedido();
		

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			
			DocumentBuilder builder = factory.newDocumentBuilder();

		
			Document doc = builder.parse(ARCHIVO);

			// Obtengo el nodo RAIZ
			Element node = doc.getDocumentElement();
			
		
			
			
				
				d.setLocalidad(node.getElementsByTagName("Localidad").item(0).getTextContent());
				d.setCalle(node.getElementsByTagName("Calle").item(0).getTextContent());
				d.setCodigoPostal(node.getElementsByTagName("CP").item(0).getTextContent());
				d.setNumero(Integer.parseInt(node.getElementsByTagName("Numero").item(0).getTextContent()));
				d.setProvincia(node.getElementsByTagName("Provincia").item(0).getTextContent());
				d.setPais(node.getElementsByTagName("Pais").item(0).getTextContent());
				
				c.setDireccion(d);
				
				con.setTipo(node.getElementsByTagName("Tipo").item(0).getTextContent());
				con.setCoeficiente(Double.parseDouble(node.getElementsByTagName("Coeficiente").item(0).getTextContent()));
				
				c.setCondcondicionVenta(con);
				
				c.setCuit(node.getElementsByTagName("Cuit").item(0).getTextContent());
				c.setRazonSocial(node.getElementsByTagName("RazonSocial").item(0).getTextContent());
				c.setTelefono(node.getElementsByTagName("Telefono").item(0).getTextContent());
				
			
				NodeList lista=node.getElementsByTagName("SolicitudCotizacion");
				
				for(int i=0;i<lista.getLength();i++)
				{
					
					Element e= (Element) lista.item(i);
					solcot.setPrecio(Double.parseDouble(e.getElementsByTagName("Precio").item(0).getTextContent()));
					
					sol.add(solcot);
				}
				
				c.setSolicitudesCotizacion(sol);
				
				
				
		
				
				
			
			
			

		} catch (Exception e) {

			// No se leyo el XML
			e.printStackTrace();

		}
		
		return c;

	}
	
	
	
	
	
	
}
