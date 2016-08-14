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
public class VadeExcepcionesVariasPag61 {

 public static void main(String[] args) {

  int x = 0;
  int y = 1;
  int r;

//  try {
//   r = y / x;
//   System.out.println(r);
//  } catch (Exception e) {
//   System.err.println("aqui se captura la excepcion " + e);
//  }
  int x1 = 0;
  int y1 = 1;
  int r1;

//  try {
//   r1 = y1 / x1;
//  } catch (Exception e) {
//   System.err.println("por aqui pasa la excepcion : " + e);
//   throw e;
//  }
  int x11 = 0;
  int y11 = 1;
  int r11;

  try {
   r11 = y11 / x11;
   throw new Exception("error x");
  } catch (Exception e) {
   try {
    System.err.println("aqui se captura la excepcion : " + e);
    throw new Exception("error y11");
   } catch (Exception ex) {
    Logger.getLogger(VadeExcepcionesVariasPag61.class.getName()).log(Level.SEVERE, null, ex);
   }
  }

 }
}
