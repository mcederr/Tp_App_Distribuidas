package inicio;

import bean.dao.ClienteXML;
import bean.dao.CotizacionXML;
import bean.dao.ListaPrecioXML;
import bean.dao.OrdenPedidoXML;
import bean.dao.ProveedorXML;
import bean.dao.SolicitudCotizacionXML;
import dominio.Cliente;
import dominio.ListaPrecio;
import dominio.OrdenPedido;
import dominio.Proveedor;
import dominio.SolicitudCotizacion;
import bean.srv.SolicitudCotizacionSRV;

public class main {

	public static void main(String[] args) {
		
		//Obtengo los datos cargados en el XML
		SolicitudCotizacionXML a = new SolicitudCotizacionXML();
		SolicitudCotizacion sc = a.leerXML();
		
		
		//Lo guardo en la b.datos
		SolicitudCotizacionSRV scsrv = new SolicitudCotizacionSRV();
		scsrv.guardarSolicitud(sc);
		
		CotizacionXML c=new CotizacionXML();
		c.saveDomXML();
		
		c.guardarDatosCotizacionXML();
		
		ListaPrecioXML l = new ListaPrecioXML();
		ListaPrecio lis = l.leerXML();
		
		
		//Lo guardo en la b.datos
		SolicitudCotizacionSRV scsrv2 = new SolicitudCotizacionSRV();
		scsrv2.guardarListaPrecio(lis);
		
		OrdenPedidoXML o=new OrdenPedidoXML();
		OrdenPedido ord=o.leerXML();
		
		SolicitudCotizacionSRV scsrv3 = new SolicitudCotizacionSRV();
		scsrv3.guardarOrdenPedido(ord);
		
		ClienteXML cli=new ClienteXML();
		Cliente cliente=cli.leerXML();
		
		SolicitudCotizacionSRV scsrv4 = new SolicitudCotizacionSRV();
		scsrv4.guardarCliente(cliente);
		
		
		ProveedorXML p=new ProveedorXML();
		Proveedor pro=p.leerXML();
		
		SolicitudCotizacionSRV scsrv5 = new SolicitudCotizacionSRV();
		scsrv5.guardarProveedor(pro);
		
		
	}

}
