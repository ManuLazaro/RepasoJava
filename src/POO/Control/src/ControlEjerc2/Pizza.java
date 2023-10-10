/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Control.src.ControlEjerc2;

/**
 *
 * @author DAM
 */
public class Pizza {
   String tamaño;
   String tipo;
   String estado ="pedida";
   //atributos de clase
   public static int totalPedidas=0;
   public static int totalServidas;
    
   //constructor
   public Pizza (String tipo, String tamaño){
     this.tipo=tipo;
     this.tamaño=tamaño;
   }
  //metodos
   public void sirve(){
     if (estado == "servida" ) {
       System.out.println("Esa pizza ya se ha servido");
     }else{
       totalServidas = totalServidas +1;
       this.estado = "servida";
       System.out.println("servida");
     }
   }
   //metodo to string que ademas cuenta las pizzas totales pedidas
   @Override
   public String toString(){
     Pizza.totalPedidas = totalPedidas + 1;
     return "pizza "+tipo+" "+ tamaño+" "+estado;
   }
  
//getters and setters
  public String getTamaño() {
    return tamaño;
  }

  public void setTamaño(String tamaño) {
    this.tamaño = tamaño;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }
  
}
