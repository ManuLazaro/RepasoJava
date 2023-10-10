/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Barco extends Acuaticos{
   String motor;
  
  public Barco (String matricula, String modelo, int eslora, String motor ){
    super (matricula, modelo, eslora);
    this.motor = motor;
  }
  public String Imprimir(){
    return "El barco con matricula "+getMatricula()+" modelo "+getModelo()+ " tiene una eslora de "+ getEslora() +" metros y "+motor+" tiene motor";
  }
}
