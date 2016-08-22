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
public class xEj_ExcepcionIntervalo extends Exception {

 /**
  * Para crear y lanzar una 'excepcion' propia tenemos que definir la clase
  * 'ExcepcionIntervalo' derivada de la clase base 'Exception'
  *
  * @param msg
  */
 public xEj_ExcepcionIntervalo(String msg) {
  super(msg);
 }

 /**
  * Cuando el numerador es mayor que 100 y el denominador es menor que 5 se
  * lanaza una excepcion
  *
  * Un objeto de la clase xEj_ExcepcionIntervalo
  *
  * Dicho objeto se crea llamando al constructor de dicha clase y pasandole un
  * String que contiene el mensaje "Numeros fuera del intervalo"
  *
  * @param num
  * @param den
  * @throws xEj_ExcepcionIntervalo
  */
 static void rango(int num, int den) throws xEj_ExcepcionIntervalo {
  if ((num > 100) || (den < -5)) {
   throw new xEj_ExcepcionIntervalo("Numero fuera del intervalo");
  }
 }

 public static void main(String[] args) {

  String str1 = "120";
  String str2 = "3";
  String respuesta;

  int numerador, denominador, cociente;

  try {
   numerador = Integer.parseInt(str1);
   denominador = Integer.parseInt(str2);
   rango(numerador, denominador);
   cociente = numerador / denominador;
   respuesta = String.valueOf(cociente);

  } catch (NumberFormatException ex) {
   respuesta = "Se han introducido caracteres no numericos";
  } catch (ArithmeticException ex) {
   respuesta = "Division entre cero";
  } catch (xEj_ExcepcionIntervalo ex) {
   respuesta = ex.getMessage();
   Logger.getLogger(xEj_ExcepcionIntervalo.class.getName()).log(Level.SEVERE, null, ex);
  }
  System.out.println(respuesta);

 }
}
