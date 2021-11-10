
import java.util.Scanner;
public class smartPhones extends productos implements tomarFoto, portabie, navegarInternet, reproduccionVideos, llamadas{
    Scanner stringscanner = new Scanner(System.in);
    private String numero; 
    private String videoURL;
    private String navegacionURL;
    public smartPhones(){
        
    }
    



    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void tomarFoto() {   
        System.out.println("Tomando foto...");
    }

    @Override
    public void portable() {
    }

    @Override
    public void navegarInternet() {
        System.out.println("Ingrese la dirección web que desea visitar: ");
        navegacionURL = stringscanner.nextLine();
        System.out.println("Visitando la dirección web "+navegacionURL+" desde mi Iphone");
    }

    @Override
    public void reproduccionVideos() {
        System.out.println("Ingrese el URL del video que desea reproducir: ");
        videoURL = stringscanner.nextLine();
        System.out.println("Reproduciendo " + videoURL);


    }

 
    @Override
    public void llamadas() {
        System.out.println("A que numero desea llamar");
        numero = stringscanner.nextLine();
        System.out.println("LLamando al numero " + numero + " desde mi Iphone " ); 
    }

    public smartPhones(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
                this.numero = numero;
    }
      
    @Override
    public String mostrarDatos(){
                return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    

    
    
}
