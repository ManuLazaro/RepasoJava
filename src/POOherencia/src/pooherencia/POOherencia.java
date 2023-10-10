/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOherencia.src.pooherencia;

import POOherencia.src.pooherencia.CuentaCorriente.CuentaAhorro;

/**
 *
 * @author DAM
 */
public class POOherencia {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Titular titular1 =new Titular ("Pepito","algo", 30);
    Titular titular2 =new Titular ("alguien","alguien", 37);
    CuentaCorriente cuenta1 = new CuentaCorriente (titular1,"0004", 600);
    CuentaCorriente cuenta2 = new CuentaCorriente (titular2,"0007", 1000); 
    CuentaAhorro cuenta3= new CuentaAhorro(titular1,"AH004",100.0);
     titular1.toString();
  }
  
}
