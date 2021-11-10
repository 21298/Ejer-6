
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
 *
 * Funcionalidad: representación de los dispositivos tipo camara
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
