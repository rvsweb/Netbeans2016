/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_Enum.ClaseEnum;

import aprendeaprogramar.Enumerados_Enum.ClaseEnum.TestEnum.TipoDeMadera;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestEnum2 {

 public static void main(String[] args) {

  TipoDeMadera miTipoDeMadera = TestEnum.TipoDeMadera.CAOBA;
  System.out.println("---------------------------------");
  System.out.println("Los posibles tipos de madera son : ");
  System.out.println("for (TipoDeMadera tmp : 'Objeto' miTipoDeMadera.values()) ");
  for (TipoDeMadera tmp : miTipoDeMadera.values()) {
   System.out.println(tmp.toString() + "\t");
  }

  System.out.println("---------------------------------");

  System.out.println("for (TipoDeMadera tmp : 'Clase' TipoDeMadera.values()) ");
  for (TipoDeMadera tmp : TipoDeMadera.values()) {
   System.out.println(tmp.toString() + "\t");
  }
 }

}
