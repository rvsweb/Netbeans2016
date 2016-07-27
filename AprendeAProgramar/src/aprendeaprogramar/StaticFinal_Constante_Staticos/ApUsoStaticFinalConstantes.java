/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.StaticFinal_Constante_Staticos;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=639:static-final-en-java-palabras-clave-variables-de-clase-o-campos-estaticos-y-constantes-ejemplos-cu00673b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoStaticFinalConstantes {

}

class Calculadora {

 private final double PI = 3.14159265;

 public void mostrarConstantePi() {
//  this.PI = 222; DA ERROR 
  System.out.println(PI);
 }
}

class EjemploConstante {

 private static final float PI = 3.14159265f;

 private static double pi = 3.1415;

 public static final String passwd = "jkl343lagg";

 public static final int PRECIO_DEFAULT = 100;

}
