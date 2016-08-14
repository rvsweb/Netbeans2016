/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Excepciones;

/**
 * @see - 70
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeExcepciones2Pag63 {

}

class MisErrores2 extends Exception {

 private String msg;

 private Dato dato;

 public MisErrores2() {
  super();
 }

 public MisErrores2(Dato dato) {
  this.dato = dato;
 }

 public MisErrores2(String msg, Dato dato) {
  super(msg);
  this.dato = dato;
 }

 public Dato getDato() {
  return dato;
 }

}

class Dato {

}
