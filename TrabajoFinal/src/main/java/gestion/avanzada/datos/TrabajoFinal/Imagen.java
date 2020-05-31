package gestion.avanzada.datos.TrabajoFinal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gestion.avanzada.datos.DAOs.SenialDAO;
import gestion.avanzada.datos.Dominio.Senial;
import gestion.avanzada.datos.UI.PantallaPpal;


public class Imagen {

	private EntityManagerFactory emf;
	private static EntityManager manager;
	
	private final int CANTIDAD_CUADRANTES_POR_LADO = 5;
        
	private BufferedImage img;
    Map<Integer, Integer> mapColors = new HashMap<Integer, Integer>();
    
	public ArrayList<int[]> colores = new ArrayList<int[]>();
	public ArrayList<int[]> coloresSeniales = new ArrayList<int[]>();
	public ArrayList<int[]> paleta = new ArrayList<int[]>();
	
	//COLORES
	
	//NEGRO
	static final int[] negroRGB = {0,0,0};
        
	//AZUL
	static final int[] azulRGB = {0,0,255};
        
	//AZUL CLARO
	static final int[] azulClaroRGB = {160,160,255};
        
	//AZUL OSCURO
	static final int[] azulOscuroRGB = {0,0,140};
        
	//VERDE
	static final int[] verdeRGB = {0,255,0};
        
	//VERDE CLARO
	static final int[] verdeClaroRGB = {120,255,120};
        
	//VERDE OSCURO
	static final int[] verdeOscuroRGB = {0,120,0};
        
	//NARANJA
	static final int[] naranjaRGB = {255,100,0};
        
	//MAGENTA
	static final int[] magentaRGB = {255,0,255};
        
	//ROJO
	static final int[] rojoRGB = {255,0,0};
        
	//ROJO CLARO
	static final int[] rojoClaroRGB = {255,80,80};
        
	//ROJO OSCURO
	static final int[] rojoOscuroRGB = {160,0,0};
        
	//BLANCO
	static final int[] blancoRGB = {255,255,255};
	
	//BLANCO MAS GRIS
	static final int[] blancoGrisaceoRGB= {170,170,170};
        
	//AMARILLO
	static final int[] amarilloRGB = {255,255,0};
        
	//AMARILLO CLARO
	static final int[] amarilloClaroRGB = {255,255,130};
        
	//AMARILLO OSCURO
	static final int[] amarilloOscuroRGB = {150,150,0};
        
	
	public Imagen() {
            //Diccionario de correspondencia de colores
            this.colores.add(Imagen.negroRGB);
            mapColors.put(0,4);
            this.colores.add(Imagen.azulRGB);
            mapColors.put(1,2);
            this.colores.add(Imagen.azulClaroRGB);
            mapColors.put(2,5);
            this.colores.add(Imagen.azulOscuroRGB);
            mapColors.put(3,2);
            this.colores.add(Imagen.verdeRGB);
            mapColors.put(4,5);
            this.colores.add(Imagen.verdeOscuroRGB);
            mapColors.put(5,5);
            this.colores.add(Imagen.verdeClaroRGB);
            mapColors.put(6,5);
            this.colores.add(Imagen.naranjaRGB);
            mapColors.put(7,6);
            this.colores.add(Imagen.rojoRGB);
            mapColors.put(8,1);
            this.colores.add(Imagen.rojoClaroRGB);
            mapColors.put(9,1);
            this.colores.add(Imagen.rojoOscuroRGB);
            mapColors.put(10,1);
            this.colores.add(Imagen.blancoRGB);
            mapColors.put(11,5);
            this.colores.add(Imagen.amarilloRGB);
            mapColors.put(12,0);
            this.colores.add(Imagen.amarilloOscuroRGB);
            mapColors.put(13,0);
            this.colores.add(Imagen.amarilloClaroRGB);
            mapColors.put(14,0);
            this.colores.add(Imagen.blancoGrisaceoRGB);
            mapColors.put(15,5);
            this.colores.add(Imagen.magentaRGB);


            //Inicializacion de vector de colores de señales
            this.coloresSeniales.add(Imagen.amarilloRGB);//0
            this.coloresSeniales.add(Imagen.rojoRGB);//    1
            this.coloresSeniales.add(Imagen.azulRGB);//    2
            this.coloresSeniales.add(Imagen.verdeRGB);//   3
            this.coloresSeniales.add(Imagen.negroRGB);//   4
            this.coloresSeniales.add(Imagen.blancoRGB);//  5
            this.coloresSeniales.add(Imagen.naranjaRGB);// 6               
	}
	
	
	/**
	 * Calcula la distancia euclideana entre dos vectores pasados por parametros
	 * @param vectA
	 * @param vectB
	 * @return
	 */
	public float getEuclideanDistance(int[] vectA, int[] vectB) {
		int sum = 0;
		for (int i = 0; i < vectA.length; i++) {
			sum = (int) (sum + Math.pow(Math.abs(vectA[i]-vectB[i]), 2));
		}
		return (float) (Math.sqrt(sum));
	}
	
