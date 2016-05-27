package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import dominio.Cliente;
import dominio.CondicionVenta;
import dominio.Cotizacion;
import dominio.DescuentoEspecial;
import dominio.Direccion;
import dominio.Factura;
import dominio.FormaDePago;
import dominio.ItemCotizacion;
import dominio.ItemListaPrecio;
import dominio.ItemOrdenCompra;
import dominio.ItemOrdenPedido;
import dominio.ItemSolicitudCotizacion;
import dominio.ListaPrecio;
import dominio.OrdenCompra;
import dominio.OrdenPedido;
import dominio.Proveedor;
import dominio.Rodamiento;
import dominio.SolicitudCotizacion;
 
public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
        	
        	 AnnotationConfiguration config = new AnnotationConfiguration();
             
             config.addAnnotatedClass(SolicitudCotizacion.class);
             config.addAnnotatedClass(ItemSolicitudCotizacion.class);
             config.addAnnotatedClass(Rodamiento.class);
             config.addAnnotatedClass(Cotizacion.class);
             config.addAnnotatedClass(ItemCotizacion.class);
             config.addAnnotatedClass(OrdenPedido.class);
             config.addAnnotatedClass(ItemOrdenPedido.class);             
             config.addAnnotatedClass(OrdenCompra.class);
             config.addAnnotatedClass(ItemOrdenCompra.class); 
             config.addAnnotatedClass(Cliente.class);
             config.addAnnotatedClass(CondicionVenta.class);
             
             config.addAnnotatedClass(Proveedor.class);
             config.addAnnotatedClass(ListaPrecio.class);
             config.addAnnotatedClass(ItemListaPrecio.class);
             config.addAnnotatedClass(DescuentoEspecial.class);
             config.addAnnotatedClass(Direccion.class);
             
             config.addAnnotatedClass(Factura.class);
             
             sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
