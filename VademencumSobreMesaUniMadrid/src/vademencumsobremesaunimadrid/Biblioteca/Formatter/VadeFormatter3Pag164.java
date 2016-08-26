/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Biblioteca.Formatter;

import java.util.Date;
import java.util.Locale;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeFormatter3Pag164 {

 public static void main(String[] args) throws InterruptedException {
  Decimales.test("de", "DE", 1234.56);
  Decimales.test("en", "US", 1234.56);
  Decimales.test("es", "ES", 1234.56);
  Decimales.test("fr", "FR", 1234.56);
  Decimales.test("pt", "PT", 1234.56);

  System.out.println("------ Fechas ------ ");
  Date date = new Date();
  String formato = String.format("cadena", date);
  System.out.println("Prueba : " + formato);

  Date date1 = new Date();
  String formato1 = String.format("%tc", date1);
  System.out.println("Prueba : " + formato1);

  Date date11 = new Date();
  String formato11 = String.format("%tZ", date11);
  System.out.println("Prueba : " + formato11);

  Date date12 = new Date();
  String formato12 = String.format("%tz", date12);
  System.out.println("Zona horaria : " + formato12);

  Date date13 = new Date();
  String formato13 = String.format("%tD", date13);
  System.out.println("Fecha resumida : " + formato13);

  Date date14 = new Date();
  String formato14 = String.format("%tF", date14);
  System.out.println("Fecha completa : " + formato14);

  Date date15 = new Date();
  String formato15 = String.format("%tA", date15);
  System.out.println("Dia : " + formato15);

  Date date16 = new Date();
  String formato16 = String.format("%ta", date16);
  System.out.println("Dia abreviado : " + formato16);

  Date date17 = new Date();
  String formato17 = String.format("%td", date17);
  System.out.println("Intervalo entre 1 - 31 : " + formato17);

  Date date18 = new Date();
  String formato18 = String.format("%te", date18);
  System.out.println("Intervalo entre 1 - 31 : " + formato18);

  Date date19 = new Date();
  String formato19 = String.format("%tj", date19);
  System.out.println("Intervalo entre 001-366 : " + formato19);

  Date date20 = new Date();
  String formato20 = String.format("%tB", date20);
  System.out.println("Mes : " + formato20);

  Date date21 = new Date();
  String formato21 = String.format("%tb", date21);
  System.out.println("Mes Abreviado : " + formato21);

  Date date22 = new Date();
  String formato22 = String.format("%th", date22);
  System.out.println("Mes Abreviado : " + formato22);

  Date date23 = new Date();
  String formato23 = String.format("%tm", date23);
  System.out.println("Mes numeral : " + formato23);

  Date date24 = new Date();
  String formato24 = String.format("%tm", date24);
  System.out.println("Numero del Mes : " + formato24);

  Date date26 = new Date();
  String formato26 = String.format("%tY", date26);
  System.out.println("Anio : " + formato26);

  Date date25 = new Date();
  String formato25 = String.format("%tC", date25);
  System.out.println("Primeros 2 numeros del año : " + formato25);

  Date date27 = new Date();
  String formato27 = String.format("%ty", date27);
  System.out.println("Ultimos 2 numeros del Anio  : " + formato27);

  Date date28 = new Date();
  String formato28 = String.format("%tR", date28);
  System.out.println("Hora : " + formato28);

  Date date30 = new Date();
  String formato30 = String.format("%tr", date30);
  System.out.println("Hora completa basica : " + formato30);

  Date date29 = new Date();
  String formato29 = String.format("%tT", date29);
  System.out.println("Hora completa : " + formato29);

  Date date31 = new Date();
  String formato31 = String.format("%tH", date31);
  System.out.println("Rango de hora entre 00 - 23 -> " + formato31);

  Date date32 = new Date();
  String formato32 = String.format("%tI", date32);
  System.out.println("Rango de hora entre 01 - 12 -> " + formato32);

  Date date33 = new Date();
  String formato33 = String.format("%tk", date33);
  System.out.println("Rango de hora entre 0 - 23 -> " + formato33);

  Date date34 = new Date();
  String formato34 = String.format("%tl", date34);
  System.out.println("Rango de hora entre 1 - 12 -> " + formato34);

  Date date35 = new Date();
  String formato35 = String.format("%tp", date35);
  System.out.println("tipo 'am' o 'pm' -> " + formato35);

  Date date36 = new Date();
  String formato36 = String.format("%Tp", date36);
  System.out.println("tipo 'AM' o 'PM' -> " + formato36);

  Date date37 = new Date();
  String formato37 = String.format("%tM", date37);
  System.out.println("00-59 -> " + formato37);

  Date date38 = new Date();
  String formato38 = String.format("%tS", date38);
  System.out.println("00-59 -> " + formato38);

  Date date39 = new Date();
  String formato39 = String.format("%ts", date39);
  System.out.println("Segundos desde 1-1-1970 -> " + formato39);

  Date date40 = new Date();
  String formato40 = String.format("%tM", date40);
  System.out.println("00-59 -> " + formato40);

  Date date41 = new Date();
  String formato41 = String.format("%tS", date41);
  System.out.println("00-59 -> " + formato41);

  Date date42 = new Date();
  String formato42 = String.format("%ts", date42);
  System.out.println("segundos desde el 1-1-1970 -> " + formato42);

  Date date43 = new Date();
  String formato43 = String.format("%tL", date43);
  System.out.println("000 - 999 -> " + formato43);

  Date date44 = new Date();
  String formato44 = String.format("%tQ", date44);
  System.out.println("milisegundos desde el 1-1-1970 -> " + formato44);

  Date date45 = new Date();
  String formato45 = String.format("%tN", date45);
  System.out.println("milisegundos desde el 1-1-1970 con 9 cifras -> " + formato45);

 }

}

class Formateo3 {

//  Cuando interesa escribir cantidades numericas usando el convenio local de 
//  numeros ( caracteres para separar grupos de 3 digitos ) se recurre a la
//  siguiente notacion:
//  
//  String format(Locale locale , String format , Object...args);
}

class Decimales {

 public static void test(String idioma, String pais, double num) {
  Locale locale = new Locale(idioma, pais);
  System.out.println(String.format(locale, "%s: %,.2f", locale, num));
 }

}
