package gestion.avanzada.datos.TrabajoFinal;

import gestion.avanzada.datos.UI.PantallaPpal;
import net.bytebuddy.asm.Advice.This;
import gestion.avanzada.datos.Dominio.Senial;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
	
    private static EntityManager manager;
    private static EntityManagerFactory emf;
    
    public static EntityManager startConnection() {
    	try {
			if(emf == null) {
				emf = Persistence.createEntityManagerFactory("senialesPersistence");
				System.out.println("Se instanceo el EMF");
			}
		} catch (Exception e) {
			System.out.println("Ocurrió un error al intentar instanciar el EntityManagerFactory");
		}
    	return emf.createEntityManager();
    }
    
    public static void main( String[] args ) throws IOException
    {
    	emf = Persistence.createEntityManagerFactory("senialesPersistence");
    	manager = emf.createEntityManager();
    	PantallaPpal ventana = new PantallaPpal();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
