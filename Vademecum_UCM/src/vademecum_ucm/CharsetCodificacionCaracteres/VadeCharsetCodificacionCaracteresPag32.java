/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.CharsetCodificacionCaracteres;

import java.nio.charset.Charset;
import java.util.SortedMap;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeCharsetCodificacionCaracteresPag32 {

 public static void main(String[] args) {

  Charset valor_charset = Charset.defaultCharset();
  System.out.println(valor_charset);

  SortedMap<String, Charset> toda_la_codificacion_disponible = Charset.availableCharsets();
  System.out.println(toda_la_codificacion_disponible);

 }
}
