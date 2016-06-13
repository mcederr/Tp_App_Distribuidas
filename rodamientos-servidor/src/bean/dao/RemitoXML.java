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

import dominio.Cotizacion;

public class RemitoXML {

	
	Document doc;
	 
	 static final String ARCHIVO = "Remito.xml";
	
	public void guardarDatosRemitoXML(){
		

		
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
			Element root = doc.createElement("Remito");
			
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
			
			
			hijo = doc.createElement("Referencia");
			
			root.appendChild(hijo);
			
			Element prm6 = doc.createElement("OrdenPedido");
			hijo.appendChild(prm6);
			
			Element prm7=doc.createElement("Numero");
			prm7.setTextContent("1");
			prm6.appendChild(prm7);
			Element prm8=doc.createElement("Fecha");
			prm8.setTextContent("12/12/2016");
			prm6.appendChild(prm8);
			
			
			Element prm9 = doc.createElement("Rodamientos");
			hijo.appendChild(prm9);
			
			Element prm10 = doc.createElement("Item");
			prm9.appendChild(prm10);
			
			
			Element prm11=doc.createElement("Serie");
			prm11.setTextContent("22310");
			prm10.appendChild(prm11);
			Element prm12=doc.createElement("Prefijo");
			prm12.setTextContent("AA22NN");
			prm10.appendChild(prm12);
			Element prm13=doc.createElement("Sufijo");
			prm13.setTextContent("CCW33");
			prm10.appendChild(prm13);
			Element prm14=doc.createElement("Marca");
			prm14.setTextContent("ZKL");
			prm10.appendChild(prm14);
			Element prm15=doc.createElement("Origen");
			prm15.setTextContent("Japon");
			prm10.appendChild(prm15);
			Element prm16=doc.createElement("Cantidad");
			prm16.setTextContent("1000");
			prm10.appendChild(prm16);
			
			
			
			
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
