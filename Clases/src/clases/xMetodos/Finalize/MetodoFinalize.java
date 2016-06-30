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
public class MetodoFinalize {

 @Override
 protected void finalize() {
  try {
   super.finalize();
   System.out.println("Metodo propio de finalize()");
  } catch (Throwable ex) {
   Logger.getLogger(MetodoFinalize.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 public static void main(String[] args) {

  MetodoFinalize m = new MetodoFinalize();
  m.finalize();
 }
}
