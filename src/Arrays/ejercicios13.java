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
public class ejercicios13 {
    public static void main(String[] args) {
  
    int[] n = new int[100];
    int maximo = 0;
    int minimo = 100;

    // Genera los nÃºmeros y calcula el mÃ¡ximo y el mÃ­nimo
    for (int i = 0; i < 100; i++) {
      n[i] = (int)(Math.random() * 501);
      
      if (n[i] < minimo) {
        minimo = n[i];
      }
      
      if (n[i] > maximo)  {
        maximo = n[i];
      }
    }

    // Muestra el array original
    for (int elemento : n) {
      System.out.print(elemento + " ");
    }
    
    System.out.print("\n\nÂ¿QuÃ© quiere destacar? (1 â€“ mÃ­nimo, 2 â€“ mÃ¡ximo): ");
    Scanner entrada = new Scanner(System.in);
    int opcion = entrada.nextInt();

    int destacado; // nÃºmero que se va a destacar del resto
    
    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }

    System.out.println();

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento == destacado) {
        System.out.print(" **" + elemento + "** ");
      } else {
        System.out.print(elemento + " ");
      }
    }
  }
}
