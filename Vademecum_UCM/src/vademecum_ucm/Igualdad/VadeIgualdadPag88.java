/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Igualdad;

/**
 * @see - 88
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeIgualdadPag88 {

 public static void main(String[] args) {

  double ERROR = 1.1;
  double a = (Math.random() * 100);
  double b = (Math.random() * 100);
  boolean res = Math.abs(a - b) < ERROR;
  System.out.println(res);
 }
}
