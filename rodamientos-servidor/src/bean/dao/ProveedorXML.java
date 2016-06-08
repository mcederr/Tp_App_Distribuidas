package bean.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;









import dominio.CondicionCompra;
import dominio.DescuentoEspecial;
import dominio.Direccion;
import dominio.FormaDePago;
import dominio.ListaPrecio;
import dominio.OrdenPedido;
import dominio.Proveedor;
import dominio.SolicitudCotizacion;

public class ProveedorXML {

	
	static final String ARCHIVO = "Proveedor.xml";

	public Proveedor leerXML() {

		Proveedor p=new Proveedor();
		ArrayList<ListaPrecio> lp = new ArrayList<ListaPrecio>();
		Direccion d=new Direccion();
		CondicionCompra con=new CondicionCompra();
		ListaPrecio l=new ListaPrecio();
		DescuentoEspecial des=new DescuentoEspecial();
		FormaDePago f=new FormaDePago();
		
		

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
				
				p.setDireccion(d);
				
				con.setTipo(node.getElementsByTagName("Tipo").item(0).getTextContent());
				con.setCoeficiente(Double.parseDouble(node.getElementsByTagName("Coeficiente").item(0).getTextContent()));
				
				f.setDescripcion(node.getElementsByTagName("Descripcion").item(0).getTextContent());
				con.setFormaDePago(f);
				
				p.setCondicionCompra(con);
				
				
				p.setRazonSocial(node.getElementsByTagName("RazonSocial").item(0).getTextContent());
				p.setTelefono(node.getElementsByTagName("Telefono").item(0).getTextContent());
				p.setMail(node.getElementsByTagName("Mail").item(0).getTextContent());
				
			
//				NodeList lista=node.getElementsByTagName("ListaPrecio");
//				
//				for(int i=0;i<lista.getLength();i++)
//				{
//					
//					Element e= (Element) lista.item(i);
//					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//			        Date fechaDate = null;
//			        fechaDate = formato.parse(e.getElementsByTagName("Fecha").item(0).getTextContent());
//			        l.setFechaVigencia(fechaDate);
//					
//			        l.setEstaVigente(Boolean.parseBoolean(e.getElementsByTagName("Vigencia").item(0).getTextContent()));
//			        
//			       
//					des.setTipo(e.getElementsByTagName("Tipo").item(0).getTextContent());
//					des.setCoeficiente(Double.parseDouble(e.getElementsByTagName("Coeficiente").item(0).getTextContent()));
//					
//					l.setDescuentoEspecial(des);
//			        
//					lp.add(l);
//				}
//				
//				p.setListasPrecios(lp);
				
				
				
				
		
				
				
			
			
			

		} catch (Exception e) {

			// No se leyo el XML
			e.printStackTrace();

		}
		
		return p;

	}
	
	
	
}
