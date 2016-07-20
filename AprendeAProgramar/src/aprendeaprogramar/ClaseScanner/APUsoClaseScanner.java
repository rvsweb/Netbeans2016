/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseScanner;

import java.util.Scanner;

/**
 * @see ->
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=623:pedir-datos-en-java-por-consola-teclado-escape-backslash-systemoutprint-salto-de-linea-n-cu00657b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version Resumen: Entrega nº57 del curso "Aprender programación Java desde
 * cero".
 *
 * @author Raul Vela Salas
 */
public class APUsoClaseScanner {

 public static void main(String[] args) {
  System.out.println("Empezamos el programa ");
  System.out.println("Por favor introduzca una cadena por teclado ");

  String entradaTeclado = "";
  Scanner entradaEscaner = new Scanner(System.in);
  entradaTeclado = entradaEscaner.nextLine();
  System.out.println("Entrada recibida por teclado : " + entradaTeclado);

 }

}
