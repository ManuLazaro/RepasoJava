/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pooherencia3.src.pooherencia3;

/**
 *
 * @author DAM
 */
   //SUBCLASE Perro
   public class Perro extends Animal {
      int horasDormidas=0;

    public Perro(String tipo, int numPatas, String clima) {
      super(tipo,numPatas,clima);
    }
     public Perro() {
      super();
    }
      
    public void duerme(int horas) {
       System.out.println("Durmiendo Zzzzz  ");
       this.horasDormidas += horas;
     }
     public int getHorasDormidas() {
       return horasDormidas;
     }
     public void Ladra(){
       System.out.println("Guau Guau");
     }
   }