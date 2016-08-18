/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.NotacionLocal;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @see -
 * @since-
 * @version-
 * @author Raul Vela Salas
 */
public class VadeNotacionLocalBasicaPag115 {

 public static void main(String[] args) throws ParseException {

//  Notacion cientifica ESPAÑOLA
  Locale localeEs = new Locale("es", "ES");
  NumberFormat format = NumberFormat.getInstance(localeEs);
// Para escribir
  System.out.println(format.format(1234.56));

// Para leer
  Number number = format.parse("1.234,56");
  double v = number.doubleValue();
  System.out.println(v);
 }
}
