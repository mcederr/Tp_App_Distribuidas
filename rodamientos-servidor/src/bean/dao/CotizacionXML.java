package bean.dao;

import java.io.File;
import java.io.FileWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;

import dominio.Cotizacion;

public class CotizacionXML {

	 Document doc;
	 
	 static final String ARCHIVO = "Cotizacion.xml";
	
	public void guardarDatosCotizacionXML(){
		
		Cotizacion c=new Cotizacion();
		
		try {
			// Crea instancia de DocumentBuilderFactory
			// Para crear un documento se debe primero instanciar un
			// BuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// obtiene objeto DocumentBuilder. Permite crear tantos documentos
			// XML como quiera.
			// Se toma el Factory y se instancia un DocumentBuilder
			// para poder construir el archivo
			DocumentBuilder docBuilder = factory.newDocumentBuilder();

			// Crea documento DOM en blanco
			// doc es del tipo Document
			doc = docBuilder.newDocument();

			// NOTA: pensarlo como un arbol o un HTML en el que creo varias
			// etiquetas y al cual le agrego elementos adentro por ej una
			// imagen, etc.

			// Una vez creado el documento en blanco comienzo la carga de datos
			// crea el elemento raÌz y lo agrega al documento
			Element root = doc.createElement("Cotizacion");
			
			root.setAttribute("numero", String.valueOf(c.getId()));

			// Lo agrego al documento
			doc.appendChild(root);

			// crea elemento hijo(se debe instanciar)
			Element hijo = doc.createElement("Vigencia");

			hijo.setAttribute("Fecha", c.getFechaCreacion().toString());
			
			hijo.setAttribute("Termino", c.getFechaVigencia().toString());
			
			root.appendChild(hijo);
			
			hijo = doc.createElement("Cliente");
			
			hijo.setAttribute("Cuit", c.getCliente().getCuit());
			hijo.setAttribute("RazonSocial", c.getCliente().getRazonSocial());
			
			root.appendChild(hijo);

			hijo = doc.createElement("CondicionesDeVenta");
			
			
			
/*
			Element prm = doc.createElement("parametro");
			// Se setea el contenido del nodo. Seria {contenido}
			// Se le agrega al ultimo hijo agregado en este caso
			// al de id02
			// Quedaria esto dentro del ultimo nodo
			// <parametro>contenido</parametro>
			prm.setTextContent("contenido");

			// Se agrega ese parametro al ultimo nodo
			// en este caso al nodo id02
			hijo.appendChild(prm);
*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void saveDomXML() {
		// Crea instancia de TransformerFactory
		TransformerFactory tranFactory = TransformerFactory.newInstance();
		Transformer tran;
		try {
			// Crea un objeto Transformer
			tran = tranFactory.newTransformer();

			// interface Source implementada con un documento dom
			Source src = new DOMSource(doc);

			// interface Result implementada con un subtipo de OutputStream
			// Para escribir en un archivo de texto se utiliza un filewriter
			// al cual se le pasa como parametro la ruta del archivo que
			// queremos
			// escribirle datos
			Result dest = new StreamResult(new FileWriter(new File(ARCHIVO)));

			// mÈtodo transform que enlaza el documento con el stream
			// Guardo la informacion del XML creado en el metodo newdomXML
			// dentro del archivo especifico
			
			tran.transform(src, dest);
			
			System.out.print("archivo creado");
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
}
