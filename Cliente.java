/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * EJERCICIO#6 
 * JAVIER ALEJANDRO PRADO RAMIREZ 21486 | ANGEL GABRIEL PEREZ FIGUEROA 21298
 * PROGRAMA UTILIZADO | APACHE NETBEANS
 * INGENIERÍA EN CIENCIAS DE LA COMPUTACIÓN Y TI
 */

import java.util.*;
/**
 *
 * Funcionalidad: Esta clase tiene como deber representar todas las características que son provenientes del cliente, sus atributos y acciones
 */


public class Cliente {
    private String nombre;
    private String INT;
    private String fecha;
    private String Factura;
    private String pais;
    private int valor; // monto
    
    protected int TotalPrecio;
    protected int PrecioTotal;
    protected int SmartphonePrecio = 1000;
    protected int CelularPrecio = 200;
    protected int TelefonoFijoPrecio = 300;
    protected int CamaraPrecio = 6249;
    protected int TVPrecio = 3600;
    protected int TabletPrecio = 1999;
    protected int SmartwatchPrecio = 2999;
    protected int LaptopPrecio = 2500;
    protected int DesktopPrecio = 2000;
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getINT() {
        return INT;
    }

    public void setINT(String INT) {
        this.INT = INT;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFactura() {
        return Factura;
    }

    public void setFactura(String Factura) {
        this.Factura = Factura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
