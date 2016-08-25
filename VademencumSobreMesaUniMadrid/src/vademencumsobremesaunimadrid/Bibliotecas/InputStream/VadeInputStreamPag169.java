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
import java.util.ArrayList;
import vademencumsobremesaunimadrid.Visibilidad.A;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeInputStreamPag169 {

 public static String asciiBytesToString(byte[] bytes) {
  if ((bytes == null) || (bytes.length == 0)) {
   return "vacio";
  }
  char[] result = new char[bytes.length];
  for (int i = 0; i < bytes.length; i++) {
   result[i] = (char) bytes[i];
  }
  return new String(result);
 }

 public static void main(String[] args) throws FileNotFoundException, IOException {
  File f = new File("c:\\x\\texto.txt");
  FileInputStream fis = new FileInputStream(f);
  FileInputStream fis1 = new FileInputStream("c:\\x\\texto.txt");

  int available = fis.available();
  System.out.println("Estimacion nº bytes : " + available);

  byte[] b = new byte[fis.available()];

  byte[] bb = new byte[fis.available()];

  for (int i = 0; i < b.length; i++) {
   char caracter = (char) fis.read();
   System.out.print(caracter);
  }

  for (int i = 0; i < bb.length; i++) {
   System.out.print("|" + fis1.read());
  }

  System.out.println("\nCierra el fichero ");
  fis.close();
 }
}
