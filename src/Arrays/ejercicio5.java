/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *  Escribe un programa que lea 15 numeros por teclado y que los almacene en un array. Rota los
 *    elementos de ese array, es decir, el elemento de la posicion 0 debe pasar a la posicion 1,
 *    el de la 1 a la 2, etc. El numero que se encuentra en la ultima posicion debe pasar a la
 *    posicion 0. Finalmente, muestra el contenido del array.
 * @author manul
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[]= new int[15];
        for (int i = 0; i < 15; i++) {
            numeros[i] = entrada.nextInt();
            
        }
        for (int i = 0; i < 14; i++) {
            numeros[0]=numeros[4];
            System.out.println(numeros[i]);
        }
        
    }
    
}
