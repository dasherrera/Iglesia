
package HelpClass;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Pc_Hp_02
 */
public class SessionFact {
    
    static SessionFactory sf; //crear sesiones
    private static ServiceRegistry serviceRegistry; //objetos a utilizar para crear la sesion
    
    public static SessionFactory getSessionFact(){    
    Configuration cfg= new Configuration(); //crear un objeto de configuracion 
    cfg.configure("/Recursos/hibernate.cfg.xml");
    serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
    sf=cfg.buildSessionFactory(serviceRegistry);
    System.out.println("Build session factory");
    return sf;
            
    }
            

}
