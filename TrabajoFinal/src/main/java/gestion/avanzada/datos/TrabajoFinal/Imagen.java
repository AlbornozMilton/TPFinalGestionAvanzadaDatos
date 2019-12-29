package gestion.avanzada.datos.TrabajoFinal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Imagen {
	
	private String ruta = "C:\\Señales\\001.PNG";
	private BufferedImage img;
	
	//public Map<String, int[]> colores = new HashMap<String, int[]>();
	public ArrayList<int[]> colores = new ArrayList<int[]>();
	public ArrayList<int[]> paleta = new ArrayList<int[]>();
	
	//COLORES
	
	//NEGRO
	static final int[] negroRGB = {0,0,0};
	//AZUL
	static final int[] azulRGB = {0,0,255};
	//AZUL CLARO
	static final int[] azulClaroRGB = {80,80,255};
	//AZUL OSCURO
	static final int[] azulOscuroRGB = {0,0,140};
	//MARRON
	static final int[] marronRGB = {120,80,20};
	//MARRON CLARO
	static final int[] marronClaroRGB = {190,140,70};
	//GRIS
	static final int[] grisRGB = {160,160,160};
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
	//PURPURA
	static final int[] purpuraRGB = {120,0,255};
	//ROJO
	static final int[] rojoRGB = {255,0,0};
	//ROJO CLARO
	static final int[] rojoClaroRGB = {255,80,80};
	//ROJO OSCURO
	static final int[] rojoOscuroRGB = {160,0,0};
	//BLANCO
	static final int[] blancoRGB = {255,255,255};
	//AMARILLO
	static final int[] amarilloRGB = {255,255,0};
	//AMARILLO CLARO
	static final int[] amarilloClaroRGB = {255,255,130};
	//AMARILLO OSCURO
	static final int[] amarilloOscuroRGB = {220,220,0};
	
	
	public Imagen() {
		/*
		this.colores.put("negroRGB", Imagen.negroRGB);
		this.colores.put("azulRGB", Imagen.azulRGB);
		this.colores.put("azulClaroRGB", Imagen.azulClaroRGB);
		this.colores.put("azulOscuroRGB", Imagen.azulOscuroRGB);
		this.colores.put("marronRGB", Imagen.marronRGB);
		this.colores.put("marronClaroRGB", Imagen.marronClaroRGB);
		this.colores.put("grisRGB", Imagen.grisRGB);
		this.colores.put("verdeRGB", Imagen.verdeRGB);
		this.colores.put("verdeClaroRGB", Imagen.verdeClaroRGB);
		this.colores.put("verdeOscuroRGB", Imagen.verdeOscuroRGB);
		this.colores.put("naranjaRGB", Imagen.naranjaRGB);
		this.colores.put("magentaRGB", Imagen.magentaRGB);
		this.colores.put("purpuraRGB", Imagen.purpuraRGB);
		this.colores.put("rojoRGB", Imagen.rojoRGB);
		this.colores.put("rojoClaroRGB", Imagen.rojoClaroRGB);
		this.colores.put("rojoOscuroRGB", Imagen.rojoOscuroRGB);
		this.colores.put("blancoRGB", Imagen.blancoRGB);
		this.colores.put("amarilloRGB", Imagen.amarilloRGB);
		this.colores.put("amarilloClaroRGB", Imagen.amarilloClaroRGB);
		this.colores.put("amarilloOscuroRGB", Imagen.amarilloOscuroRGB);
		*/
		this.colores.add(Imagen.negroRGB);
		this.colores.add(Imagen.azulRGB);
		this.colores.add(Imagen.azulClaroRGB);
		this.colores.add(Imagen.azulOscuroRGB);
		this.colores.add(Imagen.marronRGB);
		this.colores.add(Imagen.marronClaroRGB);
		this.colores.add(Imagen.grisRGB);
		this.colores.add(Imagen.verdeRGB);
		this.colores.add(Imagen.verdeClaroRGB);
		this.colores.add(Imagen.verdeOscuroRGB);
		this.colores.add(Imagen.naranjaRGB);
		this.colores.add(Imagen.magentaRGB);
		this.colores.add(Imagen.purpuraRGB);
		this.colores.add(Imagen.rojoRGB);
		this.colores.add(Imagen.rojoClaroRGB);
		this.colores.add(Imagen.rojoOscuroRGB);
		this.colores.add(Imagen.blancoRGB);
		this.colores.add(Imagen.amarilloRGB);
		this.colores.add(Imagen.amarilloClaroRGB);
		this.colores.add(Imagen.amarilloOscuroRGB);
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
	 * Devuelve la paleta de colores de una imagen
	 * @param pathImage
	 * @return
	 * @throws IOException
	 */
	public ArrayList<int[]> getPaletaColores(String pathImage) throws IOException {
		this.loadImage(pathImage);
		int width = this.img.getWidth();
		int height = this.img.getHeight();
		int tamIntX = width/4;
		int tamIntY = height/4;
		int restoX = width - (tamIntX*4);
		int restoY = height - (tamIntY*4);
		int ptoPartidaX = 0;
		int ptoPartidaY = 0;
		for (int i = 0; i < 4; i++) {
			int tamanioY = tamIntY;
			if (restoY > 0) {
				tamanioY++;
				restoY--;
			}
			restoX = width - (tamIntX*4);
			ptoPartidaX = 0;
			for (int j = 0; j<4; j++) {
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
		for (int i=1; i<20; i++) {
			float distance = this.getEuclideanDistance(pixelColor, this.colores.get(i));
			if (distance < min) {
				min = distance;
				pos = i;
			}
		}
		return pos;
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
		int[] histograma = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
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
