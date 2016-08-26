/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Biblioteca.Formatter;

import java.util.Date;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeFormatterPag164 {

}

class Formateo {

 public static void main(String[] args) {
  String s = String.format("%d", 5);
  System.out.println("• cadena : " + s);
  String s1 = String.format("%3d", 5);
  System.out.println("• cadena : " + s1);
  String s2 = String.format("%.2f", Math.PI);
  System.out.println("• cadena : " + s2);
  String s3 = String.format("%8.4f", Math.PI);
  System.out.println("• cadena : " + s3);
  String s4 = String.format("%8.2feuros", 5.95);
  System.out.println("• cadena : " + s4);
  String s5 = String.format("%,10.0f euros", 48000.95);
  System.out.println("• cadena : " + s5);
  String s6 = String.format("%s %s", "hola", "muchacho");
  System.out.println("• cadena : " + s6);
  String s7 = String.format("%5s", "hola");
  System.out.println("• cadena : " + s7);
  Date date = new Date();
  String dia = String.format("Fecha y hora : %tc", date);
  System.out.println("• dia : " + dia);
  long date1 = System.currentTimeMillis();
  String dia1 = String.format("Fecha y Hora : %tc", date1);
  System.out.println("• dia 1 : " + dia1);
  Date date2 = new Date();
  String dia2 = String.format("Son las %tH:%<tM", date2);
  System.out.println("• dias 2 : " + dia2);

// Especificacion de formato 
//  % [ argumento $ ] [marca] [ancho] [ . precision ] tipo
//  donde las partes entre corchetes son opcionales 
//• argumento $ 
//  De entre los valores que vienen a continuacion , 1$ se refiere al primer argumento
//  2$ al segundo y asi sucesivamente. < se refiere al anterior 
//  Si no se especifica argumento , se van usando los valores presentes sucesivamente
//• marca  
//  Determina pequeñas variantes sobre la cadena generada:
//   Nada. Ajusta a la derecha , rellenando con blancos a la izquierda hasta alcanzar el 
//         ancho deseado
// | | -> Caracter blanco , Se inserta un blanco a la izquierda en valores positivos
//  -  -> Ajusta a la izquierda , rellenado con blancos a la derecha hasta alcanzar el ancho indicado
//  #  -> Formato alternativo
//  +  -> Incluir siempre el signo de la cantidad numerica , sea positivo o negativo
//  (  -> Si el valor es negativo , colocarlo entre parentesis
//  0  -> Rellenar a la izquierda con 0
//  ,  -> Incluir separadores locales entre miles , millones etc
//• ancho
//  Indica la longitud minima de la cadena generada , Si se necesita mas espacio , la cadena
//  sera mas larga , Si no , se rellena con blancos a la izquierda ( salvo si se indica la marca '-' en cuyo caso se rellena por la derecha , o si se indica la marca '0' en cuyo caso se rellena con ceros)
//• precision 
//  %f Numero de cifras decimales (tras la coma ) 
//  %e exponencial
//  %g Numero de cifras significativas
//  %b Ancho maximo , Se trunca la palabra
//  %s Ancho maximo , Si la cadena es mas larga , se trunca
//• tipo
//  %n Fin de linea 
//  %% Caracter '%'
//  %s %S Cadena de caracteres
//  %d Numero entero : notacion decimal
//  %o Numero entero : notacion octal
//  %x %X Numero entero : notacion hexadecimal
//  %c %C Numero entero : como caracter
//  %f Numero real , sin usar notacion cientifica ( sin exponente )
//  %e %E Numero real : notacion cientifica (con exponente) 
//  %g %G Numero real : como %f , excepto si se sale del ancho , en cuyo caso se salta a formato %e
//  %b %B Valor booleano
//  --------------------------------------------------
//  %t %T Fecha y hora
//  %tA dia de la semana(ej.lunes)
//  %ta dia de la semana abreviado (ej.lun)
//  %tB mes (ej.junio)
//  %tb mes abreviado (ej.jun)
//  %tC siglo : año / 100 : 2 cifras
//  %tc "%ta %tb %td %tT %tZ %tY"
//  %tD "%tm/%td/%ty"
//  %td dia del mes : 01..31
//  %tE tiempo en milisegundos desde el 1 de enero de 1970
//  %te dia del mes : 1..31
//  %tF "%tY-%tm-%td"
//  %tH hora:00..23
//  %th "%tb"
//  %tI hora: 01-12
//  %tj dia del año : 001..366
//  %tk hora : 0..23
//  %tL milisegundos : 000..999
//  %tl hora : 1..12
//  %tM minuto: 00..59
//  %tm mes: 01-12
//  %tN nanosegundos(9 cifras)
//  %tp "am" o "pm"
//  %Tp "AM" o "PM"
//  %tQ milisegundos desde 1 enero 1970
//  %tR "%tH:%tM"
//  %tr "%tI:%tM:%tS %Tp"
//  %tS segundos: 00..59
//  %ts segundos desde 1 de enero 1970
//  %tT "%tH:%tM:%tS"
//  %tY año : 2005
//  %ty dos ultimas cifras del año : 05
//  --------------------------------------------------
//  %tZ zona horaria abreviada
//  %tz zona horaria : diferencia respecto de GMT
  Date date3 = new Date();
  String dia3 = String.format("Hoy es %tA, %<te de %<tB de %<tY", date3);
  System.out.println("• dias 3 : " + dia3);

  Date date4 = new Date();
  String dia4 = String.format("Hora : %tH ", date4);
  System.out.println("• dias 4 : " + dia4);

  Date date5 = new Date();
  String dia5 = String.format("Hora : %tQ ", date5);
  System.out.println("• dias 5 : " + dia5);

  Date date6 = new Date();
  String dia6 = String.format("Hora : %tS  ", date6);
  System.out.println("• dias 6 : " + dia6);

 }
}
