/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ExamenManuelLazaro.src.ejercicio2ManuelLazaro;

/**
 *
 * @author DAM
 */
public class Submarino extends Acuaticos{
   String profundidadMax;
  
  public Submarino (String matricula, String modelo, int eslora, String profundidadMax ){
    super (matricula, modelo, eslora);
    this.profundidadMax = profundidadMax;
  }
  public String Imprimir(){
    return "El submarino con matricula"+getMatricula()+" modelo "+getModelo()+ " tiene una eslora de "+ getEslora()+" y alcanza una profundidad de "+profundidadMax +" km " ;
  }
}
