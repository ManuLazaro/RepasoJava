/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class MainVehiculos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Coche coche1 = new Coche ("1234ABC","grande",4,"No");
    Moto moto1 = new Moto ("1234MNB","pequeña",2,"Rojo");
    Barco barco1 = new Barco ("123","yate",20,"Si");
    Submarino sub1 = new Submarino ("1256","militar",50,"2");
    System.out.println(coche1.Imprimir());
    System.out.println(barco1.Imprimir());
    System.out.println(moto1.Imprimir());
    System.out.println(sub1.Imprimir());
    
  }
  
}
