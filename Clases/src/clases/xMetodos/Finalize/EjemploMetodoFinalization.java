/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.xMetodos.Finalize;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class EjemploMetodoFinalization {

 @Override
 protected void finalize() {
  try {
   super.finalize();
   System.out.println("Metodo propio de finalize() heredado de la superclase");
  } catch (Throwable ex) {
   Logger.getLogger(EjemploMetodoFinalization.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 public static void main(String[] args) {
  int c = 0;
  for (int i = 0; i < 20; i++) {
   Rectangulo r = new Rectangulo(5, 5);
   System.out.println("Vueltas : " + c++);
   System.runFinalization();
   System.gc();
  }
 }
}

class Rectangulo {

 private int i;
 private int i0;

 Rectangulo(int i, int i0) {
 }

 private int getI() {
  return i;
 }

 private int getI0() {
  return i0;
 }

 protected void finalize() {
  System.out.println("Adios");
 }
}
