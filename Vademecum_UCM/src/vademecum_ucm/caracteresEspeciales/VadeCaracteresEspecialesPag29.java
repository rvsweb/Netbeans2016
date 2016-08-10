/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.caracteresEspeciales;

import java.io.UnsupportedEncodingException;

/**
 * @see https://docs.oracle.com/javase/tutorial/i18n/text/string.html
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeCaracteresEspecialesPag29 {

 /**
  *
  * @param array
  * @param name
  */
 public static void printBytes(byte[] array, String name) {
  for (int k = 0; k < array.length; k++) {
   System.out.println(name + " [" + k + "] = " + "0x" + UnicodeFormatter.byteToHex(array[k]));
  }
 }

 public static void main(String[] args) {

  System.out.println("• Conversion codigo unicode : ");
  System.out.println("--------------------------");
  System.out.println("\u0020");
  System.out.println("\u0021");
  System.out.println("\u0023");
  System.out.println("\u0024");
  System.out.println("\u0025");
  System.out.println("\u0026");
  System.out.println("\u0027");
  System.out.println("\u0028");
  System.out.println("\u0029");
  System.out.println("\u002A");
  System.out.println("\u002B");
  System.out.println("\u002C");
  System.out.println("\u002D");
  System.out.println("\u002E");
  System.out.println("\u002F");
  System.out.println("--------------------------");
  System.out.println("\u0030");
  System.out.println("\u0031");
  System.out.println("\u0033");
  System.out.println("\u0034");
  System.out.println("\u0035");
  System.out.println("\u0036");
  System.out.println("\u0037");
  System.out.println("\u0038");
  System.out.println("\u0039");
  System.out.println("\u003A");
  System.out.println("\u003B");
  System.out.println("\u003C");
  System.out.println("\u003D");
  System.out.println("\u003E");
  System.out.println("\u003F");
  System.out.println("--------------------------");

  String original = "A" + "\u00ea" + "\u00f1" + "\u00fc" + "C";
  String original2 = "Pepe";
  System.out.println("• Conversion : " + original);

  try {
   byte[] utf8Bytes = original.getBytes();
   byte[] defaultBytes = original.getBytes();
   byte[] Pepe = original2.getBytes();
   /*circuito*/
   String roundTrip = new String(utf8Bytes, "UTF8");
   System.out.println("• -- roundTrip = " + roundTrip);

   System.out.println("• -- printBytes -- ");
   printBytes(utf8Bytes, "uft8Bytes");

   System.out.println("• -- defaultBytes -- ");
   printBytes(defaultBytes, "defaultBytes");

   System.out.println("• -- Pepe --  ");
   printBytes(Pepe, original2);

   System.out.println("------------- UnicodeFormatter -----------------");

   byte[] utf8bytes1 = original2.getBytes();
   byte[] defaultBytes1 = original2.getBytes();

   System.out.println("\n---------------- byteToHex ---------------------");

   for (int i = 10; i < 32; i++) {
    String resultado = UnicodeFormatter.byteToHex((byte) i);
    System.out.println(resultado);
   }
   System.out.println("\n---------------- charToHex ---------------------");

   String charToHex01 = UnicodeFormatter.charToHex('A');
   System.out.println(charToHex01);
   String charToHex0 = UnicodeFormatter.charToHex('a');
   System.out.println(charToHex0);
   String charToHex1 = UnicodeFormatter.charToHex('b');
   System.out.println(charToHex1);
   String charToHex2 = UnicodeFormatter.charToHex('c');
   System.out.println(charToHex2);
   String charToHex3 = UnicodeFormatter.charToHex('d');
   System.out.println(charToHex3);
   String charToHex41 = UnicodeFormatter.charToHex('X');
   System.out.println(charToHex41);
   String charToHex4 = UnicodeFormatter.charToHex('x');
   System.out.println(charToHex4);

  } catch (UnsupportedEncodingException e) {
   System.out.println("Salida Error : " + e.getMessage());
  }
 }
}

/**
 *
 * http://docs.oracle.com/javase/tutorial/i18n/text/examples/UnicodeFormatter.java
 *
 * @author Portatil
 */
class UnicodeFormatter {

 static public String byteToHex(byte b) {
//Return hex String representation of byte b
  char hexDigit[] = {
   '0', '1', '2', '3', '4', '5', '6', '7',
   '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
  };
// 2º Array de char 
  char[] array = {
   hexDigit[(b >> 4) & 0x0f],
   hexDigit[b & 0x0f]
  };
  return new String(array);
 }

 /**
  *
  * @param c
  * @return
  */
 static public String charToHex(char c) {
//  Return hex  String representation of char c
  byte hi = (byte) (c >>> 8);
  byte lo = (byte) (c & 0xff);
  return byteToHex(hi) + byteToHex(lo);
}
 }
