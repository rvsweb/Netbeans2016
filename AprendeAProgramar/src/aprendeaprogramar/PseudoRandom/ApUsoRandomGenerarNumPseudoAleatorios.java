/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.PseudoRandom;

import java.util.Random;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=638:generar-numeros-aleatorios-en-java-clase-random-y-metodo-nextint-ejercicio-ejemplo-resuelto-cu00672b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoRandomGenerarNumPseudoAleatorios {

}

/**
 * Objeto de esta clase se usa para generar una secuencia (stream) de numero
 * pseudoAleatorios a partir de una SEMILLA 'valor inicial'
 *
 * @author Portatil
 */
class UsoClaseRandom {

 public static void main(String[] args) {
  Random num_aleatorio = new Random();

  byte[] b = {1, 2, 4, 5, 6, 7, 8, 9, 0};

  System.out.println("Boolean aleatorio : " + num_aleatorio.nextBoolean());
  System.out.println("Boolean aleatorio : " + num_aleatorio.nextBoolean());

  System.out.println("Valor aleatorio : " + num_aleatorio.nextDouble());
  System.out.println("Valor aleatorio : " + num_aleatorio.nextFloat());
  System.out.println("Valor aleatorio : " + num_aleatorio.nextInt());
  System.out.println("Valor aleatorio : " + num_aleatorio.nextLong());
  System.out.println("Valor aleatorio : " + num_aleatorio.nextGaussian());
  System.out.println("Valor aleatorio : " + num_aleatorio.nextInt(2));

 }
}
