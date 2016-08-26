/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Static;

/**
 * @see - 156
 * @author remoto
 */
public class VadeStaticPag136 {

}

/**
 * Se utiliza para referirse a los miembros de una clase
 *
 * @author remoto
 */
class Static {

// Metodos de clase 
// 1- Se pueden utilizar sin declarar objetos : basta referirse a la clase
// 
// 2- Solo pueden acceder a variables de clase 
// 
// 3- No pueden acceder a los campos de los objetos porque no hay 'objetos' "TODAVIA"
 public static double max(double a, double b) {
//
  if (a < b) {
   return a;
  }
  return b;
 }

}

// Bloques Static 
class Diccionario {

 // Metodos : bloques Static
 private static final String[][] diccionario;

 static {
  diccionario = new String[2][2];
  diccionario[0] = new String[]{"hola", "hi"};
  diccionario[1] = new String[]{"adios", "bye"};
 }

 public static void main(String[] args) {
  int maximo = Math.max(1, 2);
  System.out.println("Maximo : " + maximo);

  for (int i = 0; i < Diccionario.diccionario.length; i++) {
   for (int j = 0; j < Diccionario.diccionario[0].length; j++) {
    System.out.print(Diccionario.diccionario[i][j] + " | ");
   }
   System.out.println("");
  }
 }

}
