/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio1ManuelLazaro;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class MainConsultor {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  
    //preguntas 
    System.out.println("¿Cuanto vale la casa?");
    Scanner entrada= new Scanner(System.in);
      int valorCasa = entrada.nextInt();
    System.out.println("¿Cuanto tienes de ahorro?");
        int cantidadAhorro = entrada.nextInt();
    System.out.println("¿Cuanto gana al mes?");
        int sueldoMensual = entrada.nextInt();
    System.out.println("¿Que edad tienes?");
        int edad = entrada.nextInt();
    
    //calculo del prestamos necesario
    int totalCantidad = valorCasa + ((valorCasa * 10)/100);
    int prestamoNecesario = totalCantidad - cantidadAhorro;
      
        Consultor alguien = new Consultor ();
        System.out.println("Posibilidad de pedir el prestamo:");
        alguien.esPosible(valorCasa, cantidadAhorro);
        System.out.println("Idoneo para pedir el prestamo:");
        alguien.esIdoneo(sueldoMensual,edad,prestamoNecesario);
        
     
        


  }
  
}
