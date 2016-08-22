/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xejemplosdesktop.CrearExcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/excepciones/propias.htm
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEj_ExcepcionIntervalo2 extends Exception {

 /**
  * Para crear y lanzar una 'excepcion' propia tenemos que definir la clase
  * 'ExcepcionIntervalo' derivada de la clase base 'Exception'
  *
  * @param msg
  */
 public xEj_ExcepcionIntervalo2(String msg) {
  super(msg);
 }

 /**
  * Metodo que lanzara la excepcion
  *
  * Cuando el numerador es mayor que 100 y el denominador es menor que 5 se
  * lanaza una excepcion
  *
  * Un objeto de la clase xEj_ExcepcionIntervalo
  *
  * El objeto se crea llamando al constructor de dicha clase y pasandole un
  * String que contiene el mensaje "Numeros fuera del intervalo"
  *
  * @param num
  * @param den
  * @throws xEj_ExcepcionIntervalo
  */
 static void rango(int num, int den) throws xEj_ExcepcionIntervalo2 {
  if ((num > 100) || (den < -5)) {
   throw new xEj_ExcepcionIntervalo2("Numero fuera del intervalo");
  }
 }

 /**
  * TODO en 1
  *
  * La funcion calcular puede lanzar ' throws ' 3 tipos de excepciones
  * --------En el cuerpo de la funcion se crea , 'new' y se lanza 'throw'
  * explicitamente un objeto de la clase 'ExcepcionIntervalo' , definida por el
  * usuario , e implicitamente se crea y se lanza objetos de las clases
  * NumberFormatException y ArithmeticException
  *
  * La sentencia que llama a la funcion 'calcular' dentro del bloque try puede
  * producir alguna de las 3 excepciones que es capturada por el correspondiente
  * bloque 'catch'
  *
  * @param str1
  * @param str2
  * @return
  * @throws xEj_ExcepcionIntervalo2
  * @throws NumberFormatException
  * @throws ArithmeticException
  */
 static int calcular(String str1, String str2) throws xEj_ExcepcionIntervalo2,
         NumberFormatException, ArithmeticException {
  int num = Integer.parseInt(str1);
  int den = Integer.parseInt(str2);
  if ((num > 100) || (den < -5)) {
   throw new xEj_ExcepcionIntervalo2("Numeros fuerta del intervalo");
  }
  return (num / den);
 }

 public static void main(String[] args) {

//  Definimos una funcion que se llama 'calcular' que devuelve el cociente entre el numerador y el denominador 
//  cuando se le pasa los string obtenidos de los respectivos controles de edicion 
//  La funcion 'calcular' convierte los String en numero enteros ' verifica su rango , calcula y devuelve el cociente entre el num y el denominador
//  
  String str1 = "120";
  String str2 = "3";
  String respuesta;

  int numerador, denominador, cociente;

  try {
   numerador = Integer.parseInt(str1);
   denominador = Integer.parseInt(str2);
   rango(numerador, denominador);
   respuesta = String.valueOf(calcular(str1, str2));

  } catch (NumberFormatException ex) {
   respuesta = "Se han introducido caracteres no numericos";
  } catch (ArithmeticException ex) {
   respuesta = "Division entre cero";
  } catch (xEj_ExcepcionIntervalo2 ex) {
   respuesta = ex.getMessage();
   Logger.getLogger(xEj_ExcepcionIntervalo2.class.getName()).log(Level.SEVERE, null, ex);
  }
  System.out.println(respuesta);

 }
}
