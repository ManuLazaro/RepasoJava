/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *  1. Define un array de 12 numeros enteros con nombre num y asigna los valores
 *    segun la tabla que se muestra a continuacion. Muestra el contenido de todos
 *    los elementos del array. que sucede con los valores de los elementos que
 *    no han sido inicializados?
 *    Posicion  0   1   2   3   4   5   6   7   8   9   10   11
 *    Valor    39  -2           0      14       5  120
 * @author manul
 */
public class ejercicio1 {
    public static void main(String[] args) {
        int[] num = new int[12];
        num[0] = 39;
        num[1]= -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        
        for (int i = 0; i < 12; i++) {
            System.out.printf("num[%2d]: %d\n", i, num[i]);
            
            
        }
    }
}
