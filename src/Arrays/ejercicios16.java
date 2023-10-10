/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author manul
 */
public class ejercicios16 {
     public static void main(String[] args) {
  
    int[] n = new int[20];

    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");
    }
    
    System.out.print("\n\nÂ¿QuÃ© nÃºmeros quiere resaltar? ");
    System.out.print("(1 â€“ los mÃºltiplos de 5, 2 â€“ los mÃºltiplos de 7): ");
    Scanner entrada = new Scanner(System.in);
    int opcion = entrada.nextInt();

    int multiplo = (opcion == 1) ? 5 : 7;

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento % multiplo == 0) {
        System.out.print("[" + elemento + "] ");
      } else {
        System.out.print(elemento + " ");
      }
    }
  }
}
