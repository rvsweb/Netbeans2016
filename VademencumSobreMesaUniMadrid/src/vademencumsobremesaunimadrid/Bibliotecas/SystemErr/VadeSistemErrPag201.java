/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.SystemErr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSistemErrPag201 {

}

class SystemErr {

}

class SalidaEstandar {

 public final static PrintStream err = null;

 public static void main(String[] args) throws FileNotFoundException {
  System.out.println("System.err : salida Alternativa ");

  PrintStream salida = new PrintStream("c:\\x\\errores.txt");

  BufferedReader b;

 }

}
