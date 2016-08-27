/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Scanner;

import java.util.Scanner;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeScannerConBreak_Pag192 {

 /**
  * El token 'return' no permite añadir mas codigo fuera del bloque de codigo el
  * bucle iterativo while(true)
  *
  * El token 'break' permite añadir mas codigo fuera del bloque de codigo el
  * bucle iterativo while(true)
  *
  *
  * @param args
  */
 public static void main(String[] args) {
  System.out.println("--------------------------------");
  Scanner sc = new Scanner(System.in);
  while (true) { // Si pones un bucle infinito no ejecuta las demas sentencias 
   System.out.println("¿ Sigo ? [s]/[n]");
   String respuesta = sc.nextLine();
   if (respuesta.equalsIgnoreCase("s")) {
    continue;
   }
   if (respuesta.equalsIgnoreCase("n")) {
    break; //devuelve el flujo de ejecucion del programa para que continue fuera de las llaves
   }
   System.out.println("- No entiendo esa respuesta : " + respuesta);
   System.out.println("Adios ");
  }
//  Permite mas código despues de las llaves del while : 
  int x = 3;
  System.out.println("nº - " + x);
// 
 }
}
