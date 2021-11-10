

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * EJERCICIO#6 
 * JAVIER ALEJANDRO PRADO RAMIREZ 21486 | ANGEL GABRIEL PEREZ FIGUEROA 21298
 * PROGRAMA UTILIZADO | APACHE NETBEANS
 * INGENIERÍA EN CIENCIAS DE LA COMPUTACIÓN Y TI
 */



/**
 * Funcionalidad: A través de esta clase se podrá manejar y llevar la compilación del programa
 * 
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Display dis = new Display();
        smartPhones sPhoness = new smartPhones();
        celulares celul = new celulares();
        telefonoFijo tFijo = new telefonoFijo();
        camarasFotograficas cam = new camarasFotograficas();
        desktop deskt = new desktop();
        laptop lapt = new laptop();
        smarTV TVs = new smarTV();
        tablet tabs = new tablet();
        SmartWatch smawa = new SmartWatch();
        List<String> carrito = new ArrayList<String>();
        List<Integer> Precios = new ArrayList<Integer>();
        Cliente c = new Cliente();
        
        dis.inicio();
        boolean stop = false;
        while (!stop) {
            try{
                int opcion = dis.menuPrincipal();
                switch(opcion){
                    case 1:
                        try{
                           int ver = dis.verProducto();
                           switch(ver){
                               case 1: //smartphone
                                   productos sPhones = new smartPhones(1000,"13","Iphone","15/08/2021","https://apple.co/3F4ygCu");
                                   System.out.println(sPhones.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 2://celulares
                                   productos celu = new celulares(200,"5.0","Nokia","25/07/2002","https://bit.ly/3qo6M6K");
                                   System.out.println(celu.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 3://telefonos fijos
                                   productos fijo = new telefonoFijo(300,"SPECIAL","Claro","11/07/2002","https://bit.ly/307Gf2e");
                                   System.out.println(fijo.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 4://camaras fotograficas
                                   productos camara = new camarasFotograficas(6249,"AF-P DX NIKKOR 18-55","Nikon","9/11/2021","https://bit.ly/303Cafw");
                                   System.out.println(camara.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 5://Computador Personal (Desktop)
                                   productos desk = new desktop(8000,"HP pro desk","HP","14/07/2021","https://bit.ly/3qoqLlp");
                                   System.out.println(desk.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 6://Computador Personal (laptop)
                                   productos lap = new laptop(2500,"4A189UG","HP Pavilion","27/10/2021","https://bit.ly/3C0MrX2");
                                   System.out.println(lap.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 7://Smart TV
                                   productos TV = new smarTV(3600,"UN40N5200AFXZA","Samsung","15/07/2021","https://bit.ly/3wvLLrC");
                                   System.out.println(TV.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 8://Tablets
                                   productos tab = new tablet(1999,"SM-T505NZAAGTO","Samsung","10/05/2021","https://bit.ly/3mZ6OQ4");
                                   System.out.println(tab.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               case 9: //Smartwatch
                                   productos swatch = new SmartWatch(2999,"SM-R880NZKALTA","Samsung","29/12/2020","https://bit.ly/3mY5PzE");
                                   System.out.println(swatch.mostrarDatos());
                                   System.out.println("\n");
                                   break;
                               default:
                                   dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                          
                           }
                        }catch(Exception e){
                            dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!");
                            scan.nextLine();
                        }
                        break;
                    case 2:
                        try{
                        int prueba = dis.probar();
                        switch(prueba){
                            case 1: //smartphone
                                int psmart = dis.pruebaSmartPhone();
                                switch(psmart){
                                    case 1:
                                        sPhoness.llamadas();
                                        break;
                               
                                    case 2: 
                                        sPhoness.tomarFoto();
                                        break;
                                    case 3:
                                        sPhoness.navegarInternet();
                                        break;
                                    case 4:
                                        sPhoness.reproduccionVideos();
                                        break;

                                default:
                                    dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                    

                                }

                                   System.out.println("\n");
                                   break;
                               case 2://celulares
                                   int pcelular = dis.pruebaCelular();
                                   switch(pcelular){
                                       case 1:
                                           celul.llamadas();
                                           break;
                                       default:
                                           dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                   }
                                   System.out.println("\n");
                                   break;
                               case 3://telefonos fijos
                                   try{
                                   int pFijo = dis.pruebaTelefonoFijo();
                                   switch(pFijo){
                                       case 1:
                                           tFijo.llamadas();
                                           break;
                                       default:
                                           dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");

                                   }
                                   }catch(Exception e){
                                       dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                       scan.nextLine();

                                   }
                                   

                                   System.out.println("\n");
                                   break;
                               case 4://camaras fotograficas
                                   try{
                                   int coption = dis.pruebaCamara();
                                   switch(coption){
                                       case 1:
                                           cam.tomarFoto();
                                           break;
                                       case 2: 
                                           cam.reproduccionVideos();
                                           break;
                                       default:
                                           dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");

                                   }
                                   }catch(Exception e){
                                       dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                       scan.nextLine();

                                   }

                                   System.out.println("\n");
                                   break;
                               case 5://Computador Personal (Desktop)
                                   try{
                                   int deskoption = dis.pruebaDesktop();
                                   switch(deskoption){
                                       case 1:
                                           deskt.navegarInternet();
                                           break;
                                       case 2:
                                           deskt.reproduccionVideos();
                                           break;
                                       case 3:
                                           deskt.videoJuegos();
                                           break;
                                       default:
                                       dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                   }
                                   }catch(Exception e){
                                       dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                       scan.nextLine();
                                   }

                                   break;
                               case 6://Computador Personal (laptop)
                                   try{
                                       int lapoption = dis.pruebaLaptop();
                                       switch(lapoption){
                                           case 1:
                                               lapt.navegarInternet();
                                               break;
                                           case 2:
                                               lapt.videoJuegos();
                                               break;
                                           case 3:
                                               lapt.reproduccionVideos();
                                               break;
                                           default:
                                               dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");    
                                       }
                    
                                   }catch(Exception e){
                                       dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                       scan.nextLine();
  
                                   }

                                   break;
                               case 7://Smart TV
                                   try{
                                       int soption = dis.pruebaSmartTV();
                                       switch(soption){
                                           case 1:
                                               TVs.navegarInternet();
                                               break;
                                           case 2:
                                               TVs.reproduccionVideos();
                                               break;
                                           default:
                                               dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                       }
                                       
                                   }catch(Exception e){
                                       dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                       scan.nextLine();
                                   }

                                   break;
                               case 8://Tablets
                                   try{
                                   int toption = dis.pruebaTablets();
                                   switch(toption){
                                       case 1:
                                           tabs.tomarFoto();
                                           break;
                                       case 2:
                                           tabs.navegarInternet();
                                           break;
                                       case 3: 
                                           tabs.reproduccionVideos();
                                           break;
                                       default:
                                          dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                   }
                                   }
                                   catch(Exception e){
                                           dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                           scan.nextLine();
                                   }

                                   break;
                               case 9: //Smartwatch
                                   try{
                                   int smartoption = dis.pruebaSmartWatch();
                                   switch(smartoption){
                                       case 1:
                                           smawa.tomarFoto();
                                           break;
                                       case 2:
                                           smawa.llamadas();
                                           break;
                                       default:
                                           dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                   }
                                   }catch(Exception e){
                                       dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                                       scan.nextLine();
                                   }

                                   break;
                               default:
                                   dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                        }
                        }catch(Exception e){
                            dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!!");
                            scan.nextLine();
                        }
                        break;
                        
                    case 3:   // carrito    
                        try{
                            int opcioncompra = dis.compra();
                            switch(opcioncompra){
                                case 1: // Smartphone
                                    System.out.println("Se ha añadido un SmartPhone a su carrito ");
                                    carrito.add("Iphone 13");
                                    Precios.add(c.SmartphonePrecio);
                                    break;
                                    
                                case 2: // Celular
                                    System.out.println("Se ha añadido un Celular a su carrito");
                                    carrito.add("Nokia");
                                    Precios.add(c.CelularPrecio);
                                    break;
                                
                                case 3: // Telefono Fijo
                                    System.out.println("Se ha añadido un Telefono Fijo a su carrito");
                                    carrito.add("Telefono Fijo");
                                    Precios.add(c.TelefonoFijoPrecio);
                                    break;
                                case 4:  // camara
                                    System.out.println("Se ha añadido una camara fotografica a su carrito");
                                    carrito.add("Cámara Nikon");
                                    Precios.add(c.CamaraPrecio);
                                    break;
                                case 5: //Desktop
                                    System.out.println("Se ha añadido una computadora(Desktop) a su carrito");
                                    carrito.add("HP");
                                    Precios.add(c.DesktopPrecio);
                                    break;
                                case 6: //Laptop
                                    System.out.println("Se ha añadido una laptop a su carrito");
                                    carrito.add("HP Pavilion");
                                    Precios.add(c.LaptopPrecio);
                                    break;
                                case 7:
                                    System.out.println("Se ha añadido una smartTV a su carrito");
                                    carrito.add("LG Galaxy");
                                    Precios.add(c.TVPrecio);
                                    break;
                                case 8:
                                    System.out.println("Se ha añadido una tablet a su carrito");
                                    carrito.add("IPAD");
                                    Precios.add(c.TabletPrecio);
                                    break;
                                case 9:
                                    System.out.println("Se ha añadido un SmartWatch a su carrito");
                                    carrito.add("SmartWatch");
                                    Precios.add(c.SmartwatchPrecio);
                                    break;
                                default:
                                    dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                                    
                                    
                            }
                            
                            
                        }catch(Exception e){
                            dis.print("Ha ocurrido un error, Reinicie el programa y corra de nuevo!");
                            scan.nextLine();
                        }
                        
                        
                        break;
                    case 4: // Pagar Carrito - Se agrego esta opcion como una actualizacion del programa, y es necesario por que es un requisito funcional
                        for(Integer data : Precios){
                                        c.TotalPrecio += data;
                                    }
                                    System.out.println("Total a pagar:\n"+c.TotalPrecio);
                                    dis.facturar();
                        break;
                    
                    case 5:
                        stop = true;
                        System.out.println("Sesión cerrada, hasta la próxima");
                        break;
                        
                        
                    default:
                        dis.print("Ha escogido una opcion no disponible, Intente de nuevo!");
                }
            }catch(Exception e){
                dis.print("Ha ocurrido un error, Reinicie el programa y corra de nueva!");
                scan.nextLine();
            }
            
        }
       
        
    }
    
}
