/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Arrays;

/**
 * @see Ejemplo Para Escribir desde Consola y Leer datos en la Consola Para que
 * Funcione se tiene que crear el archivo sin paquete y compilar desde la
 * consola con comando javac
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjArrayString {

 public static void main(String[] args) {

  args = new String[2];

  System.out.println("Introduce 1º dato");
  args[0] = System.console().readLine();
  System.out.println("Introduce 2º dato");
  args[1] = System.console().readLine();

  System.out.println("Mensaje final : " + args[0] + " " + args[1]);

 }
}
