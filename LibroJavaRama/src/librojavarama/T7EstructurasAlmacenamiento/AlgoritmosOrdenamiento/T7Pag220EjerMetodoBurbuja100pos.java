/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.AlgoritmosOrdenamiento;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag220EjerMetodoBurbuja100pos {

}

class OrdenarArrayBurbuja {

// 1º crea el array
 private static int[] lista;
// 2º crea posicion
 final static int POS = 50;
// 3º crea max elementos
 final static int LIMITE = 100;
// 4º crea metodo generar elem aleatorios

 public static int getAleatorio() {
  return (int) (Math.random() * LIMITE + 1);
 }

 public static void ordena(int array[]) {
  int aux;
  for (int i = array.length; i > 0; i--) {
   for (int j = 0; j < i - 1; j++) {
    if (array[j] > array[j + 1]) {
     aux = array[j + 1];
     array[j + 1] = array[j];
     array[j] = aux;
    }
   }
  }
 }

 public static void muestra() {
  for (int i = 0; i < POS; i++) {
   System.out.print('|' + lista[i] + "|");
  }
  System.out.println("");
 }

 public static void main(String[] args) {

  lista = new int[POS];

  System.out.println("");
  for (int i = 0; i < POS; i++) {
   lista[i] = getAleatorio();
   System.out.print("-" + lista[i]);
  }
  System.out.println("");

  System.out.println("");
  OrdenarArrayBurbuja.muestra();
  System.out.println("");
  ordena(lista);
  System.out.println("");
  muestra();
  System.out.println("");
 }
}
