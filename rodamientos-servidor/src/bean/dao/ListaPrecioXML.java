package bean.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import dominio.Cliente;
import dominio.CondicionCompra;
import dominio.DescuentoEspecial;
import dominio.Direccion;
import dominio.FormaDePago;
import dominio.ItemListaPrecio;
import dominio.ItemSolicitudCotizacion;
import dominio.ListaPrecio;
import dominio.Marca;
import dominio.Proveedor;
import dominio.Rodamiento;
import dominio.SolicitudCotizacion;

public class ListaPrecioXML {

	static final String ARCHIVO = "listaDePrecios.xml";

	public ListaPrecio leerXML() {

		ListaPrecio l = new ListaPrecio();
		ArrayList<ItemListaPrecio> items = new ArrayList<ItemListaPrecio>();
		Rodamiento r = new Rodamiento ();
		Marca m = new Marca();
		DescuentoEspecial d=new DescuentoEspecial();
		Proveedor p=new Proveedor();
		Direccion dir=new Direccion();
		CondicionCompra con=new CondicionCompra();
		FormaDePago f=new FormaDePago();
		
		ItemListaPrecio il = new ItemListaPrecio();
		
		
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
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        Date fechaDate = null;
	        fechaDate = formato.parse(node.getElementsByTagName("Fecha").item(0).getTextContent());
	        l.setFechaVigencia(fechaDate);
		
			NodeList lis=node.getElementsByTagName("DescuentoEspecial");
			
			for(int i=0;i<lis.getLength();i++)
			{
				Element e=(Element)lis.item(i);
				d.setTipo(e.getElementsByTagName("Tipo").item(0).getTextContent());
				d.setCoeficiente(Double.parseDouble(e.getElementsByTagName("Coeficiente").item(0).getTextContent()));
				
			}
			l.setDescuentoEspecial(d);
			
			l.setEstaVigente(Boolean.parseBoolean(node.getElementsByTagName("Vigencia").item(0).getTextContent()));
			
			
			dir.setLocalidad(node.getElementsByTagName("Localidad").item(0).getTextContent());
			dir.setCalle(node.getElementsByTagName("Calle").item(0).getTextContent());
			dir.setCodigoPostal(node.getElementsByTagName("CP").item(0).getTextContent());
			dir.setNumero(Integer.parseInt(node.getElementsByTagName("Numero").item(0).getTextContent()));
			dir.setProvincia(node.getElementsByTagName("Provincia").item(0).getTextContent());
			dir.setPais(node.getElementsByTagName("Pais").item(0).getTextContent());
			
			p.setDireccion(dir);
			
			con.setTipo(node.getElementsByTagName("Tipo").item(0).getTextContent());
			con.setCoeficiente(Double.parseDouble(node.getElementsByTagName("Coeficiente").item(0).getTextContent()));
			
			f.setDescripcion(node.getElementsByTagName("Descripcion").item(0).getTextContent());
			
			con.setFormaDePago(f);
			p.setCondicionCompra(con);
			
			
			
			
			p.setRazonSocial(node.getElementsByTagName("RazonSocial").item(0).getTextContent());
			p.setTelefono(node.getElementsByTagName("Telefono").item(0).getTextContent());
			p.setMail(node.getElementsByTagName("Mail").item(0).getTextContent());
			
			l.setProveedor(p);
			
			
			//Recorro todos los items que hay en la solicitud
			NodeList lista = node.getElementsByTagName("Item");

			// Recorro los hijos de la RAIZ
			for (int i = 0; i < lista.getLength(); i++) {
				
				// Tomo un elemento que debo castear
				Element elemento = (Element) lista.item(i);

				//Seteo los valores del item
				
				il.setPrecio(Double.parseDouble(elemento.getElementsByTagName("Precio").item(0).getTextContent()));
				il.setStock(Integer.parseInt(elemento.getElementsByTagName("Stock").item(0).getTextContent()));
				
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
				
				
				r.setSerie(elemento.getAttribute("serie"));
				r.setPrefijo(elemento.getElementsByTagName("Prefijo").item(0).getTextContent());
				r.setSufijo(elemento.getElementsByTagName("Sufijo").item(0).getTextContent());
				
				il.setRodamiento(r);
				
				//Lo agrego a la lista de items
				items.add(il);

			}

			//Una vez finalizada la lectura y la carga de los elementos
			//lo guardo dentro de la solicitud correspondiente
			//para luego guardarla en la b.datos
			l.setItemsListaPrecio(items);

		} catch (Exception e) {

			// No se leyo el XML
			e.printStackTrace();

		}
		
		return l;

	}
	
	
	
	
	
	
}
