/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Control.src.ControlEjerc3;

/**
 *
 * @author DAM
 */
public class Terminal {
 
  int segConversacion;
  int segCobrar;
  double tarificados;
  String tarifa;
  

  public int getSegConversacion() {
    return segConversacion;
  }

  public void setSegConversacion(int segConversacion) {
    this.segConversacion = segConversacion;
  }

  public double getTarificados() {
    return tarificados;
  }

  public void setTarificados(double tarificados) {
    this.tarificados = tarificados;
  }

  public String getTarifa() {
    return tarifa;
  }

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }
  
  //metodo 
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
 
}
