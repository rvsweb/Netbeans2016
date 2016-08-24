/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Locales;

/**
 * @see - 148
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeVariablesLocales {

}

class BusquedaBinaria {

// Busqueda Binaria ( de Diccionario ) 
// Dado un array ordenado de enteros , encontrar en que posicion se encuentran en Numero 'N'
// Devuelve la posicion 'N' en el Array
// Devuelve -1 si 'N' no esta en el Array
 /**
  *
  * @param n
  * @param datos
  * @return
  */
//                    ?          !   
 public int busca(int n, int[] datos) {
//                       ?    !  nicio    13
  return busquedaBinaria(n, datos, 0, datos.length);
 }

 /**
  * Busca en el Rango a...z
  *
  * @param n
  * @param datos
  * @param a
  * @param z
  * @return
  */
 private int busquedaBinaria(int n, int[] datos, int a, int z) {
  if (a > z) {
   return -1;
  }
//             0  13   / 2 = 6
  int medio = (a + z) / 2;
//                    6
  int valor = datos[medio];
//      6      ?  
  if (valor == n) {
   return medio; // encontrado
  }
//      6     ?  
  if (valor < n) {
//                        ?         0    5    
   return busquedaBinaria(n, datos, a, medio - 1); // a la izquierda
  } else {
//                        ?           7       13  
   return busquedaBinaria(n, datos, medio + 1, z); // a la derecha 
  }
 }

 public static void main(String[] args) {
//               0  1  2  3  4  5  6  7  8  9   10  11  12
  int[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

  BusquedaBinaria bb = new BusquedaBinaria();
  int busca = bb.busca(7, datos);
  System.out.println(busca);

 }
}
