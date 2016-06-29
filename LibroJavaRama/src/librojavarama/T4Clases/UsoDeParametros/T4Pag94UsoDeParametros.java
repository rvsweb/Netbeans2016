/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.UsoDeParametros;

/**
 *
 * @author Portatil
 */
public class T4Pag94UsoDeParametros {

 public static void main(String[] args) {
  int x = 3;
  int[] arrax = {3};
  TestParam.cambiar(x);
  System.out.println("Por valor : " + x);
  TestParam.cambiar2(arrax);
  System.out.println("Por Referecia : " + arrax[0]);
 }

}

class TestParam {

 public static void cambiar(int x) {
  x++;
 }

 public static void cambiar2(int[] par) {
  par[0]++;
 }

}
