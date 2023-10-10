/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *  10. Escribe un programa que genere 20 nÃºmeros enteros aleatorios entre 0 y 100 y que los
 *     almacene en un array. El programa debe ser capaz de pasar todos los nÃºmeros pares a
 *     las primeras posiciones del array (del 0 en adelante) y todos los nÃºmeros impares a
 *     las celdas restantes. Utiliza arrays auxiliares si es necesario.
 * @author manul
 */
public class ejercicios10alt {
     public static void main(String[] args) {
  
    int[] n = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 101);
      // Separa los nÃºmeros metiendo los pares en un array
      // y los impares en otro.
      if (n[i] % 2 == 0) {
        par[pares++] = n[i];
      } else {
        impar[impares++] = n[i];
      }
    }
    
    // Muestra el array original
    System.out.println("Array original:");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    
    // Mete los pares en las primeras posiciones
    // del array original.
    for (i = 0; i < pares; i++) {
      n[i] = par[i];
    }
    
    // Mete los impares en los huecos que quedan.
    for (i = pares; i < 20; i++) {
      n[i] = impar[i - pares];
    }

    // Muestra el resultado.
    System.out.println("Array con los pares al principio:");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
  }
}
