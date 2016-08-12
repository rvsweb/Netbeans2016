/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Continue;

import java.util.Scanner;

/**
 * @see - USAR CONTINUE
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoContinue2EjemploPag381 {

 /**
  * Se emplea para forzar la terminacion de una pasada en un bucle
  *
  * Es util cuando queremos abortar limpiamente una ejecucion del bucle
  *
  * Pero que este siga ejecutandose
  *
  * @param args
  */
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  A a = new A(1);
  B b = new B(2);
  C c1 = new C(3);
  C c2 = new C(4);

  for (int i = 0; i < 1000; i++) {
   if (a instanceof A) {
    System.out.println(a.getA());
   }
   if (c1 instanceof C) {
    System.out.println("- Es instanceof : " + c1);
    continue;
   }
   if (c2 instanceof C) {
    System.out.println("- Es instanceof : " + c2);
    continue;
   }
  }

 }
}
