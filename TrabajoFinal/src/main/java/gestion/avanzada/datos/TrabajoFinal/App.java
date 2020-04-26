package gestion.avanzada.datos.TrabajoFinal;

import gestion.avanzada.datos.UI.PantallaPpal;
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
    	/*****
    	emf = Persistence.createEntityManagerFactory("senialesPersistence");
    	manager = emf.createEntityManager();
    	
        Senial senialPrueba = new Senial("pprueba de insercion desde app", "C://seniales//nose", "121,45,5787,878,321,545,967464,89789,75,465,4,465,44");
        manager.getTransaction().begin();
        manager.persist(senialPrueba);
        manager.getTransaction().commit();
    	//List<Senial> seniales = (List<Senial>) manager.createQuery("from Senial").getResultList();
    	//Senial senialObtenida = seniales.get(0);
    	//System.out.println("cantidad de registros encontrados: " + seniales.get(0));
    	//System.out.println("El registro encontrado contiene lo siguiente: " + senialObtenida.getDescripcion() + senialObtenida.getRuta());
    	******/
        
    	PantallaPpal ventana = new PantallaPpal();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    	
        
        /**********
        Imagen2 img = new Imagen2();
    	Imagen2 img2 = new Imagen2();
    	Imagen2 img3 = new Imagen2();
    	
    	System.out.println("-------------------Procesando imagen original de libro---------------------------");
    	System.out.println();
    	ArrayList<int[]> paletaImgOk = img2.getPaletaColores("C:\\Señales\\041.png"); //Imagen de  libro que corresponde
    	System.out.println("----------------Procesando imagen de libro de contra prueba----------------------");
    	System.out.println();
    	ArrayList<int[]> paletaImgNoOk = img3.getPaletaColores("C:\\Señales\\042.png"); //Imagen cualquiera para contraprueba
    	System.out.println("-----------------------Procesando foto real de señal-----------------------------");
    	System.out.println();
    	ArrayList<int[]> paleta = img.getPaletaColores("C:\\Señales\\083-prueba4.png"); //Foto real de consulta
    	System.out.println("---------------Calculando dintancia euclideana entre imagenes--------------------");
    	System.out.println();
    	System.out.println("---------------DINTANCIA ENTRE SEÑAL OK Y LA FOTO--------------------");
    	System.out.println();
    	System.out.println(img.calcularDistanciaEuclideanaConPesos(paletaImgOk, paleta));
    	System.out.println("---------------DINTANCIA ENTRE SEÑAL NO OK Y LA FOTO--------------------");
    	System.out.println();
    	System.out.println(img.calcularDistanciaEuclideanaConPesos(paletaImgNoOk, paleta));
	*******/
    }
}
