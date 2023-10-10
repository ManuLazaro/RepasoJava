/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOherencia2.src.pooherencia2;

/**
 *
 * @author DAM
 */
public class Bicicleta extends Vehiculo {

    private int ruedas;

    public Bicicleta( int ruedas) {
    
      this.ruedas=ruedas;
    }

    public int getKilometrosRecorridos() {
      return kilometrosRecorridos;
    }

    public double getRuedas() {
      return ruedas;
    }

    public void setRuedas(int ruedas) {
      this.ruedas = ruedas;
    }
    
    public void andarBici(){                            
      System.out.println(" Andando 10 km ");
      this.kilometrosRecorridos += 10;
      kilometrosTotal += 10;
    }
    public void hacerCaballito(){                            
      System.out.println(" Haciendo el caballito ");
    }
}
   
