/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_Enum.ClaseEnum;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestEnum {

 enum TipoDeMadera {
  ROBLE, CAOBA, NOGAL, CEREZO, BOJ
 };

 public static void main(String[] args) {
  TipoDeMadera maderaUsuario = TipoDeMadera.ROBLE;
  System.out.println("La madera elegida por el usuario es : " + maderaUsuario.toString().toLowerCase());
  System.out.println("¿ Es la madera elegida por el usuario caoba ? " + (maderaUsuario == TipoDeMadera.CAOBA));
  System.out.println("¿ Es la madera elegida por el usuario roble ? " + (maderaUsuario == TipoDeMadera.ROBLE));
  System.out.println("------------------------------------------------------------");
  System.out.println("La madera elegida por el usuario es : " + maderaUsuario);
  System.out.println("¿ Es la madera elegida por el usuario caoba ? " + (maderaUsuario == TipoDeMadera.CAOBA));
  System.out.println("¿ Es la madera elegida por el usuario roble ? " + (maderaUsuario == TipoDeMadera.ROBLE));
 }
}
