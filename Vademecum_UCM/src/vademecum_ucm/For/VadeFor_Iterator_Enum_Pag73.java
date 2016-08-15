/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.For;

import java.util.EnumSet;

/**
 * @see - 80
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFor_Iterator_Enum_Pag73 {

 enum Color {
  ROJO, NARANJA, AMARILLO, VERDE, AZUL, AÑIL, VIOLETA
 };

 static void procesa(Object obj) {
  if (obj instanceof Color) {
   System.out.println("• Soy un color : " + obj);
  }
 }

 public static void main(String[] args) {

  for (Color color : Color.values()) {
   procesa(color);
  }

  System.out.println("------------------------------------");
  for (Color color : EnumSet.range(Color.NARANJA, Color.AZUL)) {
   System.out.println(color);
  }

 }

}
