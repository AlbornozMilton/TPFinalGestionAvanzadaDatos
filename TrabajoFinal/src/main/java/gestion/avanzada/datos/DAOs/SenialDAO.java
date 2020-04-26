package gestion.avanzada.datos.DAOs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import gestion.avanzada.datos.Dominio.Senial;
import gestion.avanzada.datos.TrabajoFinal.App;

public class SenialDAO {

	public void saveSenial(Senial aSenial) {
		try {
			EntityManager em = App.startConnection();
			em.getTransaction().begin();
			em.persist(aSenial);
			em.getTransaction().commit();
			System.out.println("Se guardó con exito la nueva señal");
		} catch (Exception e) {
			System.out.println("Ocurrió un error al intentar guardar una nueva señal");
		}
	}
	
	public ArrayList<String> getSimilarImages(String paleta){
		try {
			EntityManager em = App.startConnection();
			em.getTransaction().begin();
			List<Object> seniales = (List<Object>) em.createNativeQuery("Select * from seniales LIMIT 5").getResultList();
			em.getTransaction().commit();
	    	System.out.println(seniales.size());
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ArrayList<String>();
	}
}
