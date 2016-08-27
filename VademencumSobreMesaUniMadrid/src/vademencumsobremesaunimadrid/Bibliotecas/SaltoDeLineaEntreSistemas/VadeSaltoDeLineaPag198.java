/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.SaltoDeLineaEntreSistemas;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSaltoDeLineaPag198 {

 public static void main(String[] args) {

//  Sistema tipo Unix , Linux
//  "linea 1" + "n" + "linea 2";
//  
//  Sistema tipo Windows
//  "linea 1" + "rn" + "linea 2"
//
  String LS = System.getProperty("line.separator");
  System.out.println(LS + " salto ");
  String sg = String.format("%s%n%s", "linea 1 ", "linea 2");
  System.out.println(sg);

 }
}
