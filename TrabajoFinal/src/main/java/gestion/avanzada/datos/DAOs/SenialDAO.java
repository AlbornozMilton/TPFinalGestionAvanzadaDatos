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
		} catch (Exception e) {
			System.out.println("Ocurrió un error al intentar guardar una nueva señal");
		}
	}
	
	public List<Senial> getSimilarImages(String paleta){
		List<Senial> seniales = new ArrayList<Senial>();
		try {
			EntityManager em = App.startConnection();
			em.getTransaction().begin();
			String query = "select * from seniales('" + paleta + "')";
			seniales = (List<Senial>) em.createNativeQuery(query,Senial.class).getResultList();
			em.getTransaction().commit();
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return seniales;
	}
}
