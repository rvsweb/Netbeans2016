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
public class T7Pag205ClaseStringMetodosBasicos {

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

  System.out.println("Comienza la cadena - startWith(String cad)");
  String cad_comienza = "Cadena empieza";
  String cad_no_comienza = "Cadena no comienza";
  System.out.println("1º La cadena comienza : " + cad_comienza.startsWith(cad_comienza));
  System.out.println("2º La cadena comienza : " + cad_no_comienza.startsWith(cad_comienza));

  System.out.println("Delvolver el objeto String que se especifica por parametro pos ");
//                      01234567890123456
  String cad_obj_dev = "Cadena a devolver";
  System.out.println("• " + cad_obj_dev);
  System.out.println("• " + cad_obj_dev.charAt(0) + " - " + cad_obj_dev.charAt(7) + " - " + cad_obj_dev.charAt(16));

  System.out.println("Ejemplo de indices ");
//                          012345678901234567
  String cad_con_indices = "abcdefghijklmnopqrstuvwxyz";
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('A'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('b'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('c'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('C'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('r'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('R'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('y'));
  System.out.println("Posicion se encuentra : " + cad_con_indices.indexOf('z'));

  System.out.println("- Almacena en array char todos los elementos de un String ");
  String cadena_dentro_vector = "String a vector/array char ";
//  NO INSTANCIA EL array de char = los 2 objetos apuntan a la misma Referencia
  char cadena_dentro_vector2[] = cadena_dentro_vector.toCharArray();
  System.out.println("- Mostrar array char que almacena cadena String");

  System.out.println(" • Recorrer array de char ");
  for (int i = 0; i < cadena_dentro_vector.length()/*String*/; i++) {
   System.out.print(cadena_dentro_vector2[i]);
  }

  System.out.println("Recorrer array de char ");
  for (int i = 0; i < cadena_dentro_vector2.length/*char [] */; i++) {
   System.out.print(cadena_dentro_vector2[i]);
  }

  System.out.println("Convierte un numero a un objeto String");
  int num1 = 6;
  String str0 = String.valueOf(num1);
  float num2 = 6;
  String str1 = String.valueOf(num2);
  long num3 = 6;
  String str2 = String.valueOf(num3);
  double num4 = 6.5;
  String str3 = String.valueOf(num4);
  if (num1 == 6) {
   System.out.println("Valor primitivo : " + num1);
  }
  if (str0.equals("6")) {
   System.out.println("el num en String es : " + str0);
  }

  if (num2 == 6) {
   System.out.println("Valor primitivo : " + num2);
  }
  if (str1.equals("6")) {
   System.out.println("el num en String es : " + str1);
  }

  if (num3 == 6) {
   System.out.println("Valor primitivo : " + num3);
  }
  if (str2.equals("6")) {
   System.out.println("el num en String es : " + str2);
  }

  if (num4 == 6.5) {
   System.out.println("Valor primitivo : " + num4);
  }
  if (str3.equals("6.5")) {
   System.out.println("el num en String es : " + str3);
  }

 }
}
