/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_Enum;

import com.sun.javafx.animation.TickCalculation;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=647:tipos-enumerados-enum-java-ejemplos-de-codigo-error-enum-types-must-not-be-local-ejercicio-cu00681b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoEnum {

}

class Enum {

 /**
  * Enum : Almacena OBJETOS - NO SE PUEDEN CREAR DENTRO DE : METODOS /
  * CONSTRUCTORES / DENTRO MAIN()
  *
  * Enum : NO ES TEXTO
  */
 private enum enumeradoBasico {
  OBJETO1, OBJECTO2, OBJETO3, OBJETO4
 };

 private enum TipoDeMadera {
  ROBLE, CAOBA, NOGAL, CEREZO, BOJ
 };

 public static void main(String[] args) {
  TipoDeMadera maderaUsuario;
  maderaUsuario = TipoDeMadera.ROBLE;
  System.out.println("La madera elegida por el usuario es : " + maderaUsuario.toString().toLowerCase());
  System.out.println("¿ Es madera elegida por el usuario caoba ? = " + (maderaUsuario == TipoDeMadera.CAOBA));
  System.out.println("¿ Es madera elegida por el usuario roble ? = " + (maderaUsuario == TipoDeMadera.ROBLE));
 }
}
