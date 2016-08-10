/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.usocasting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoCatchPag28 {

 /**
  * Básicamente permite capturar las excepciones lanzadas durante de la
  * ejecución del código dentro del bloque try.
  *
  * De hecho, interrumpe la ejecución secuencial del código y pasa a ejecutarse
  * el bloque catch
  */
 static void metodo() throws Ac, Bc {

 }

 public static void main(String[] args) {

  try {
   metodo();
  } catch (Ac ex) {
   Logger.getLogger(VadeUsoCatchPag28.class.getName()).log(Level.SEVERE, null, ex);
  } catch (Exception e) {
   System.out.println(e.getCause().toString());
  }
 }
}

class Ac extends Exception {

}

class Bc extends Ac {

}
