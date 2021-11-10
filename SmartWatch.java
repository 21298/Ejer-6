
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alexd
 */
public class SmartWatch extends productos implements tomarFoto, portabie, llamadas {
    Scanner stringscanner = new Scanner(System.in);
    private String numero; 

    public SmartWatch(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    public SmartWatch(){
        
    }
    

    @Override
    public void tomarFoto() {
        System.out.println("Tomando foto...");
    }

    @Override
    public void portable() {
    }

    @Override
    public void llamadas() {
        System.out.println("A que numero desea llamar");
        numero = stringscanner.nextLine();
        System.out.println("LLamando al numero " + numero + " desde mi Iphone " ); 
    }
    
    @Override
    public String mostrarDatos(){
                return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    
}