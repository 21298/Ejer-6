
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
public class laptop extends productos implements navegarInternet, videoJuegos, reproduccionVideos, portabie{
    Scanner stringscanner = new Scanner(System.in);
    private String videoURL;
    private String navegacionURL;
    @Override
    public void navegarInternet() {
        System.out.println("Ingrese la dirección web que desea visitar: ");
        navegacionURL = stringscanner.nextLine();
        System.out.println("Visitando la dirección web "+navegacionURL+"desde mi desktop");
    }
    public laptop(){
        
    }

    @Override
    public void videoJuegos() {
        System.out.println("Jugando Warzone");
    }

    @Override
    public void reproduccionVideos() {
        System.out.println("Ingrese el URL del video que desea reproducir: ");
        videoURL = stringscanner.nextLine();
        System.out.println("Reproduciendo " + videoURL);
        
    }

    @Override
    public void portable() {
    }
    
    public laptop(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    
    @Override
    public String mostrarDatos(){
                return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
}
