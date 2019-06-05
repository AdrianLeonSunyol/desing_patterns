package factoryMethod;

import factoryMethod.document.Application;
import factoryMethod.document.DocumentFactory;
import factoryMethod.product.IFramework;
import factoryMethod.product.ProductFactory;
import factoryMethod.profesores.ProfesorFactory;
import factoryMethod.profesores.profesores.Profesor;
import factoryMethod.profesores.profesores.ProfesorType;
import factoryMethod.vehicles.Vehicle;
import factoryMethod.vehicles.VehicleFactory;
import factoryMethod.website.WebSite;
import factoryMethod.website.WebsiteFactory;
import factoryMethod.website.WebsiteType;

public class factoryMethodDemo {
    public static void main(String[] args) {
        //Factory method
        //WebSite site = WebsiteFactory.getWebsite("blog");
        //System.out.println(site.getPages());

        //site = WebsiteFactory.getWebsite("shop");
        //System.out.println(site.getPages());   
        //enum
        WebSite site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        System.out.println(site);

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages()); 
        System.out.println(site);

        /*Vehicle v = VehicleFactory.getInstance("moto");
        System.out.println(v.getPiezas());

        //productos
        IFramework f = ProductFactory.getInstance("one");
        System.out.println(f.getProduct());

        f = ProductFactory.getInstance("two");
        System.out.println(f.getProduct());
        
        //profesores
        Profesor adrian = ProfesorFactory.getProfesor(ProfesorType.CIENTIFICO);
        System.out.println(adrian.getAsignaturas());

        Profesor antonio = ProfesorFactory.getProfesor(ProfesorType.FIJO);
        System.out.println(antonio.getAsignaturas());

        //document
        Application app = DocumentFactory.getApplication("drowing");
        app.newDocument();
        System.out.println(app.getDoc()); 
        app.saveDocument();
        app.openDocument();     

        app = DocumentFactory.getApplication("calculator");
        app.newDocument();
        System.out.println(app.getDoc());*/
    }
}