/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.While;

/**
 *
 * @author Portatil
 */
public class T3Pag63EjWhile {

  public static void main(String[] args) {

    WhileContador.contadorWhile((int) (Math.random() * (1 + 20)));
  }
}

class WhileContador {

  public static void contadorWhile(int num) {
    int n = num;
    
    while (num > 0) {
      System.out.println("num 0 : " + num);
      num--;
    }

    System.out.println("Soy el valor : " + num);

    int r = 0;
    while (r < n) {
      r++;
      System.out.println("num 1 : " + r);
    }
  }

}
