package gestion.avanzada.datos.TrabajoFinal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gestion.avanzada.datos.DAOs.SenialDAO;
import gestion.avanzada.datos.Dominio.Senial;
import gestion.avanzada.datos.UI.PantallaPpal;


public class Imagen2 {

	private EntityManagerFactory emf;
	private static EntityManager manager;
	
	private final int CANTIDAD_CUADRANTES_POR_LADO = 5;

    ArrayList<int[]> paletaImgOk = new ArrayList<int[]>();
	ArrayList<int[]> paletaImgNoOk = new ArrayList<int[]>();
        
	private BufferedImage img;
    private BufferedImage imgCopy;
    
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
        
	
	public Imagen2() {
            //Diccionario de correspondencia de colores
            this.colores.add(Imagen2.negroRGB);
            mapColors.put(0,4);
            this.colores.add(Imagen2.azulRGB);
            mapColors.put(1,2);
            this.colores.add(Imagen2.azulClaroRGB);
            mapColors.put(2,5);
            this.colores.add(Imagen2.azulOscuroRGB);
            mapColors.put(3,2);
            this.colores.add(Imagen2.verdeRGB);
            mapColors.put(4,5);
            this.colores.add(Imagen2.verdeOscuroRGB);
            mapColors.put(5,5);
            this.colores.add(Imagen2.verdeClaroRGB);
            mapColors.put(6,5);
            this.colores.add(Imagen2.naranjaRGB);
            mapColors.put(7,6);
            this.colores.add(Imagen2.rojoRGB);
            mapColors.put(8,1);
            this.colores.add(Imagen2.rojoClaroRGB);
            mapColors.put(9,1);
            this.colores.add(Imagen2.rojoOscuroRGB);
            mapColors.put(10,1);
            this.colores.add(Imagen2.blancoRGB);
            mapColors.put(11,5);
            this.colores.add(Imagen2.amarilloRGB);
            mapColors.put(12,0);
            this.colores.add(Imagen2.amarilloOscuroRGB);
            mapColors.put(13,0);
            this.colores.add(Imagen2.amarilloClaroRGB);
            mapColors.put(14,0);
            this.colores.add(Imagen2.blancoGrisaceoRGB);
            mapColors.put(15,5);
            this.colores.add(Imagen2.magentaRGB);


            //Inicializacion de vector de colores de señales
            this.coloresSeniales.add(Imagen2.amarilloRGB);//0
            this.coloresSeniales.add(Imagen2.rojoRGB);//    1
            this.coloresSeniales.add(Imagen2.azulRGB);//    2
            this.coloresSeniales.add(Imagen2.verdeRGB);//   3
            this.coloresSeniales.add(Imagen2.negroRGB);//   4
            this.coloresSeniales.add(Imagen2.blancoRGB);//  5
            this.coloresSeniales.add(Imagen2.naranjaRGB);// 6               
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
                this.imgCopy = this.img;
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
        return paletaFinal;
	}
	
	
        /**
	 * Carga una imagen indicada en la ruta
	 * @param pathImage
	 * @throws IOException
	 */
	public void loadImageToBD(String path) throws IOException, InterruptedException {
            ArrayList<int[]> paletaImagen = this.getPaletaColores(path);
            String paletaString = convertToString(paletaImagen);
            System.out.println(paletaString);
            Senial senial = new Senial("imagen de prueba",path,paletaString);
            SenialDAO senialDAO = new SenialDAO();
            senialDAO.saveSenial(senial);
	}
	
	
	   /**
		 * Invocuta el ST para la busqueda de resultados similiares
		 * @param path
		 */
	public ArrayList<String> findSimilarImagesAs(String path){
		SenialDAO senialDAO = new SenialDAO();
		return senialDAO.getSimilarImages("aqui va la paleta obtenida");
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
                File outputfile = new File("C:\\Señales\\zout.png");
                ImageIO.write(this.imgCopy, "png", outputfile);
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
                                if(j == hastaY -1 || i==hastaX -1){
                                  this.setColorRGB(i, j, this.coloresSeniales.get(this.getSimilarColorPosition(pixel)), true);  
                                }
                                else{
                                    this.setColorRGB(i, j, this.coloresSeniales.get(this.getSimilarColorPosition(pixel)), false);  
                                }
                                
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
        
        /**
	 * Inserta el color detectado de la paleta personalizada en la imagen de salida
	 * @param colorRGB
         * @param x
         * @param y
	 */
	public void setColorRGB (int x, int y, int[] colorRGB, boolean black) {
            Color color;
            if(black){
                color = new Color(0,0,0);
            }
            else{
                color = new Color(colorRGB[0],colorRGB[1],colorRGB[2]);
            }
                this.imgCopy.setRGB(x, y, color.getRGB());
	}
	
	
	
	
	//Calculo de distancia entre imagenes. ESTE ES CODIGO DE PRUEBA
        /**
	 * Calcula la distancia euclideana entre dos imagenes
	 * @param img1
         * @param img2
	 * @return double
	 */
	public double calcularDistanciaEuclideanaConPesos(ArrayList<int[]>img1, ArrayList<int[]>img2) {
            double sum = 0;
            double[] pesos = null;
            double[] pesos16Cuadrantes = {
                0.2, 0.6, 0.6, 0.2,
                0.6, 0.8, 0.8, 0.6, 
                0.6, 0.8, 0.8, 0.6, 
                0.2, 0.6, 0.6, 0.2};
            double[] pesos25Cuadrantes = {
                0.2, 0.2, 0.6, 0.2, 0.2, 
                0.2, 0.8, 0.8, 0.8, 0.2, 
                0.6, 0.8, 0.8, 0.8, 0.6, 
                0.2, 0.8, 0.8, 0.8, 0.2, 
                0.2, 0.2, 0.6, 0.2, 0.2};
            double[] pesos49Cuadrantes = {
                0.1, 0.2, 0.4, 0.6, 0.4, 0.2, 0.1,
                0.1, 0.4, 0.8, 0.8, 0.8, 0.4, 0.1,
                0.4, 0.8, 0.8, 0.8, 0.8, 0.8, 0.4,
                0.6, 0.8, 0.8, 0.8, 0.8, 0.8, 0.6,
                0.4, 0.8, 0.8, 0.8, 0.8, 0.8, 0.4,
                0.1, 0.4, 0.8, 0.8, 0.8, 0.4, 0.1,
                0.1, 0.2, 0.4, 0.6, 0.4, 0.2, 0.1,
            };
            switch (CANTIDAD_CUADRANTES_POR_LADO){
                case 4:
                    pesos = pesos16Cuadrantes;
                    break;
                case 5:
                    pesos = pesos25Cuadrantes;
                    break;
                case 7:
                    pesos = pesos49Cuadrantes;
                    break;
                default:
                    break;
            }                
            System.err.println(img1.size());
            for (int i = 0; i < img1.size(); i++) {
                    //System.out.println(pesos[i]);
                    sum = sum + (this.obtenerDiferenciaConPeso(img1.get(i), img2.get(i), pesos[i]));
            }
            return Math.sqrt(sum);
	}
        
	/**
	 * calcula la diferencia del mismo cuadrante en dos imagenes distintas
	 * @param hist_1
         * @param hist_2
         * @param peso
	 * @return double
	 */
	public double obtenerDiferenciaConPeso(int[]hist_1, int[]hist_2, double peso) {
		double sum = 0;
		for (int i = 0; i < hist_1.length; i++) {
			sum = sum + (Math.pow(Math.abs(hist_1[i]-hist_2[i]), 2)*peso);
		}
		return sum;
	}
	
	
}
