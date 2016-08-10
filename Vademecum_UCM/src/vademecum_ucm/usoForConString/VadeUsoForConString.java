/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.usoForConString;

import java.util.Scanner;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoForConString {

 public static String procesa(String pro) {
  System.out.println(pro);
  return pro;
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String linea = null;

  for (linea = sc.next(); linea != null; linea = sc.next()) {
   procesa(linea);
   if (linea.equals("n")) {
    break;
   }
  }

 }
}
