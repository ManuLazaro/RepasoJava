/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *  9. Realiza un programa que pida 8 nÃºmeros enteros y que luego muestre esos nÃºmeros
 *    junto con la palabra "par" o "impar" segÃºn proceda.
 * @author manul
 */
public class ejercicio9 {
    public static void main(String[] args) {
  
    int[] numero = new int[8];
    int i;
    
    System.out.println("Introduzca 8 nÃºmeros enteros, pulse INTRO despuÃ©s de cada nÃºmero:");

    for (i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
  }
}
