package gestion.avanzada.datos.Dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seniales")
public class Senial implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id()
	@Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "ruta")
	private String ruta;
	
	@Column(name = "paleta")
	private String paleta;
	
	public Senial() {
		//algo
	}

        public Senial(String descripcion, String ruta, String paleta) {
		this.descripcion = descripcion;
		this.ruta = ruta;
		this.paleta = paleta;
	}
        
	public Senial(int id, String descripcion, String ruta, String paleta) {
		this.id = id;
		this.descripcion = descripcion;
		this.ruta = ruta;
		this.paleta = paleta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getPaleta() {
		return paleta;
	}

	public void setPaleta(String paleta) {
		this.paleta = paleta;
	}
	
	
	
	

}
