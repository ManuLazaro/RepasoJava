/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOherencia.src.pooherencia;

import java.util.Set;

/**
 *
 * @author DAM
 */
public class CuentaCorriente {
  //atributos de la clase titular(nombre, apellidos y edad dentro de titular)
  private Titular titular;
  //atributos de esta clase
  private String NumeroDeCuenta;
  private double Saldo;
  
  CuentaCorriente (Titular titular, String NumeroDeCuenta, double Saldo){
    this.titular=titular;
    this.NumeroDeCuenta=NumeroDeCuenta;
    this.Saldo=Saldo;
  }
  
  CuentaCorriente (Titular titular, String NumeroDeCuenta){
    this.titular=titular;
    this.NumeroDeCuenta=NumeroDeCuenta;
    Saldo= 15.3;
  }
//getter y setter de todos los atributos

  public Titular getTitular() {  //en este saca nombre, apellidos y edad
    return titular;
  }

  public void setTitular(Titular titular) {
    this.titular = titular;
  }
  @Override
  public String toString(){
    String resultado = "El titular de la cuenta "+NumeroDeCuenta+" es "+titular+" y el saldo de la cuenta es "+Saldo;
    return resultado;
  }

  public void setNumeroDeCuenta(String NumeroDeCuenta) {
    this.NumeroDeCuenta = NumeroDeCuenta;
  }

  public double getSaldo() {
    return Saldo;
  }

  public void setSaldo(double Saldo) {
    this.Saldo = Saldo;
  }
  //metodo ingresar que aumente el saldo en 1 cantidad
  public void ingresar (double cantidad){
    Saldo=Saldo+cantidad;
  }
  //metodo reintegro
  public void reintegro(double cantidad){
    if (cantidad<=0){
      System.out.println("No se puede tener saldo negativo");
    }
    else{
      Saldo=Saldo-cantidad;    
    }
  }
  //metodo imprimir que muestre tu saldo y el numero de cuenta (usar el this.)
 public void imprimir (String NumeroDeCuenta) {
   System.out.println("Numero de cuenta: "+this.NumeroDeCuenta+" Saldo de la cuenta: " +this.Saldo);
 }
 public int comparar (String cuenta1, String cuenta2){ // int respuesta=cuenta1.compareTo(cuenta2);
  return cuenta1.compareTo(cuenta2);        // return respuesta;
 }
 
 
 //clase cuenta ahorro que es hija de cuenta corriente
 public class CuentaAhorro extends CuentaCorriente {

   private double interes;
   

    public CuentaAhorro(Titular titular, String NumeroDeCuenta, double Saldo, double interes) {
      super(titular, NumeroDeCuenta, Saldo);
      this.interes=interes;
    }
    public CuentaAhorro (Titular titular, String NumeroDeCuenta, double interes){
      super(titular, NumeroDeCuenta);
      this.interes=interes;
    }
    // Saldo al ser privado hay que setearlo diferente 
   public CuentaAhorro (Titular titular, String NumeroDeCuenta){
     super(titular, NumeroDeCuenta, 15.3);
     //super.setSaldo(15.3); 
     this.interes=2.5;
   }

    public Titular getNombre() {
      return titular;
    }

   
    public String getNumeroDeCuenta() {
      return NumeroDeCuenta;
    }

   @Override
    public double getSaldo() {
      return Saldo;
    }

    public double getInteres() {
      return interes;
    }
 
    public void calcularInteres(){
      double saldoCalculado=super.getSaldo()+(this.interes/super.getSaldo()*super.getSaldo());
      super.setSaldo(saldoCalculado);
      
      
    }
  
 }
 
}
