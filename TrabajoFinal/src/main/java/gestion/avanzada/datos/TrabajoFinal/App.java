package gestion.avanzada.datos.TrabajoFinal;

import gestion.avanzada.datos.UI.PantallaPpal;
import java.io.IOException;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	PantallaPpal ventana = new PantallaPpal();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    	Imagen img = new Imagen();
    	ArrayList<int[]> paleta = img.getPaletaColores("C:\\Señales\\083-prueba.PNG");
        System.out.println(paleta);
    	for (int[] is : paleta) {
    		System.out.println(""); 
    		for (int num: is) {
    			System.out.print(num + "-");    			
    		}
		} 	
    }
}
