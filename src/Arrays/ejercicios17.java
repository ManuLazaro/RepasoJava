/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author manul
 */
public class ejercicios17 {
    public static void main(String[] args) {
  
    int[] n = new int[10];

    // Genera el array
    for (int i = 0; i < 10; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
    }

    // Muestra el array original.
    System.out.println("\n\nArray original:");
    System.out.println("\nâ”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”�");
    System.out.print("â”‚ Ã�ndice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", i);
    }
    System.out.println("â”‚\nâ”œâ”€â”€â”€â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¤");
    System.out.print("â”‚ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", n[i]);
    }
    System.out.println("â”‚\nâ””â”€â”€â”€â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”˜");

    // Pide un nÃºmero que estÃ© dentro del array
    boolean existeNumero = false;
    int numeroIntroducido;
    do {
      System.out.print("\nIntroduzca uno de los nÃºmeros del array: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      // Comprueba si el nÃºmero introducido se encuentra dentro del array
      for (int elemento : n) {
        if (elemento == numeroIntroducido) {
          existeNumero = true;
        }
      }
      
      if (!existeNumero) {
        System.out.println("Ese nÃºmero no se encuentra en el array.");
      }
    } while (!existeNumero);
    
    // Rota los el array hasta que el nÃºmero introducido se coloque en la posiciÃ³n 0
    while (n[0] != numeroIntroducido) {
      int aux = n[9];
      // RotaciÃ³n a la derecha
      for (int i = 9; i > 0; i--) {
        n[i] = n[i -1];
      }
      n[0] = aux;
    }

    // Muestra el resultado.
    System.out.println("\nArray resultante:");
    System.out.println("\nâ”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”�");
    System.out.print("â”‚ Ã�ndice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", i);
    }
    System.out.println("â”‚\nâ”œâ”€â”€â”€â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¤");
    System.out.print("â”‚ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", n[i]);
    }
    System.out.println("â”‚\nâ””â”€â”€â”€â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”˜"); 
  }
}
