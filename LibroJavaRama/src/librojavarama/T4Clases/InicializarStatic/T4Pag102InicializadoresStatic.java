/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.InicializarStatic;

import java.util.Scanner;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag102InicializadoresStatic {

 public static void main(String[] args) {

 }
}

class InicializadoresStatic {

 protected static String valor = "Sin mensaje";

 static {
  System.out.println("Llamada al inicializador");
 }

 static {
  System.out.println("Llamada al 2º inicializador ");
 }

 static {
  Scanner sc = new Scanner(System.in);
//  System.out.println("Escribe respuesta : ");
//  valor = sc.nextLine();
 }
}

class Test {

 public static void main(String[] args) {
  InicializadoresStatic is0 = new InicializadoresStatic();
  InicializadoresStatic is1 = new InicializadoresStatic();
  InicializadoresStatic is2 = new InicializadoresStatic();

  String mensaje = InicializadoresStatic.valor;

  System.out.println("Mensaje es : " + mensaje);

 }
}
