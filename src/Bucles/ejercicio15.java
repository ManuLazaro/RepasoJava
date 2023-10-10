/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author manul
 */
public class ejercicio15 {
    public static void main(String[] args) {
        
      System.out.print("Introduzca un numero real como base: ");
      Scanner entrada = new Scanner(System.in);
        double base = entrada.nextDouble();
    
      System.out.print("Introduzca un mumero entero como exponente: ");
      Double exponenteFinal = entrada.nextDouble();

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

  }  
}

