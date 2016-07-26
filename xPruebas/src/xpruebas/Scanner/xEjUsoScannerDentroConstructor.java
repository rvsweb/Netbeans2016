/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Scanner;

import java.util.Scanner;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjUsoScannerDentroConstructor {

 public static void main(String[] args) {

  EntradaDeTeclado e1 = new EntradaDeTeclado();
  String ver = e1.getEntrada();
  System.out.println("Ver entrada : " + e1 + " Posicion de memoria donde esta alojado el objeto");
  System.out.println("Ver entrada desde teclado : " + ver);
 }
}

class EntradaDeTeclado {

 private Scanner sc;
 private String linea;

 public EntradaDeTeclado() {
  sc = new Scanner(System.in);
  linea = sc.nextLine();
 }

 public String getEntrada() {
  return linea;
 }
}
