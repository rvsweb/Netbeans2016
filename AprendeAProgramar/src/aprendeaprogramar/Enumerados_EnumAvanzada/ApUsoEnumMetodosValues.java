/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_EnumAvanzada;

import java.util.Arrays;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=648:enumerados-como-clases-enum-en-java-constructores-metodo-values-ejercicio-ejemplo-resuelto-cu00682b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoEnumMetodosValues {

 /**
  * De esta manera podemos decir que ya conocemos tres tipos de clases: clases
  * que definen tipos (clases “normales”), clases que incorporan un método main
  * (clases tipo “ejecutable”) y por último las clases “enum” que incorporan
  * enumerados y que tienen ciertas peculiaridades. Entre las cosas especiales
  * que se pueden hacer con una clase de tipo Enum tenemos:
  *
  */
 /**
  * Metodo values() -> Devuelve un 'Array' con todos los valores del 'Enum'
  */
 /**
  * Constructor Especial : Tipo Enumerado puede añadir Campos Constantes al
  * objeto enumerado y recuperar esos campos
  */
}

class EnumConConstructorMetodoValue {

 private enum TipoDeMadera {

  CAOBA, ROBLE, NOGAL, BOJ, CEREZO
 };

 public static void main(String[] args) {

  /**
   * Lleva implicito el Metodo 'values' que convierte los valores del Enum en
   * Array
   */
  TipoDeMadera tipo_madera = TipoDeMadera.CAOBA;
  System.out.println("Los tipos de madera : ");
  System.out.println("");
  for (TipoDeMadera tmp : tipo_madera.values()) {
   System.out.println("Sin toString - Objeto : " + tmp);
  }

  /**
   *
   */
  System.out.println("");
  for (TipoDeMadera tmp0 : tipo_madera.values()) {
   System.out.println("Con toString - Tipo String " + tmp0.toString().toLowerCase());
   System.out.println("Sin toString - Objeto : " + tmp0);
   if (tmp0.equals(tmp0.toString())) {
    System.out.println("• Si son ambos String");
   } else {
    System.out.println("♦ NO son ambos String");
   }
  }

  /**
   *
   */
  System.out.println("");
  for (TipoDeMadera tmp1 : TipoDeMadera.values()) {
   System.out.println("Con toString - Tipo String " + tmp1.toString().toLowerCase());
  }

 }
}
