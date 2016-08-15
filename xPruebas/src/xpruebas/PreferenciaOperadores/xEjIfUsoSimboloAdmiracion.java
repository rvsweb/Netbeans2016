/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.PreferenciaOperadores;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjIfUsoSimboloAdmiracion {

 public static void main(String[] args) {

  boolean si = false;

  if (!(si == false)) {
   System.out.println("valor : " + si);
  }

  if ((!si == false)) {
   System.out.println("valor : " + si);
  }

  if ((si != false)) {
   System.out.println("valor : " + si);
  }

  if ((si == !false)) {
   System.out.println("valor : " + si);
  }

  System.out.println("-------------------");

  boolean si1 = true;

  if (!(si1 == false)) {
   System.out.println("valor : " + si1);
  }

  if ((!si1 == false)) {
   System.out.println("valor : " + si1);
  }

  if ((si1 != false)) {
   System.out.println("valor : " + si1);
  }

  if ((si1 == !false)) {
   System.out.println("valor : " + si1);
  }

 }
}
