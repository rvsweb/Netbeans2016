/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.String;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeString_Pag196 {

}

/**
 * "String" - Objetos de java con una sintaxis especialmente comoda para
 * representar cadenas de caracteres
 *
 * Los caracteres se codifican usando Unicode '\u0010'
 *
 * Los objetos String son inmutables
 *
 * No hay forma de modificarlos una vez construidos
 *
 * Algunas operaciones de String son ineficientes debido a la creacion de
 * objetos que se van a destruir a continuacion
 *
 * La clase StringBuilder permite disponer de un solo objeto que se puede
 * modificar
 *
 * La comparaciones entre String se limitan a usar el orden numerico de los
 * codigos 'Unicode' , a veces choca con el orden estamos acostumbrados en los
 * diccinarios , el orden lexicografico , que depende de cada idioma
 *
 * Para realizar comparaciones usando el orden lexicografico propio de cada
 * idioma.
 *
 * @author remoto
 */
class Uso_String {

 public static void main(String[] args) {

  String cadena = "cadena"; // POSTERIOR
  int longitud = cadena.length();
  System.out.println("• length() " + longitud);
  Object cadena1 = "cadena"; // ANTERIOR

//  Determina si tiene los mismos caracteres que la cadena 'cadena1'
  boolean cadena2 = cadena.equals(cadena1);
  System.out.println("♦ equals() : " + cadena2);

//  Determina si tiene los mismos caracteres que la cadena 'cadena1'
  boolean cadena3 = cadena.equalsIgnoreCase((String) cadena1);
  System.out.println("♦ equalsIgnoreCase() : " + cadena3);

//• Determina si la cadena contiene los mismos caracteres que la cadena 'cadena1' 
//  independientemente de que esten en mayusculas o minusculas
//->  String cadena = "1cadena"; // POSTERIOR
//->  Object cadena1 = "cadena1"; // ANTERIOR
//• En las comparaciones se usa el Codigo 'Unicode' lo que no siempre responde al orden
//  lexicografico (de diccionario)
  int comparar_Cadenas = cadena.compareTo((String) cadena1);
  System.out.println("♦ compareTo : " + comparar_Cadenas);
  if (cadena.compareTo((String) cadena1) == -1) {
   System.out.println("la cadena es anterior : " + cadena.compareTo((String) cadena1));
  }
  if (cadena.compareTo((String) cadena1) == 0) {
   System.out.println("la cadena es igual : " + cadena.compareTo((String) cadena1));
  }
  if (cadena.compareTo((String) cadena1) == 1) {
   System.out.println("la cadena es posterior : " + cadena.compareTo((String) cadena1));
  }

//• String trim()
//  Crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final
  String cadena_trim = "  Hello Friend ";
  String trim = cadena_trim.trim();
  System.out.println(trim);

  String cadena_caracter = "  Hello Friend ";
  System.out.println(" -> " + cadena_caracter.charAt(3));

//• Cadena a ToCharArray()
  String cadena_a_array_char = "   -Hello Friend ";
  String trim1 = cadena_a_array_char.trim();
  char[] array = trim1.toCharArray();
  for (int i = 0; i < array.length; i++) {
   System.out.print(array[i]);
  }
  System.out.println("");

//• Convertir la cadena en un array de caracteres 
  String cadena_sub = "Hello Friend";
  String sub_cadena = cadena_sub.substring(0, 5);
  System.out.println("•-" + sub_cadena);

//• Extrae la sub-cadena desde la posicion indicada
  String cadena_sub1 = "Hello Friend";
  int indice = cadena_sub1.indexOf('c');
  System.out.println(indice);
  int indice1 = cadena_sub1.indexOf('H');
  int indice2 = cadena_sub1.indexOf('e');
  System.out.println("Cadena : H - Posicion : " + indice1);
  System.out.println("Cadena : e - Posicion : " + indice2);

//• Indica en que posicion se encuentra el caracter ( o cadena)
//  indicado por primera vez , buscando desde el final
  String cadena_sub2 = "Hello Friend";
  int busca_final = cadena_sub2.lastIndexOf('o');
  System.out.println("Cadena : o - Posicion : " + busca_final);

//• Indica si la cadena comienza con el prefijo indicado
  boolean comienza = cadena_sub.startsWith("He");
  if (comienza == true) {
   System.out.println("La cadena comienza por : 'He' : " + comienza);
  }

//• Indica si la cadena comienza con el prefijo indicado
  boolean termina = cadena_sub.endsWith("end");
  if (comienza == true) {
   System.out.println("La cadena comienza por : 'end' : " + termina);
  }

//• Fragmenta la cadena en varias subcadenas utilizando el patron como separador  
  String[] fragmentar = cadena.split("a");
  for (int i = 0; i < fragmentar.length; i++) {
   System.out.println("•- " + fragmentar[i]);
  }

  System.out.println(".............. Ejemplos del libro ................");
  int length = "Miguel".length();
  boolean equals = "Miguel".equals("Miguel");
  boolean equals2 = "Miguel".equals("miguel");
  boolean equalsIgnoreCase = "Miguel".equalsIgnoreCase("miguel");
  int compareTo = "Miguel".compareTo("Saturno");
  char charAt = "Miguel".charAt(0);
  char charAt1 = "Miguel".charAt(0x0);
  char charAt2 = "Miguel".charAt(0b0);
  char[] array_char = "Miguel".toCharArray();
  String subcadena = "Miguel".substring(0, 2);
  String subcadena1 = "Miguel".substring(1);
  int indice3 = "Berserk".indexOf('a');
  int indice4 = "Berserk".indexOf('e');
  int indice5 = "Berserk".lastIndexOf('e');
  boolean indice6 = "Berserk".startsWith("Ber");
  boolean indice7 = "Berserk".startsWith("Berk");
  boolean indice8 = "Berserk".endsWith("Berk");
  String[] indice9 = "Berserk".split("e");
  System.out.println("• " + length);
  System.out.println("• " + equals);
  System.out.println("• " + equals2);
  System.out.println("• " + equalsIgnoreCase);
  System.out.println("• " + compareTo);
  System.out.println("• Decimal : " + charAt);
  System.out.println("• Hexadecimal : " + charAt1);
  System.out.println("• Binario : " + charAt2);
  System.out.println("• Array char : " + array_char);
  System.out.println("• Subcadena : " + subcadena);
  System.out.println("• Subcadena : " + subcadena1);
  System.out.println("• Indice : " + indice3);
  System.out.println("• Indice : " + indice4);
  System.out.println("• Indice : " + indice5);
  System.out.println("• Empieza Berserk : " + indice6);
  System.out.println("• Empieza Berserk : " + indice7);
  System.out.println("• Termina Berserk : " + indice8);

  for (int i = 0; i < indice9.length; i++) {
   System.out.print("|" + indice9[i]);
  }
  System.out.println("");
 }

}
