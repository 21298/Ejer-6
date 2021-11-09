/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alexd
 */
public class desktop extends productos implements navegarInternet, reproduccionVideos, videoJuegos {


    @Override
    public void navegarInternet() {
    }

    @Override
    public void reproduccionVideos() {
    }

    @Override
    public void videoJuegos() {
    }
    
    
    public desktop(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    
    @Override
    public String mostrarDatos(){
        return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    
}
