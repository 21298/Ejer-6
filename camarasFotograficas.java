
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class camarasFotograficas extends productos implements tomarFoto, reproduccionVideos, portabie{
        Scanner stringscanner = new Scanner(System.in);

    public camarasFotograficas(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    public camarasFotograficas(){
        
    }

    @Override
    public void tomarFoto() {
        System.out.println("Tomando foto...");

    }

    @Override
    public void reproduccionVideos() {
        System.out.println("Reproduciendo video de memoria");
    }

    @Override
    public void portable() {
    }
    
    @Override
    public String mostrarDatos(){
                return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
}
