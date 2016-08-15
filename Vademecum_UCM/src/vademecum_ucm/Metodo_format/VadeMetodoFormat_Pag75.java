/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Metodo_format;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @see - 81
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeMetodoFormat_Pag75 {

 public static void main(String[] args) throws FileNotFoundException {

  PrintStream ps = new PrintStream("pepe");
  PrintStream append = ps.append('a');

  PrintWriter pw = new PrintWriter("cadena");
  pw.append(" 2 ");
 }

}
