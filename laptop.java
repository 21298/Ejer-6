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

    @Override
    public void navegarInternet() {
    }

    @Override
    public void videoJuegos() {
    }

    @Override
    public void reproduccionVideos() {
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
