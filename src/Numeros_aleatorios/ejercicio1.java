/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numeros_aleatorios;

/**
 *  1. Escribe un programa que muestre la tirada de tres dados.
 *    Se debe mostrar tambiÃ©n la suma total (los puntos que suman
 *    entre los tres dados).
 * @author manul
 */
public class ejercicio1 {
     public static void main(String[] args) {
         int tirada1;
         int suma= 0;
         System.out.print("Tirada de tres dados: \n");
         
         for (int i = 0; i < 3; i++) {
             tirada1 = (int)(Math.random()*3);
             System.out.println(""+ tirada1);
             suma = suma + tirada1;
         }
         System.out.println("Suma total de las 3 tiradas= "+ suma);
     }
}
