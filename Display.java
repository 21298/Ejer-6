/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6Parejas;

import java.util.Scanner;


public class Display {
    
    Scanner intscanner = new Scanner(System.in);
    Scanner stringscanner = new Scanner(System.in);
    
    public void inicio(){
        System.out.println("--------------------------------------------");
        System.out.println("-Bienvenido a Electronica Latinoamericana --");
        System.out.println("--------------------------------------------");
        
    }
    
    public int menuPrincipal(){
        System.out.println("¿Que acción deseas realizar?");
        System.out.println("""
                           (1) Ver Productos
                           (2) Carrito de Compras
                           (3) Probar Funcionalidades
                           (4). Salir""");
        
        int opcion = intscanner.nextInt();
        return opcion; 
    }
    
    public String pedirNombre(){
        System.out.println("Ingrese su nombre: ");
        return stringscanner.nextLine();
    }
    public String pedirNIT(){
        System.out.println("Ingrese su NIT: ");
        return intscanner.nextLine();
    }
    public String fecha(){
        System.out.println("Ingrese la fecha en formato - |dia/mes/año|: ");
        return stringscanner.nextLine();
    }
    public String pedirPais(){
        System.out.println("Ingrese el país: ");
        return stringscanner.nextLine();
    }
    public String pedirFactura(){
        System.out.println("Ingrese el numero de factura: ");
        return intscanner.nextLine();
    }
    public String precio(){
        System.out.println("Ingrese el precio: ");
        return intscanner.nextLine();
    }
    public String pedirSerie(){
        System.out.println("Ingrese el numero de Serie: ");
        return stringscanner.nextLine();
    }
    public String pedirMarca(){
        System.out.println("Ingrese la marca");
        return stringscanner.nextLine();
    }
    public String pedirFabricacion(){
        System.out.println("Ingrese la fecha de Fabricación: ");
        return stringscanner.nextLine();
    }
    public String pedirMarcadorAR(){
        System.out.println("Ingrese el marcador AR del producto: ");
        return stringscanner.nextLine();
    }
    public String solicitarVideo(){
        System.out.println("ingrese el video que quiere solicitar ");
        return stringscanner.nextLine();
    }
    public String solicitarJuego(){
        System.out.println("ingrese el Juego que quiere solicitar ");
        return stringscanner.nextLine();
    }
    public String solicitarLink(){
        System.out.println("ingrese el URL que quiere solicitar ");
        return stringscanner.nextLine();
    }
    
    
}
