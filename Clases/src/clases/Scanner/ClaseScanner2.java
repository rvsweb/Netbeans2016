/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Scanner;

import java.util.Scanner;

/**
 * @see - Si al instanciar un objeto automaticamente captura por teclado
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ClaseScanner2 {

 private Scanner sc = null;
 private Scanner sc2 = new Scanner(System.in);
 private static Scanner sc3; // solo una copia para toda la clase
 private static Scanner sc4 = new Scanner(System.in); // solo una copia para toda la clase
 private static final Scanner sc5 = new Scanner(System.in); // solo una copia para toda la clase
 private static String static_final_captura1 = null;

// Al lanzar el proyecto es la 1º sentencia que se ejecuta fuera del main 
 private static int static_numero = new Scanner(System.in).nextInt(); 
 private int instancia_numero = new Scanner(System.in).nextInt();

 /**
  * Inicializa el objeto
  */
 public ClaseScanner2() {
  sc = new Scanner(System.in);
 }

 public static void main(String[] args) {

  System.out.println("Ver instancia_numero : ");
  int css = new ClaseScanner2().instancia_numero;
  System.out.println("Soy instancia_numero : " + css);

  System.out.println("Ver static_numero : Esta en 2º lugar pero se ejecuta en 1º lugar porque su atributo es static : " + static_numero);
  if (static_numero == 1) {
   System.out.println("Soy static_numero : " + static_numero);
  }

  System.out.println("1º Captura Teclado con Objetos : Primitivos int ");
  int num = new ClaseScanner2().sc.nextInt();
  System.out.println("1º Valor : " + num);

  System.out.println("2º Captura Teclado con Objetos : Primitivos int ");
  int num2 = new ClaseScanner2().sc.nextInt();
  System.out.println("2º Valor : " + num2);

  System.out.println("3º Captura Teclado Directo : Primitivos int ");
  int num3 = new Scanner(System.in).nextInt();
  System.out.println("3º Valor : " + num3);

  System.out.println("4º Invoco numero de instancia ");
  System.out.println("Instancia numero : " + ClaseScanner2.static_numero);

  System.out.println("-------------------------------------------------");

  System.out.println("Captura Teclado con Objetos : Objetos ");

  System.out.println("1º version : Captura por teclado | Se inicializa desde el constructor: ");
  String teclado = new ClaseScanner2().sc.next();
  System.out.println("1º Valor : " + teclado);

  System.out.println("2º version : Captura por teclado | Se inicializa , instancia , invoca metodo next() : ");
  ClaseScanner2 teclado1 = new ClaseScanner2();
  String teclado_captura = teclado1.sc.next();
  System.out.println("2º Valor : " + teclado_captura);

  System.out.println("3º version : Captura por teclado | Se inicializa , instancia , invoca metodo next() : ");
  ClaseScanner2 teclado2 = new ClaseScanner2();
  String teclado_captura2 = teclado2.sc2.next();
  System.out.println("3º Valor : " + teclado_captura2);

  System.out.println("3º version : Captura por teclado | Atributo de instancia sin Constructor , Se instancia despues del main : Forma correcta ");
  sc3 = new Scanner(System.in);
  String captura_cadena = sc3.next();
  System.out.println("3º Valor : " + captura_cadena);

  System.out.println("4º version : Captura por teclado | Atributo de instancia con Constructor , Forma No Correcta : ");
  String static_captura1 = sc4.next();
  System.out.println("4º Valor : " + static_captura1);

  System.out.println("5º version : Captura por teclado final : ");
  String static_final_captura = sc5.next();
  System.out.println("5º Valor : " + static_final_captura);

  for (int i = 0; i < 3; i++) {
   static_final_captura1 = sc5.next();
   System.out.println("Valores final : " + static_final_captura1);
   final String static_final_captura2 = sc5.next();
   System.out.println("Valores final 2 : " + static_final_captura2);
  }

  System.out.println("xº version : Captura por teclado : Puede hacerse porque es un objeto ");
  String teclado_captura3 = new Scanner(System.in).next();
  System.out.println("xº Valor : " + teclado_captura3);

 }
}
