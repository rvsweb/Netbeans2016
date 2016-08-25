/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class VadeInputEjemploLeerFicheroPag170 {

 /**
  * Lectura de todos los bytes de un fichero
  *
  * @param fichero nombre del fichero del que queremos leer
  * @return todos los bytes en el fichero
  * @throws FileNotFoundException
  * @throws IOException Si no hay problemas al abrir el fichero o al escribir
  */
 public static byte[] leeTodoslosBytes(String fichero) throws FileNotFoundException, IOException {
  File file = new File(fichero); // localizacion del archivo
  int longitud = (int) file.length(); // longitud del archivo 
  InputStream is = new FileInputStream(fichero); // entrada de flujo del archivo

  byte[] total = new byte[longitud]; // longitud max del archivo dentro del array byte
  int leidos = 0;

  while (leidos < longitud) { // 0 < longitud max
//                  max      0           
   int n = is.read(total, leidos, longitud);
   if (n < 0) { // nº es menor que 0
    break;
   }
   leidos += n;
  }
  is.close();
  return total;
 }

 public static void main(String[] args) {
  try {
   byte[] leeTodoslosBytes = leeTodoslosBytes("C:\\x\\texto.txt");
   for (int i = 0; i < leeTodoslosBytes.length; i++) {
    System.out.println("•- " + leeTodoslosBytes[i]);
   }
  } catch (IOException ex) {
   Logger.getLogger(VadeInputEjemploLeerFicheroPag170.class.getName()).log(Level.SEVERE, null, ex);
  }
 }
}
