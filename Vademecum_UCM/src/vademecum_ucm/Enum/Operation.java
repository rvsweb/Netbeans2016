/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Enum;

import java.util.Iterator;

/**
 * @see - Pag 61
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public enum Operation {

 PLUS {
  double eval(double x, double y) {
   return x + y;
  }
 },
 MINUS {
  double eval(double x, double y) {
   return x - y;
  }
 },
 TIMES {
  double eval(double x, double y) {
   return x * y;
  }
 },
 DIVIDE {
  double eval(double x, double y) {
   return x / y;
  }
 };
}

abstract class Main {

 abstract double eval(double x, double y);

 public static void main(String[] args) {

  /**
   * Recorrer un enum con for each
   */
  for (Vocal vocal : Vocal.values()) {
   System.out.print(vocal + " ");
  }
  System.out.println("");

 }
}

enum Vocal {
 A, E, I, O, U;
}
