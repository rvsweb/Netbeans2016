/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see - 68
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeExcepcionesDentroDeMetodosPag61 {

 /**
  * Si una excepcion se lanza dentro de un metodo , puede que este la capture o
  * no , Si no la captura debe de informar en su cabecera de que puede ser
  * lanzada , si un metodo propaga una excepcion , esta debera ser considerada
  * en el codigo llamante que a su vez puede capturarla o retransmitirla
  *
  *
  * @throws Exception
  */
 public static void metodo_3() throws Exception {
  throw new Exception();
 }

 public static void metodo_2() throws Exception {
  metodo_3();
 }

 public static void metodo_1() {
  try {
   metodo_2();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 public static void main(String[] args) {

 }
}
