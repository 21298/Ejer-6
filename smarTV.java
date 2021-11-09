/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6Parejas;

/**
 *
 * @author alexd
 */
public class smarTV extends productos implements navegarInternet, reproduccionVideos{

    public smarTV(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }

    @Override
    public void navegarInternet() {
    }

    @Override
    public void reproduccionVideos() {
    }
    
    @Override
    public String mostrarDatos(){
                return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    
}
