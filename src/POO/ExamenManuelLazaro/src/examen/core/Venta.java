/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.examen.core;

/**
 *
 * @author DAM
 */
public class Venta {
  private static int recaudacionTotal = 0;
  
  public void recaudar(int dinero){
    this.recaudacionTotal += dinero;
  }
}
