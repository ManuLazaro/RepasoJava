/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Acuaticos extends Vehiculos{
   private int eslora;
  
  public Acuaticos (String matricula, String modelo, int eslora ){
    super (matricula, modelo);
    this.eslora = eslora;
  }

  public int getEslora() {
    return eslora;
  }

  public void setEslora(int eslora) {
    this.eslora = eslora;
  }
  
}
