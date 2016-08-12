/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.CharsetCodificacionCaracteres;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see - Convertir String a Bytes
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeCharsetAnalizarComoSeTransformaStringEnBytes {

// private static final String LETRAS = "aeiou áéíóú";
 private static final String LETRAS = "aeiou u00E1u00E9u00EDu00F3u00FA";

 private static void encode(String name) throws UnsupportedEncodingException {
  byte[] bytes = LETRAS.getBytes(name);
  System.out.printf("%-12s:%d:", name, bytes.length);
  for (byte indice : bytes) {
   System.out.printf(" %02x", indice);
  }
  System.out.println();
 }

 public static void main(String[] args) {
  try {

   encode("ISO-8859-1"); // ISO Latin-1
   encode("Cp1252"); // Windows Latin-1
   encode("MacRoman"); // Macintosh Roman
   encode("UTF-8");
   encode("UTF-16BE");
   encode("UTF-16LE");

  } catch (UnsupportedEncodingException ex) {
   Logger.getLogger(VadeCharsetAnalizarComoSeTransformaStringEnBytes.class.getName()).log(Level.SEVERE, null, ex);
  }

 }
}
