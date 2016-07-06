package clases.Math;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class ClaseMath {

}

class NumeroAleatorios {

 public static void main(String[] args) {

  int minimo = 10;
  int maximo = 20;

  for (int i = 0; i < 10; i++) {
   int v = (int) (Math.random() * (minimo - maximo) + maximo);

   System.out.println("(minimo - maximo) + maximo) : " + v);
   int v1 = (int) ((Math.random() * (minimo + maximo) + maximo));
   System.out.println("(minimo + maximo) + maximo) : " + v1);

   int v2 = (int) (Math.random() * (1 + 100) + 1);
   System.out.println("(1 + 100) + 1) : " + v2);

   int v3 = (int) (Math.random() * (50 + 100) + 50);
   System.out.println("(50 + 100) + 50) : " + v3);

   long m = (long) (Math.random() * (600000000 - 699999999) + 699999999);
   System.out.println("" + m);

  }
 }

}
