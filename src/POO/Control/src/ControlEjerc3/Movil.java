/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Control.src.ControlEjerc3;

/**
 *
 * @author DAM
 */
public class Movil extends Terminal{
  String numero;
  String tarifa;
  
 
  public Movil(){
    
  }
  public Movil(String numero, String tarifa){
    this.numero=numero;
    this.tarifa=tarifa;
  }
  //metodos
  @Override
  public void llama(Terminal Movil ,int segundos){
    if (tarifa == "rata") {
    segConversacion = segConversacion + segundos;
    segCobrar = segCobrar +segundos;
    Movil.segConversacion = Movil.segConversacion + segundos;
    tarificados = segCobrar * 0.001;
      }
    else if (tarifa == "mono") {
    this.segConversacion = this.segConversacion + segundos;
    segCobrar = segCobrar +segundos;
    Movil.segConversacion = Movil.segConversacion + segundos;
   tarificados = segCobrar * 0.002;
      }
    else if (tarifa == "bisonte") {
    this.segConversacion = this.segConversacion + segundos;
    segCobrar = segCobrar +segundos;
    Movil.segConversacion = Movil.segConversacion + segundos;
    tarificados = segCobrar * 0.005;
      }
    }
  @Override
  public String toString(){
    return "Nº "+numero+" - "+segConversacion+"s de conversacion - tarificados "+tarificados+" euros." ;
  }
}
