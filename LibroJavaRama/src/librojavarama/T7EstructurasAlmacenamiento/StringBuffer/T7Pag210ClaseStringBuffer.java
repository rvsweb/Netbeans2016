/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.StringBuffer;

/**
 * @see libro
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag210ClaseStringBuffer {

 public static void main(String[] args) {

  /*objeto vacio capacidad de 16 */
  StringBuffer nombre = new StringBuffer();
  /*objeto vacio capacidad de 80 */
  StringBuffer apellidos = new StringBuffer(80);
  /*objeto con capacidad de 16 + 4 caracteres = 20 */
  StringBuffer direccion = new StringBuffer("Pepe");

  System.out.println("• Metodo capacity() ");
  System.out.println("capacidad nombre : " + nombre.capacity());
  System.out.println("capacidad apellidos : " + apellidos.capacity());
  System.out.println("capacidad direccion : " + direccion.capacity());

  System.out.println("• Metodo length() ");
  StringBuffer longitud = new StringBuffer("longitud nueva cadena ");
  System.out.println("Longitud cadena : " + longitud.length());

  System.out.println("• Metodo append() ");
  StringBuffer aniadir = new StringBuffer("Cadena ");
  aniadir.append("Aniadida");
  System.out.println(aniadir);

  System.out.println("• Metodo insert() ");
  StringBuffer nombre1 = new StringBuffer("Insertar StringBuffer ");
  String apellido1 = " cadena String ";
  nombre1.insert(nombre1.length(), apellido1);
  System.out.println("Cadena resultante : " + nombre1);

  System.out.println("• Metodo reverse() ");
  System.out.println("Mensaje original : Girar el mensaje");
  StringBuffer cadena_normal = new StringBuffer("Girar el mensaje");
  cadena_normal = cadena_normal.reverse();
  System.out.println(cadena_normal);

  System.out.println("• Metodo delete()");
  System.out.println("Mensaje original : Borra el mensaje");
//                                               0123456789012345 
  StringBuffer cadena_borrar = new StringBuffer("Borra el -Mensaje");
  StringBuffer mensaje_borrado = cadena_borrar.delete(0, 9);
  System.out.println(mensaje_borrado);

  System.out.println("• Metodo replace()");
//                  0123456789012345
  String mensaje = "Mesaje Original";
//                   01234567890123456
  String mensaje2 = "Mesaje Reemplazar";

  StringBuffer cadena_reemplazar = new StringBuffer(mensaje);
  StringBuffer reemplazo = cadena_reemplazar.replace(0, 15, mensaje2);
  System.out.println(reemplazo);

  StringBuffer numeracion = new StringBuffer("0123456789");
  numeracion = numeracion.replace(5, 5, "abcd");
  System.out.println(numeracion);

  StringBuffer numeracion1 = new StringBuffer("0123456789");
  numeracion1 = numeracion1.replace(5, 6, "abcd");
  System.out.println(numeracion1);

  StringBuffer numeracion2 = new StringBuffer("0123456789");
  numeracion2 = numeracion2.replace(5, 7, "abcd");
  System.out.println(numeracion2);

  StringBuffer numeracion3 = new StringBuffer("0123456789");
  numeracion3 = numeracion3.replace(5, 9, "----");
  System.out.println(numeracion3);

  System.out.println("• Metodo substring()");
  StringBuffer numerico4 = new StringBuffer("0123456789");
  String cadena_substring1 = numerico4.substring(0, 4);
  String cadena_substring2 = numerico4.substring(8);
  System.out.println("Rango : " + cadena_substring1);
  System.out.println("Rango : " + cadena_substring2);

  System.out.println("• Metodo String()");
  StringBuffer numerico5 = new StringBuffer("0123456789");
  String pasar_toString = numerico5.toString();
  System.out.println(pasar_toString);

  if (pasar_toString.equals("0123456789")) {
   System.out.println("Es una cadena StringBuffer pasa a toString");
  }

  System.out.println("• Metodo charAt()");
  StringBuffer caracter = new StringBuffer("Cadena caracteres");
  System.out.print("cadena con charAt : " + caracter.charAt(0));
  System.out.print(caracter.charAt(2));
  System.out.print(caracter.charAt(4));
  System.out.print(caracter.charAt(6));
  System.out.print(caracter.charAt(8));
  System.out.print(caracter.charAt(10));
  System.out.println("\n• Recorrer toda la cadena : ");
  for (int i = 0; i < caracter.length(); i++) {
   System.out.print(caracter.charAt(i));
  }
  System.out.println("");

  System.out.println("• Metodo setCharAt()");
//                                                       01234567890123456789012 
  StringBuffer cambiar_char_de_lugar = new StringBuffer("Cambia char de a -> ' ' ");
  cambiar_char_de_lugar.setCharAt(21, 'A');
  System.out.println("Cambia char de a -> ' ' " + "\n" + cambiar_char_de_lugar + "mediante setCharAt");
 }

}
