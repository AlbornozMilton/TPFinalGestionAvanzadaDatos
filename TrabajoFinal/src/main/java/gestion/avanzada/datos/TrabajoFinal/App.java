package gestion.avanzada.datos.TrabajoFinal;

import java.io.IOException;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	Imagen img = new Imagen();
    	ArrayList<int[]> paleta = img.getPaletaColores("C:\\Señales\\001.PNG");
    	for (int[] is : paleta) {
    		System.out.println(""); 
    		for (int num: is) {
    			System.out.print(num + "-");    			
    		}
		} 	
    }
}
