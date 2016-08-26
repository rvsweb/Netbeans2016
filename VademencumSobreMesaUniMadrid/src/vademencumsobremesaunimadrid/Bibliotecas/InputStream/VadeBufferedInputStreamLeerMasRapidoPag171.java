/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @see - 171
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeBufferedInputStreamLeerMasRapidoPag171 {

 public static byte[] leeTodosLosBytes(String fichero) throws FileNotFoundException, IOException {
  File file = new File(fichero);
  int longitud = (int) file.length();
  InputStream is = new BufferedInputStream(new FileInputStream(fichero));
  byte[] total = new byte[longitud];
  int leidos = 0;
  while (leidos < longitud) {
   int n = is.read(total, leidos, longitud);
   if (n < 0) {
    break;
   }
   leidos += n;
  }
  is.close();
  return total;
 }

 public static void main(String[] args) throws IOException {
  byte[] leeTodosLosBytes = leeTodosLosBytes("c:\\x\\texto.txt");
  System.out.println(leeTodosLosBytes.length);
 }
}
