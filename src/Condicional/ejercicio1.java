/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicional;

import java.util.Scanner;

/**
 *
 * @author manul
 */
public class ejercicio1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    String dia = entrada.nextLine();
    
    switch(dia) {
      case "lunes":
        // continÃºa debajo
      case "martes":
        // continÃºa debajo
      case "miÃ©rcoles":
        System.out.println("ProgramaciÃ³n");
        break;
      case "jueves":
        System.out.println("Sistemas InformÃ¡ticos");
        break;
      case "viernes":
        System.out.println("Bases de Datos");
        break;
      case "sÃ¡bado":
        // continÃºa debajo
      case "domingo":
        System.out.println("Â¡Ese dÃ­a no hay clase!");
        break;
      default:
        System.out.println("El dÃ­a introducido no es correcto.");
    }
    }
}
