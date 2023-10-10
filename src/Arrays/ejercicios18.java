/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author manul
 */
public class ejercicios18 {
    public static void main(String[] args) {
    int[] a = new int[10];
    int[] menores = new int[10];
    int[] mayores = new int[10];
    int cuentaMenores = 0;
    int cuentaMayores = 0;
    
    // Genera el array original y clasifica los nÃºmeros
    for (int i = 0; i < 10; i++) {
      a[i] = (int) (Math.random() * 201);
      
      if (a[i] <= 100) {
        menores[cuentaMenores++] = a[i];
      } else {
        mayores[cuentaMayores++] = a[i];
      }
    }

    // Muestra el array original
    System.out.println("\nArray original:");
    System.out.println("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”�");
    System.out.print("â”‚ Ã�ndice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", i);
    }
    System.out.println("â”‚");
    System.out.println("â”œâ”€â”€â”€â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¤");
    System.out.print("â”‚ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", a[i]);
    }
    System.out.println("â”‚");
    System.out.println("â””â”€â”€â”€â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”˜");

    // Genera el array resultado
    int[] resultado = new int[10];
    int menoresColocados = 0;
    int mayoresColocados = 0;
    
    int j = 0;
    do {
      
      if (menoresColocados < cuentaMenores) {
        resultado[j++] = menores[menoresColocados++];
      }
      
      if (mayoresColocados < cuentaMayores) {
        resultado[j++] = mayores[mayoresColocados++];
      }
      
    } while (j < 10);


    // Muestra el resultado.
    System.out.println("\nArray resultado:");
    System.out.println("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”�");
    System.out.print("â”‚ Ã�ndice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", i);
    }
    System.out.println("â”‚");
    System.out.println("â”œâ”€â”€â”€â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”¤");
    System.out.print("â”‚ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("â”‚%4d ", resultado[i]);
    }
    System.out.println("â”‚");
    System.out.println("â””â”€â”€â”€â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”´â”€â”€â”€â”€â”€â”˜");
  }

}
