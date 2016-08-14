/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Excepciones;

/**
 * @see 68
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeExcepcionesPag59 {
}

class Clave {

 private Clave clave;

 public Clave() {
  this.clave = null;

 }

 public Clave(Clave clave) {
  this.clave = clave;
 }

 public boolean getOk() {
  return true;
 }

}

class MisErrores extends Exception {

 private static Clave clave;

 /**
  * Entre sus campos suele llevar informacion de por que se crea( de que
  * circunstancias excepcional es mensajero )
  *
  * @param msg
  * @param clave
  */
 public MisErrores(String msg, Clave clave) {
  super(msg);
  this.clave = clave;
 }

 public static boolean isOk(Clave clave) {
  if (clave instanceof Clave) {
   return true;
  } else {
   return false;
  }
 }

 public static void main(String[] args) {
  Clave clave = new Clave();
  MisErrores error = new MisErrores("clave erronea", clave);

  if (isOk(clave) == false) {
   try {
    error.printStackTrace();
    throw new MisErrores("clave incorrecta", clave);
   } catch (MisErrores e) {
    System.err.println(e); // informacion del error producido
    e.printStackTrace(); // describe donde se produjo
   }
  }

 }
}
