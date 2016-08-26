/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeBufferedReaderPag192 {

}

/**
 * Clase derivada de Reader que proporciona
 *
 * Mas Rapidez , al leer montones de caracteres antes de que se los pidan
 *
 * metodo "readLine()" devuelve los caracteres linea a linea
 *
 * BufferedReader realiza una gestion mas eficiente del fichero , leyendo muchos
 * caracteres de golpe para las llamadas a los metodos 'read()' sean más rapidas
 *
 * @author remoto
 */
class UsoBufferedReader {

 public String leeTodosLosCaracteres(String fichero) throws FileNotFoundException, IOException {
  StringBuilder buffer = new StringBuilder();
  Reader reader = new BufferedReader(new FileReader(fichero));
  char[] chars = new char[1024]; // bytes
  while (true) {
   int n = reader.read(chars);
   if (n < 0) {
    break;
   }
   buffer.append(chars, 0, n);
  }
  reader.close();
  return buffer.toString();
 }

 /**
  * Metodo readLine() para leer linea a linea
  *
  * @param fichero
  * @return
  */
 public List<String> leeTodasLasLineas(String fichero) throws FileNotFoundException, IOException {
  List<String> lineas = new ArrayList<String>();
  BufferedReader reader = new BufferedReader(new FileReader(fichero));
  while (true) {
   String linea = reader.readLine();
   if (linea == null) {
    break;
   }
   lineas.add(linea);
  }
  reader.close();
  return lineas;
 }

 public static void main(String[] args) throws IOException {

  UsoBufferedReader ubr = new UsoBufferedReader();
  String cadena = ubr.leeTodosLosCaracteres("c:\\x\\texto4.txt");
  System.out.println("------------------------");
  System.out.println(cadena);
  System.out.println("------------------------");
  List<String> leeTodasLasLineas = ubr.leeTodasLasLineas("c:\\x\\texto4.txt");
  System.out.println(leeTodasLasLineas);
 }
}
