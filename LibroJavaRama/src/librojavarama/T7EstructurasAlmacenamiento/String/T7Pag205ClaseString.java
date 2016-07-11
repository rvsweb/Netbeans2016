/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.String;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag205ClaseString {

 public static void main(String[] args) {

  String cad1 = "Pepe";
  String cad2 = new String("Lionel");
  String cad3 = new String(cad2);

  String cad_long = "Pepe";
  System.out.println(cad_long.length());

  String cadn1 = "Andy";
  cadn1 = cadn1 + " ".concat("Rosique");
  System.out.println(cadn1);

  String cad11 = "EMMA";
  String cad21 = "MARIA";
  System.out.println("emma " + cad11.compareTo("emma"));
  System.out.println("EMMA " + cad21.compareTo("EMMA"));
  System.out.println("EMMA MORENO " + cad11.compareTo("EMMA MORENO"));
  System.out.println("MARIA AMPARO " + cad21.compareTo("MARIA AMPARO"));
  System.out.println("MAREA " + cad21.compareTo("MAREA"));

  System.out.println("Metodo equals : COMPARA CONTENIDOS ");
  String cad111 = "EMMA";
  String cad222 = new String("EMMA");

  System.out.println("Comprara contenido");
  if (cad111.equals(cad222)) {
   System.out.println("SON IGUALES");
  } else {
   System.out.println("NO SON IGUALES");
  }

  System.out.println("Compara referencia a los objetos ");
  if (cad111 == cad222) {
   System.out.println("SON IGUALES");
  } else {
   System.out.println("NO SON IGUALES");
  }

  System.out.println("Convertir en mayuscula las letras minusculas");
  String cad_min = "PALABRA minuscula";
  String cad_may = cad_min.toUpperCase();
  System.out.println(cad_may);

  System.out.println("Remplaza cadena ocurrencia del caracter car por el Caracter newcar");
  System.out.println("Puede cambiar los valores dentro de '' ");
  String cad1_replazar = "CAMBIAR 'U' U por o mayuscula ";
  String cad2_replazar = cad1_replazar.replace('U', 'O');
  System.out.println(cad2_replazar);

  System.out.println("SubString - Crear nuevo objeto que sera subcadena que comienza el caracter i y terminar con caracter f 'f' no se muestra");

//                        0123456789012345678901 
  String cad_subString = "Crear cadena SubString";
  System.out.println("Dentro de una cadena - coge los caracteres indicados por numero : " + cad_subString.substring(6, 12));
  System.out.println("Indica donde empieza a coger caracteres : " + cad_subString.substring(13));
 }
}
