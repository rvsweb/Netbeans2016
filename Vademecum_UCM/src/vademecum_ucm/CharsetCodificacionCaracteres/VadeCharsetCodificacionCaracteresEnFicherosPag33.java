/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.CharsetCodificacionCaracteres;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeCharsetCodificacionCaracteresEnFicherosPag33 {

 public static void main(String[] args) throws IOException {

  InputStream is = null;
  int i;
  char c;

  try {
   is = new FileInputStream("c:\\x\\test.txt");
   System.out.println("Characters printed: ");

   while ((i = is.read()) != -1) {
    c = (char) i;
    System.out.print(c);
   }
  } catch (Exception e) {
   e.printStackTrace();
  } finally {
   if (is != null) {
    is.close();
   }
  }

  Reader reader1 = new InputStreamReader(is, "iso-8859-1");
  System.out.println(reader1);
  Reader reader2 = new InputStreamReader(is, "UTF-8");
  System.out.println(reader2);

  String filename = "c:\\x\\test1.txt";
  OutputStream os = new FileOutputStream(filename);

  Writer writer11 = new OutputStreamWriter(os, "iso-8859-1");
  System.out.println(writer11);
  Writer writer12 = new PrintWriter(filename, "iso-8859-1");
  System.out.println(writer12);

  Writer writer21 = new OutputStreamWriter(os, "UTF-8");
  Writer writer22 = new PrintWriter(filename, "UTF-8");
 }
}
