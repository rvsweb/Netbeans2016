/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.File;

import java.io.File;
import java.io.IOException;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeFilePag163 {

 /**
  * Clase java para referirse a ficheros y directorios en el sistema de ficheros
  * del ordenador
  *
  * Un objeto File se puede construir a partir del nombre o ruta completa o a
  * partir del directorio en el que se encuentra
  *
  * @param args
  */
 public static void main(String[] args) throws IOException {

  File fichero = new File("C:\\x\\texto.txt");
  File directorio = new File("C:\\x");
  File otro = new File(directorio, "otro.txt");

  boolean canRead = fichero.canRead();
  System.out.println("puedo leer : " + canRead);
  boolean canWrite = fichero.canWrite();
  System.out.println("puedo escribir : " + canWrite);
  String canonicalPath = fichero.getCanonicalPath();
  System.out.println("ruta completa : " + canonicalPath);
  String nombre = fichero.getName();
  System.out.println("nombre : " + nombre);
  String nombre1 = fichero.getParent();
  System.out.println("nombre : " + nombre1);
  File parentFile = fichero.getParentFile();
  System.out.println("padre o directorio en el que se encuentra : " + parentFile);
  boolean directorio1 = fichero.isDirectory();
  System.out.println("es directorio : " + directorio1);
  boolean archivo_fichero = fichero.isFile();
  System.out.println("es archivo_fichero : " + archivo_fichero);
  long longitud_fichero = fichero.length();
  System.out.println("Tamaño del fichero en bytes : " + longitud_fichero);

  System.out.println("Lista de directorios ");
  String[] lista = directorio.list();
  for (int i = 0; i < lista.length; i++) {
   System.out.println("directorio : " + lista[i]);
  }

  System.out.println("Si se trata de directorio , un array con los ficheros que contiene");
  File[] listFiles = directorio.listFiles();
  for (int i = 0; i < listFiles.length; i++) {
   System.out.println("directorio : " + listFiles[i]);
  }

  File fichero1 = new File("c:\\x\\1");
  boolean creado = fichero1.mkdir();
  System.out.println("creado el archivo : " + creado);

  File directorios1 = new File("c:\\x\\2");
  boolean creado_d = directorios1.mkdirs();
  System.out.println("creado el directorio : " + creado_d);

  File directorio_c = new File("c:\\x1");
  boolean cambiar_nombre = directorio_c.renameTo(directorio);
  System.out.println("cambiar el nombre : " + cambiar_nombre);
 }
}
