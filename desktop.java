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
 * Funcionalidad: representación de los dispositivos tipo dekstop
 * 
 */
public class desktop extends productos implements navegarInternet, reproduccionVideos, videoJuegos {
    Scanner stringscanner = new Scanner(System.in);
    private String videoURL;
    private String navegacionURL;
    public desktop(){
        
    }

    @Override
    public void navegarInternet() {
        System.out.println("Ingrese la dirección web que desea visitar: ");
        navegacionURL = stringscanner.nextLine();
        System.out.println("Visitando la dirección web "+navegacionURL+"desde mi desktop");
    }

    @Override
    public void reproduccionVideos() {
        System.out.println("Ingrese el URL del video que desea reproducir: ");
        videoURL = stringscanner.nextLine();
        System.out.println("Reproduciendo " + videoURL);
    }

    @Override
    public void videoJuegos() {
        System.out.println("Jugando mario kart");
    }
    
    
    public desktop(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    
    @Override
    public String mostrarDatos(){
        return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    
}
