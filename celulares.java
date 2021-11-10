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
 *Funcionalidad: representación de los dispositivos tipo celulares
 * 
 */
public class celulares extends productos implements llamadas, portabie {
    Scanner stringscanner = new Scanner(System.in);
    private String numero; 


    @Override
    public void llamadas() {
        System.out.println("A que numero desea llamar");
        numero = stringscanner.nextLine();
        System.out.println("LLamando al numero " + numero + " desde mi Nokia " );
        
    }

    @Override
    public void portable() {
    }
    
    @Override
    public String mostrarDatos(){
                return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    
    public celulares(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    public celulares(){
        
    }

    
}
