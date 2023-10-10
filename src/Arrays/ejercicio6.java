/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *  6. Escribe un programa que lea 15 numeros por teclado y que los almacene en un array. Rota los
 *    elementos de ese array, es decir, el elemento de la posicion 0 debe pasar a la posicion 1,
 *    el de la 1 a la 2, etc. El numero que se encuentra en la ultima posicion debe pasar a la
 *    posicion 0. Finalmente, muestra el contenido del array.
 * @author manul
 */
public class ejercicio6 {
     public static void main(String[] args) {
    
      int[] numero = new int[15];
      int i;
      
      System.out.println("Vaya introduciendo nÃºmeros enteros y pulsando INTRO:");
      
      for (i = 0; i < 15; i++) {
        numero[i] = Integer.parseInt(System.console().readLine());
      }
      
      System.out.println();
      
      // Muestra el array original ///////////////
      System.out.println("Array original:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("âŽ¯");
      }
      System.out.println("âŽ¯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
      ////////////////////////////////////////////
      
      // rota una posiciÃ³n a la derecha //////////
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;
      ////////////////////////////////////////////

      // Muestra el array rotado /////////////////
      System.out.println("\nArray rotado a la derecha una posiciÃ³n:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("âŽ¯");
      }
      System.out.println("âŽ¯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
      ////////////////////////////////////////////
  }
}
