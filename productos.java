/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alexd
 */
public class productos {
    
    protected int precio;
    protected String serie;
    protected String marca;
    protected String fecha;
    protected String marcadorAR;
    
    public productos(int precio, String serie, String marca,String fecha,String marcadorAR){
        this.precio = precio;
        this.serie = serie;
        this.marca = marca;
        this.fecha = fecha;
        this.marcadorAR = marcadorAR;  
    }
    public productos(){
    
}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMarcadorAR() {
        return marcadorAR;
    }

    public void setMarcadorAR(String marcadorAR) {
        this.marcadorAR = marcadorAR;
    }
    
    public String mostrarDatos(){
        return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    
    
    
    
}
