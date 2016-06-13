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
import org.w3c.dom.Element;

public class OrdenCompraXML {

	
	Document doc;
	 
	 static final String ARCHIVO = "OrdenCompra.xml";
	
	public void guardarDatosOrdenCompraXML(){
		
		
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
			Element root = doc.createElement("OrdenCompra");
			
			root.setAttribute("numero","1");

			// Lo agrego al documento
			doc.appendChild(root);

			// crea elemento hijo(se debe instanciar)
			Element hijo = doc.createElement("Emision");
			
			hijo.setTextContent("12/12/2016");
			
			root.appendChild(hijo);
			
			hijo = doc.createElement("Cliente");
			
			hijo.setAttribute("Cuit", "123");
			hijo.setAttribute("RazonSocial", "Rodamiento S.A");
			
			root.appendChild(hijo);

			
			
			hijo = doc.createElement("Rodamientos");
			
			root.appendChild(hijo);
			
			Element prm = doc.createElement("Item");
			hijo.appendChild(prm);
			
			
			Element prm2=doc.createElement("Serie");
			prm2.setTextContent("22310");
			prm.appendChild(prm2);
			Element prm3=doc.createElement("Prefijo");
			prm3.setTextContent("AA22NN");
			prm.appendChild(prm3);
			Element prm4=doc.createElement("Sufijo");
			prm4.setTextContent("CCW33");
			prm.appendChild(prm4);
			Element prm5=doc.createElement("Marca");
			prm5.setTextContent("ZKL");
			prm.appendChild(prm5);
			Element prm6=doc.createElement("Origen");
			prm6.setTextContent("Japon");
			prm.appendChild(prm6);
			Element prm7=doc.createElement("Cantidad");
			prm7.setTextContent("1000");
			prm.appendChild(prm7);
			
			
			
			
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
