/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * EJERCICIO#6 
 * JAVIER ALEJANDRO PRADO RAMIREZ 21486 | ANGEL GABRIEL PEREZ FIGUEROA 21298
 * PROGRAMA UTILIZADO | APACHE NETBEANS
 * INGENIERÍA EN CIENCIAS DE LA COMPUTACIÓN Y TI
 */


import java.util.Scanner;




/**
 * Funcionalidad: representación de los dispositivos tipo SmartWatch
 * 
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