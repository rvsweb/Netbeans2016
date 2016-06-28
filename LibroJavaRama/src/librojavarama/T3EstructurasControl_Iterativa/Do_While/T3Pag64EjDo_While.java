/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.Do_While;

/**
 *
 * @author Portatil
 */
public class T3Pag64EjDo_While {

  public static void main(String[] args) {

    Do_While_Contador.do_while_contador();
  }
}

class Do_While_Contador {

  public static void do_while_contador() {
    int numero = 1;
    do {
      System.out.println(numero);
      numero++;
    } while (numero <= 10);

  }
}
