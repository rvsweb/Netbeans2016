/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.UsoThis;

/**
 *
 * @author Portatil
 */
public class T4Pag116UsoThisDentroConstructores {

 public static void main(String[] args) {
  new Calcular(3);
 }
}

class Calcular {

 public Calcular(int i) {
  this(" • Valor : ", i, 1);
 }

 /**
  *
  * @param s
  * @param x
  * @param z
  */
 public Calcular(String s, int x, int z) {
  this("Lanzar 3º constructor dentro del 2º constructor con el mensaje : ");
  int total = x * z;
  System.out.println(" mensaje : " + s + " de " + x + " * " + z + " = " + total);
 }

 public Calcular(String e) {
  System.out.println(" ♦ Mensaje 3º constructor : " + e);
 }

}
