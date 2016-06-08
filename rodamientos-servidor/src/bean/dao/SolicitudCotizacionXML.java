package bean.dao;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import dominio.Cliente;
import dominio.Direccion;
import dominio.ItemSolicitudCotizacion;
import dominio.Marca;
import dominio.Rodamiento;
import dominio.SolicitudCotizacion;

public class SolicitudCotizacionXML {

	static final String ARCHIVO = "Solicitud_Cotizacion.xml";

	public SolicitudCotizacion leerXML() {

		SolicitudCotizacion s = new SolicitudCotizacion();
		ArrayList<ItemSolicitudCotizacion> items = new ArrayList<ItemSolicitudCotizacion>();
		Rodamiento r = new Rodamiento ();
		Marca m = new Marca();
		Cliente c=new Cliente();
		Direccion d=new Direccion();
		
		// Debo obtener el ID y la Cantidad
		ItemSolicitudCotizacion ir = new ItemSolicitudCotizacion();
		
		// Para leer un documento necesito un BuilderFactory
		// Defines a factory API that enables applications to obtain
		// a parser that produces DOM object trees from XML documents
		// Permite crear y obtener documentos de tipo XML
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			// Crea instancia de DocumentBuilderFactory
			// Es lo que permite obtener instancias de un objeto
			// de tipo XML. Solo se puede obtener de una instancia
			// del BuilderFactory por lo cual, debe declararse anteriormente
			DocumentBuilder builder = factory.newDocumentBuilder();

			// obtiene objeto DocumentBuilder. Obtiene el documento XML
			// ya armado.
			// Obtiene los datos del archivo especifico
			Document doc = builder.parse(ARCHIVO);

			// Obtengo el nodo RAIZ
			Element node = doc.getDocumentElement();
			
			//Seteo el numero de cotizacion.
			//NOTA: si se usan valores autoincrementales no puedo
			//setear el valor del ID por lo cual HIBERNATE indicaria del error
			//s.setId(Integer.parseInt(node.getAttributeNode("numero").getTextContent()));
			s.setPrecio(Double.valueOf(node.getAttribute("precio")));
			//Recorro todos los items que hay en la solicitud
			NodeList lista = node.getElementsByTagName("Item");

			// Recorro los hijos de la RAIZ
			for (int i = 0; i < lista.getLength(); i++) {
				
				// Tomo un elemento que debo castear
				Element elemento = (Element) lista.item(i);

				//Seteo los valores del item
				
				//¿El id del item se autogenera o es igual al n de serie?
				//ir.setId(Integer.parseInt(elemento.getAttribute("serie")));
				
				ir.setCantidad(Integer.parseInt(elemento.getElementsByTagName("Cantidad").item(0).getTextContent()));
				
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
				
				ir.setRodamiento(r);
				
				//Lo agrego a la lista de items
				items.add(ir);

			}

			//Una vez finalizada la lectura y la carga de los elementos
			//lo guardo dentro de la solicitud correspondiente
			//para luego guardarla en la b.datos
			s.setItemsSolicitudCotizacion(items);

		} catch (Exception e) {

			// No se leyo el XML
			e.printStackTrace();

		}
		
		return s;

	}
	
}
