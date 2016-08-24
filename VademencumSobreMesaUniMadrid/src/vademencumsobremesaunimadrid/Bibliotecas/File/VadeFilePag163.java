/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.File;

import java.io.File;

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
 public static void main(String[] args) {

  File fichero = new File("C:\\x\\texto.txt");
  File directorio = new File("C:\\x");
  File otro = new File(directorio, "otro.txt");

  boolean canRead = fichero.canRead();
  System.out.println("puedo leer : " + canRead);
  boolean canWrite = fichero.canWrite();
  System.out.println("puedo escribir : " + canWrite);
  
 }
}
