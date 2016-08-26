/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.OutputStream;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadePrintStreamPag187 {

}

/**
 * Clave derivada de OutputStream
 *
 * Para escribir en un fichero , proporcionando una serie de metodos que
 * facilitan tareas habituales
 *
 * @author remoto
 */
class Uso_PrintStream {

 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

  String ruta = "c:\\x\\texto.txt";
  String ruta1 = "c:\\x\\texto1.txt";
  String ruta2 = "c:\\x\\texto2.txt";
  String ruta3 = "c:\\x\\texto3.txt";

  PrintStream escribir_byte = new PrintStream(ruta);
  PrintStream escribir_byte1 = new PrintStream("c:\\x\\texto.txt");
  OutputStream ops = new PrintStream(ruta);
  PrintStream ops1 = new PrintStream(ops);

  PrintStream fichero = new PrintStream(ruta, "UTF-8");
  PrintStream fichero2 = new PrintStream("c:\\x\\texto.txt", "UTF-8");
  PrintStream fichero3 = new PrintStream("c:\\x\\texto1.txt", "UTF-8");

  String s1 = "• Prueba •";
  String s2 = "♦ Prueba 2 ♦ ";
  String s3 = "♦ Prueba 3 ♦ ";
  String s4 = "♦ Prueba 4 ♦ ";

  fichero2.format(Locale.ENGLISH, "• This is a %s program • ", s1);
  fichero2.flush();

  fichero3.printf(Locale.ENGLISH, "♦This is a %s program", s2, s3, s4);
  fichero3.flush();

  PrintStream p = new PrintStream(ruta2);
  char[] c = new char[]{'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
  p.print(c);
  p.flush();

  PrintStream po = new PrintStream(ruta3);
  po.print(s1);
  po.flush();

 }
}
