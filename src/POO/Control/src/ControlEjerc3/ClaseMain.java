/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Control.src.ControlEjerc3;

/**
 *
 * @author DAM
 */
public class ClaseMain {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Movil m1 = new Movil("678 11 22 33", "rata");
  Movil m2 = new Movil("644 74 44 69", "mono");
  Movil m3 = new Movil("622 32 89 09", "bisonte");
      System.out.println(m1);
      System.out.println(m2);
      m1.llama(m2, 320);
      m1.llama(m3, 200);
      m2.llama(m3, 550);
      
      System.out.println(m1);
      System.out.println(m2);
      System.out.println(m3);
  }
  
}
