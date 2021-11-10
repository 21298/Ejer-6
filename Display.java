/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * EJERCICIO#6 
 * JAVIER ALEJANDRO PRADO RAMIREZ 21486 | ANGEL GABRIEL PEREZ FIGUEROA 21298
 * PROGRAMA UTILIZADO | APACHE NETBEANS
 * INGENIERÍA EN CIENCIAS DE LA COMPUTACIÓN Y TI
 */


/*
 * Funcionalidad: Se utiliza para la recolección y demostración “gráfica” del programa, es decir, todos los menús, el ingreso de datos, etc
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
                + "(4) Pagar Carrito\n"
                + "(5). Salir");
        
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
        System.out.println("(1) SmartPhones\n"
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
    
    public int compra(){
        System.out.println("Que producto desea comprar: ");
        System.out.println("(1) SmartPhones\n"
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
    
    public int pruebaSmartPhone(){
        System.out.println("Que funcion quieres probar del smarthPhone (Es portable)");
        System.out.println("(1) Llamadas\n"
                + "(2) Fotografía\n"
                + "(3) Navegar Por internet\n"
                + "(4) Reproduccion de videos\n");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int pruebaCelular(){
        System.out.println("Que funcion quieres probar del celular(es Portable)");
        System.out.println("(1) Llamadas\n");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    //Funcionalidades para el telefono Fijo
    public int pruebaTelefonoFijo(){
        System.out.println("Que funcion quieres probar del celular");
        System.out.println("(1) Llamadas\n");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    //Funcionalidades para camaras fotograficas
    public int pruebaCamara(){
        System.out.println("Que funcion quieres probar de la camara (Es portable)");
        System.out.println("(1) Fotografias\n");
        System.out.println("(2) Videos");
        int opcion = intscanner.nextInt();
        return opcion;
    }

    //Funcionalidades para computador personal
    public int pruebaDesktop(){
        System.out.println("Que funcion quieres probar del computador personal: ");
        System.out.println("(1) Navegar por internet\n");
        System.out.println("(2) Videos\n");
        System.out.println("(3) Ejcutar juegos");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    //Funcionalidades para laptop
    public int pruebaLaptop(){
        System.out.println("Que funcion quieres probar de laptop(Es portable) ");
        System.out.println("(1) Navegar por internet\n");
        System.out.println("(2) Ejecutar juegos\n");
        System.out.println("(2) Videos");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
//Funcionalidades para Smart TV
    public int pruebaSmartTV(){
        System.out.println("Que funcion quieres probar de la SmartTV ");
        System.out.println("(1) Navegar por internet\n");
        System.out.println("(2) Videos");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }

    public int pruebaTablets(){
        System.out.println("Que funcion quieres probar da la tablet ");
        System.out.println("(2) Fotografias\n");
        System.out.println("(1) Navegar por internet\n");
        System.out.println("(2) Videos");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
//Funcionalidades para Smart Watch
    public int pruebaSmartWatch(){
        System.out.println("Que funcion quieres probar del SmartWatch (Es portable)");
        System.out.println("(2) Fotografias\n");
        System.out.println("(1) Llamadas\n");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    private String Nombrec;
    private String NITC;
    private String fechaC;
    public String facturar(){ //Se agregó este metodo para pooder facturar las compras del cliente de una mejor manera
        
        System.out.println("Ingrese el nombre del cliente: ");
        Nombrec = stringscanner.nextLine();
        System.out.println("Ingrese el numero de NIT: ");
        NITC = stringscanner.nextLine();
        System.out.println("Ingrese la fehca dd-mm-año");
        fechaC = stringscanner.nextLine();
        
        System.out.println("\nElectronica Latinoamericana\n"
                + "Nombre: "+Nombrec 
                +"\nNIT: " + NITC
        +"\nFecha: "+ fechaC
        +"\nGracias por su compra :D");
        System.out.println("");
        return "Nombre: " + Nombrec + "\nNIT: " + NITC ;
        
    
    }
            




    
  


}

