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
 * 
 *     --> SoluciÃ³n alternativa sin utilizar arrays auxiliares y que conserva el orden original.
 * 
 * @author manul
 */
public class ejercicios10 {
    public static void main(String[] args) {
  
    int[] n = new int[20];
    int i;
    int j;
    int k;
    int aux;
    
    // Rellena el array con nÃºmeros aleatorios entre 0 y 100
    System.out.println("Array original");
    for (i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 101);
      System.out.print(n[i] + " ");
    }
    
    // En cada iteraciÃ³n del for se coloca un nÃºmero par en su posiciÃ³n correcta
    for (i = 0; i < 20; i++) {
      
      // Busca el siguiente par a partir de la posiciÃ³n actual
      j = i;
      while ((n[j++] % 2 != 0) && (j < 20));
      
      // Desplaza el nÃºmero par a su posiciÃ³n correcta (si quedan pares)
      if (j < 20) {
        for (k = j - 1; k > i; k--) {
          aux = n[k];
          n[k] = n[k - 1];
          n[k - 1] = aux;
        }
      }
    }

    // Muestra el resultado.
    System.out.println("\nArray con los pares al principio:");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
  }
}
