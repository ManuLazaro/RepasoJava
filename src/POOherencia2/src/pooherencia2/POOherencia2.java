/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOherencia2.src.pooherencia2;

import java.util.Scanner;
import pooherencia2.Vehiculo.Bicicleta;

/**
 *
 * @author DAM
 */
public class POOherencia2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Vehiculo bici = new Vehiculo ("Bici de carretera",120 ) {};
    Vehiculo coche = new Vehiculo ("coche electrico", 300) {};
    Bicicleta biciRoja = new Bicicleta ("De montaña", 100);
    Coche cocheRojo = new Coche ();
    
    int numero=0;
    Scanner entrada= new Scanner(System.in);
    do {
            System.out.println("*****MENU OPCIONES*****\nSeleccione una Opcion\n 1. Anda con la bicicleta\n 2. Haz el caballito con la bicicleta\n3.Anda con el coche \n4. Quema rueda con\n" +
"el coche \n5. Ver kilometraje de la bicicleta\n6. Ver kilometraje del coche\n7. Ver kilometraje total\n8. Salir***********************");
            numero=entrada.nextInt();     
            switch (numero) {
                case 1:
                        biciroja.andarBici();              
                    break;
                case 2:
                        biciroja.hacerCabalito();   
                     break;
                case 3:
                        coche.andarCoche();
                     break;
                case 4:
                        coche.quemarRueda();
                     break;
                case 5:
                        biciroja.getKilomerosRecorridos();
                    break;
                case 6:
                        coche.getKilometrosRecorridos();
                     break;
                case 7:
                        Vehiculo.getKilometrosTotal();
                     break;
                case 8: 
                     break;  
            }
        } while (numero != 8);
        System.out.println("HASTA PRONTO: ");
  }
  
}
