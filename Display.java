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
        System.out.println("(1) Ver Productos\n"
                + "(2) Carrito de Compras\n"
                + "(3) Probar Funcionalidades\n"
                + "(4). Salir");
        
        int opcion = intscanner.nextInt();
        return opcion; 
    }
}
