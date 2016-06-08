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
import dominio.Cotizacion;
import dominio.Direccion;
import dominio.ItemOrdenPedido;
import dominio.ItemSolicitudCotizacion;
import dominio.Marca;
import dominio.OrdenPedido;
import dominio.Rodamiento;
import dominio.SolicitudCotizacion;

public class OrdenPedidoXML {

	
	static final String ARCHIVO = "ordenDePedido.xml";

	public OrdenPedido leerXML() {

		OrdenPedido o = new OrdenPedido();
		ArrayList<ItemOrdenPedido> items = new ArrayList<ItemOrdenPedido>();
		Rodamiento r = new Rodamiento ();
		Cotizacion cot=new Cotizacion();
		Marca m = new Marca();
		Cliente c=new Cliente();
		Direccion d=new Direccion();
		CondicionVenta con=new CondicionVenta();
		
		// Debo obtener el ID y la Cantidad
		ItemOrdenPedido ip = new ItemOrdenPedido();
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			
			DocumentBuilder builder = factory.newDocumentBuilder();

			
			Document doc = builder.parse(ARCHIVO);

			// Obtengo el nodo RAIZ
			Element node = doc.getDocumentElement();
			
			//Seteo el numero de cotizacion.
			//NOTA: si se usan valores autoincrementales no puedo
			//setear el valor del ID por lo cual HIBERNATE indicaria del error
			//s.setId(Integer.parseInt(node.getAttributeNode("numero").getTextContent()));
			o.setEstado(node.getElementsByTagName("Estado").item(0).getTextContent());
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        Date fechaDate = null;
	        fechaDate = formato.parse(node.getElementsByTagName("Fecha").item(0).getTextContent());
	        o.setFechaCreacion(fechaDate);
	        
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
			
			o.setCliente(c);
	        
			//Recorro todos los items que hay en la solicitud
			NodeList lista = node.getElementsByTagName("Item");

			// Recorro los hijos de la RAIZ
			for (int i = 0; i < lista.getLength(); i++) {
				
				// Tomo un elemento que debo castear
				Element elemento = (Element) lista.item(i);

				//Seteo los valores del item
				
				//¿El id del item se autogenera o es igual al n de serie?
				//ir.setId(Integer.parseInt(elemento.getAttribute("serie")));
				
				ip.setCantidad(Integer.parseInt(elemento.getElementsByTagName("Cantidad").item(0).getTextContent()));
				ip.setEstado(elemento.getElementsByTagName("Estado").item(0).getTextContent());
				
				SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
		        Date fecha = null;
		        fecha = form.parse(node.getElementsByTagName("Fecha").item(0).getTextContent());
		        cot.setFechaCreacion(fecha);
		        
		        cot.setCliente(c);
		        
		        SimpleDateFormat form2 = new SimpleDateFormat("dd/MM/yyyy");
		        Date fecha2 = null;
		        fecha2 = form2.parse(node.getElementsByTagName("FechaVigencia").item(0).getTextContent());
		        cot.setFechaVigencia(fecha2);
		        
		        cot.setTotal(Double.parseDouble(node.getElementsByTagName("Total").item(0).getTextContent()));
		        
		        cot.setEstaVigente(Boolean.parseBoolean(node.getElementsByTagName("EstaVigente").item(0).getTextContent()));
		        
		        
		        
		        
		        ip.setCotizacion(cot);
		        
		       
				
				//OBTENGO LOS DATOS DEL RODAMIENTO
				
				//Obtengo los datos de la Marca
				//NOTA: el ID se genera automaticamente y la categoria hay que analizar
				//el criterio que se va a tomar
				m.setNombre(elemento.getElementsByTagName("Marca").item(0).getTextContent());
				m.setOrigen(elemento.getElementsByTagName("Origen").item(0).getTextContent());
				m.setCategoria(elemento.getElementsByTagName("Categoria").item(0).getTextContent());
				
				//El Id del rodamiento lo asigna Hibernate
				//por lo tanto no es necesario setearlo
				
				r.setMarca(m);
				
				//Hay prefijo no sufijo
				//r.setPrefijo(prefijo);
				
				r.setSerie(elemento.getAttribute("serie"));
				r.setPrefijo(elemento.getElementsByTagName("Prefijo").item(0).getTextContent());
				r.setSufijo(elemento.getElementsByTagName("Sufijo").item(0).getTextContent());
				
				ip.setRodamiento(r);
				
				//Lo agrego a la lista de items
				items.add(ip);

			}

			//Una vez finalizada la lectura y la carga de los elementos
			//lo guardo dentro de la solicitud correspondiente
			//para luego guardarla en la b.datos
			o.setItemsOrdenPedido(items);

		} catch (Exception e) {

			// No se leyo el XML
			e.printStackTrace();

		}
		
		return o;

	}
	
	
	
}
