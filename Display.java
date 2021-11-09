/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        System.out.println("Que accion deseas realizar?");
        System.out.println("(1) Ver Productos\n"
                + "(2) Probar Funcionalidades\n"
                + "(3) Carrito de Compras\n"
                + "(4). Salir");
        
        int opcion = intscanner.nextInt();
        return opcion; 
    }
    
    public void print(String text){
        System.out.println(text);
    }
    
    public int verProducto (){
        System.out.println("Que producto desea ver?");
        System.out.println("(1) SmathPhones\n"
                + "(2) Telefonos Celulares\n{"
                + "(3) Telefonos Fijos\n"
                + "(4) Camaras Fotograficas\n"
                + "(5) Computador Personal (Desktop)\n"
                + "(6) Computador Personal (Laptop)\n"
                + "(7) SmartTV\n"
                + "(8) Tablets\n"
                + "(9) SmartWatch\n"
                + "Presione un numero");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int probar(){
        System.out.println("Que producto desea probar");
        System.out.println("(1) SmathPhones\n"
                + "(2) Telefonos Celulares\n{"
                + "(3) Telefonos Fijos\n"
                + "(4) Camaras Fotograficas\n"
                + "(5) Computador Personal (Desktop)\n"
                + "(6) Computador Personal (Laptop)\n"
                + "(7) SmartTV\n"
                + "(8) Tablets\n"
                + "(9) SmartWatch\n"
                + "Presione un numero");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
}
