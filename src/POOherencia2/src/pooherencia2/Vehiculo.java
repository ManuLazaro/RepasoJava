/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOherencia2.src.pooherencia2;

/**
 *
 * @author DAM
 */
public abstract class Vehiculo {
  
  private static int kilometrosTotal=0;
  
  private int kilometrosRecorridos;
  
  //metodo de la clase
  public static int getKilometrosTotal(){
    return Vehiculo.kilometrosTotal;
  }
  
   public Vehiculo(){
     this.kilometrosRecorridos=0;
   }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

   
  }  

