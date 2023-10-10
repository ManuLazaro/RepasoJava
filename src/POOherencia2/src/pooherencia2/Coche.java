/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOherencia2.src.pooherencia2;

/**
 *
 * @author DAM
 */
 public class Coche extends Vehiculo {

    String marca;

    public Coche(String marca) {
      this.marca=marca;
    }
     public void andarCoche(){                            
      System.out.println(" Andando 10 km ");
      this.kilometrosRecorridos += 10;
      kilometrosTotal += 10;
    }
  public void quemarRueda(){                            
      System.out.println(" Quemando rueda durante 5 km.......... ");
      this.kilometrosRecorridos += 5;
      kilometrosTotal += 5;
    }
  public int getKilometrosRecorridos() {
      return kilometrosRecorridos;
    }
    
    }