	/**
	 * Carga una imagen indicada en la ruta
	 * @param pathImage
	 * @throws IOException
	 */
	public void loadImage(String pathImage) throws IOException {
		File folder = new File(pathImage);
		this.img = ImageIO.read(folder);
	}
	
	
    /**
	 * Convierte la paleta de colores obtenida de procesar la imagen en la cadena de salida para la base de datos 
	 * @param paleta
	 * @return String
	 */
	public String convertToString(ArrayList<int[]> paleta) {
		String paletaFinal = "";
            for (int[] cuad : paleta) {
				for (int num : cuad) {
					paletaFinal = paletaFinal + num + ",";
				}
			}
        return paletaFinal.substring(0, paletaFinal.length() - 1);
	}
	
	
        /**
	 * Carga una imagen indicada en la ruta
	 * @param pathImage
	 * @throws IOException
	 */
	public void loadImageToBD(String path) throws IOException, InterruptedException {
            ArrayList<int[]> paletaImagen = this.getPaletaColores(path);
            String paletaString = convertToString(paletaImagen);
            Senial senial = new Senial(this.getNameOfFile(path),path,paletaString); //cambiar aquu capara obtener la descripcion del nombre del archivo.
            SenialDAO senialDAO = new SenialDAO();
            senialDAO.saveSenial(senial);
	}
	
	public String getNameOfFile(String path) {  
		 return path.substring(path.lastIndexOf("\\")+1).split("\\.")[0];
	}
	
	
	/**
	 * Invoca el Store Procedure para la búsqueda de resultados similiares
	 * @param path
	 * @throws IOException 
	 */
	public List<Senial> findSimilarImagesAs(String path) throws IOException{
		SenialDAO senialDAO = new SenialDAO();
		ArrayList<int[]> paleta = this.getPaletaColores(path);
		return senialDAO.getSimilarImages(this.convertToString(paleta));
	}
	
	/**
	 * Devuelve la paleta de colores de una imagen recorriendo cuadrantes por filas de izq a derecha
	 * @param pathImage
	 * @return
	 * @throws IOException
	 */
	public ArrayList<int[]> getPaletaColores(String pathImage) throws IOException {
		this.loadImage(pathImage);
		int width = this.img.getWidth();
		int height = this.img.getHeight();
		int tamIntX = width/CANTIDAD_CUADRANTES_POR_LADO;
		int tamIntY = height/CANTIDAD_CUADRANTES_POR_LADO;
		int restoX = width - (tamIntX * CANTIDAD_CUADRANTES_POR_LADO);
		int restoY = height - (tamIntY*CANTIDAD_CUADRANTES_POR_LADO);
		int ptoPartidaX = 0;
		int ptoPartidaY = 0;
		for (int i = 0; i < CANTIDAD_CUADRANTES_POR_LADO; i++) {
			int tamanioY = tamIntY;
			if (restoY > 0) {
				tamanioY++;
				restoY--;
			}
			restoX = width - (tamIntX*CANTIDAD_CUADRANTES_POR_LADO);
			ptoPartidaX = 0;
			for (int j = 0; j<CANTIDAD_CUADRANTES_POR_LADO; j++) {
				int tamanioX = tamIntX;
				if (restoX > 0) {
					tamanioX++;
					restoX--;
				}
				this.paleta.add(this.getHistograma(ptoPartidaX, ptoPartidaX+tamanioX, ptoPartidaY, ptoPartidaY+tamanioY));
				ptoPartidaX = ptoPartidaX+tamanioX;
			}
			ptoPartidaY = ptoPartidaY+tamanioY;
		}
		return this.paleta;
	}
	
	/**
	 * Devuelve la posicion del color que mas se asemeja un color pasado por parametro
	 * @param pixelColor
	 * @return
	 */
	public int getSimilarColorPosition(int[] pixelColor) {
		float min = this.getEuclideanDistance(pixelColor, this.colores.get(0));
		int pos = 0;
		for (int i=1; i<this.colores.size(); i++) {
			float distance = this.getEuclideanDistance(pixelColor, this.colores.get(i));
			if (distance < min) {
				min = distance;
				pos = i;
			}
		}
		return this.mapColors.get(pos);
	}
	
	/**
	 * Devuelve el histograma de colores de un caudrante
	 * @param desdeX
	 * @param hastaX
	 * @param desdeY
	 * @param hastaY
	 * @return
	 */
	public int[] getHistograma(int desdeX, int hastaX, int desdeY, int hastaY) {
		int[] histograma = {0,0,0,0,0,0,0}; //cambiar esto, es muy hardcode
		for (int i = desdeX; i<hastaX; i++){
			for (int j = desdeY; j<hastaY; j++){
				int[] pixel = this.getRGBcomponents(new Color(this.img.getRGB(i,j)));                                
				histograma[this.getSimilarColorPosition(pixel)]++;
			}
		}
		return histograma;
	}
	
	/**
	 * Devuelve cada componente RGB de un pixel en un array
	 * @param color
	 * @return
	 */
	public int[] getRGBcomponents (Color color) {
		int[] rgbColor = {0,0,0};
		rgbColor[0] = color.getRed();
		rgbColor[1] = color.getGreen();
		rgbColor[2] = color.getBlue();
		return rgbColor;
	}	
}
