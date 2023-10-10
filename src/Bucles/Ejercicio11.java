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
public class Ejercicio11 {
    public static void main(String[] args) {
    
    System.out.print("Introduzca un nÃºmero: ");
    Scanner entrada = new Scanner(System.in);
    int numeroIntroducido = entrada.nextInt();
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
    
}
