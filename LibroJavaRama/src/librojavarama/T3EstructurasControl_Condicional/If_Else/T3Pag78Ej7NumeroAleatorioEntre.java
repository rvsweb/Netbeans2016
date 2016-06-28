/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Condicional.If_Else;

import java.util.Random;

/**
 *
 * @author Portatil
 */
public class T3Pag78Ej7NumeroAleatorioEntre {

 public static void main(String[] args) {
  Random rnd = new Random();
  int valor = (int) (rnd.nextDouble() * 100 + 100);
  System.out.println(valor);

  if (valor % 2 == 0) {
   System.out.println("Soy par ");
  } else if (valor % 2 == 1) {
   System.out.println("Soy inpar ");
  }

 }
}
