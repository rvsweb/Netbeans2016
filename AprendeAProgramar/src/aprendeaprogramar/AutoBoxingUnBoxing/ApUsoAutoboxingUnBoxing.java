/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.AutoBoxingUnBoxing;

import java.util.ArrayList;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoAutoboxingUnBoxing {

}

class ListaEnvoltorio {

 private ArrayList<Integer> lista_envoltorio;

 public ListaEnvoltorio() {
  lista_envoltorio = new ArrayList<>();
 }

 public Integer suma() {
  Integer suma = 0;
  for (Integer num : lista_envoltorio) {
   suma += num;
  }
  return suma;
 }

 public void aniadirItem(Integer item) {
  lista_envoltorio.add(item);
  int tamanio = lista_envoltorio.size();
  System.out.println("Ver tamanio : " + tamanio);
 }

 public static void main(String[] args) {

  ListaEnvoltorio lista1 = new ListaEnvoltorio();
  Integer num1 = new Integer(6);
  lista1.aniadirItem(num1);
  lista1.aniadirItem(7);

  System.out.println("Sumar : " + lista1.suma());
 }

}
