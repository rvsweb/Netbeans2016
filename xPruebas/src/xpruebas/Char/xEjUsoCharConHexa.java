/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Char;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjUsoCharConHexa {

 public static void main(String[] args) {
  char[] valor = new char[]{'a', 'b', 'c'};
  char[] array = {valor[(1 >> 4) & 0x0f], valor[1 & 0x0f]};

  for (int i = 0; i < array.length; i++) {
   System.out.println(array[i]);
  }

 }
}
