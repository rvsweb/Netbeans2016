/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeReaderClaseAbstracta {

}

/**
 * Madre de un conjunto de clases para leer ficheros caracter a caracter
 *
 * Java convierte los bytes que contiene el fichero en caracteres 'UNICODE'
 *
 * Codificacion de los caracteres
 *
 * @author remoto
 */
class Uso_Reader {

 /**
  * BufferedReader - Para leer caracteres mas deprisa y para leer linea a linea
  *
  * Reader lee caracteres de 16 bits
  *
  * Si necesita leer bytes 8 bits - debe utilizar la clase InputStream
  *
  * @param fichero
  * @return
  * @throws FileNotFoundException
  * @throws IOException
  */
 public static String leeTodoslosCaracteres(String fichero) throws FileNotFoundException, IOException {
  StringBuilder buffer = new StringBuilder();
  Reader reader = new FileReader(fichero);
  char[] chars = new char[1024];
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

 public static void main(String[] args) throws IOException {

  String ruta = "c:\\x\\texto4.txt";
  File f = new File(ruta);
  System.out.println(leeTodoslosCaracteres(ruta));

// ♦ Metodos 
//  close() - cierra el fichero
//  read() - lee un caracter 
//           devuelve el caracter leido pasado a entero
//           devuelve -1 si el fichero se ha acabado
//  read(char [] chars) - lee un num 'n' de caracteres igual o menor 
//                        que la longitud del array 'chars'
//                        devuelve el numero de caracteres leidos;
//                        los caracteres leidos estan en la posiciones 
//                        [ 0 ... n-1 ] del array 'chars'
//                        devuelve -1 si el fichero se ha acabado
// read(char [] chars , int start , int n ) 
//                      - lee un numero 'n' de caracteres 
//                        devuelve el numero de caracteres leidos;
//                        los caracteres leidos estan en las posiciones
//                        [start...start + n - 1] del array 'chars'
//                        devuelve -1 si el fichero se ha acabado
 }
}
