/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.examen.core;

/**
 *
 * @author DAM
 */
public class Compra extends Entradas {
   String DNI;
   String Nombre;
   String Apellidos;
   
   public Compra(String DNI, String Nombre, String Apellidos, int fila, int asiento, String espectaculo){
     super(fila, asiento, espectaculo);
   }
}
