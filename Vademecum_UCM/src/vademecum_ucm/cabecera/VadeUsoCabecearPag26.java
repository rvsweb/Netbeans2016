/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.cabecera;

/**
 * @see pag 26
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoCabecearPag26 {

 public String cifra(String texto, byte[] clave) {
  if (texto.equals(clave)) {
   System.out.println(texto);
  } else {
   System.out.println("Error");
  }
  return texto;
 }

 public static void main(String[] args) {

  System.out.println("Cabecera ( de un metodo ) ");
  System.out.println("1º lineas de un metodo ");
  System.out.println("- Indican visibilidad - public , private , protected ");
  System.out.println("- Tipo valor que devuelve ( \"void\" Si no devuelve nada ");
  System.out.println("- Nombre del metodo");
  System.out.println("- Argumentos formales ('tipo' y 'nombre') ");

 }
}
