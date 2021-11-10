
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
public class telefonoFijo extends productos implements llamadas{
    Scanner stringscanner = new Scanner(System.in);
    private String numero;
    

    @Override
    public void llamadas() {
        System.out.println("A que numero desea llamar");
        numero = stringscanner.nextLine();
        System.out.println("LLamando al numero " + numero + " desde mi telefono de casa" );
    }
    
    public telefonoFijo(int precio, String serie, String marca, String fecha, String marcadorAR) {
        super(precio, serie, marca, fecha, marcadorAR);
    }
    
    @Override
    public String mostrarDatos(){
        return "Precio: " + precio + "\nSerie: " + serie + "\nMarca " + marca + "\nFecha: " + fecha + "\nMarcador AR: "+marcadorAR;
    }
    public telefonoFijo(){
        
    }
    
}
