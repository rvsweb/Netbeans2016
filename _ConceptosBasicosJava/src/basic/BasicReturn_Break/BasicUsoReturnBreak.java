/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.BasicReturn_Break;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoReturnBreak {

}

class UsoReturn {

 public static void main(String[] args) {

  for (int i = 0; i < 10; i++) {
   System.out.println(i);
  }

  System.out.println("----- ◘ MOSTRAR ESTE MENSAJE -----");
  for (int i = 0; i < 10; i++) {
   System.out.println(i);
   if (i == 5) {
    break;
   }
  }

  System.out.println("----- ♦ MOSTRAR ESTE MENSAJE -----");
  for (int i = 0; i < 10; i++) {
   System.out.println(i);
   if (i == 5) {
    return;
//    System.out.println("----- MOSTRAR ESTE MENSAJE -----"); // DA ERROR 
   }
  }

  System.out.println("----- • MOSTRAR ESTE MENSAJE -----");
  for (int i = 0; i < 10; i++) {
   System.out.println(i);
  }

 }
}
