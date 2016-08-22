/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Herencia2;

import java.util.ArrayList;
import java.util.List;

/**
 * @see - 126 pag
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeHerenciaConObjetosPag126 {

}

/**
 * Ejemplos de cola de tamanio limitado
 *
 * Se Redefinen los metodos por razones de funcionalidad ( se cambia el
 * funcionamiento )
 *
 * @author remoto
 */
class Cola {

// Creamos una lista de objetos 
 private List<String> datos = new ArrayList<String>();

 /**
  * Constructor : Inicializa a 0
  */
 public Cola() {
  datos = new ArrayList<>();
 }

 /**
  * Aniade objetos sin limites a la Cola
  *
  * @param s
  */
 public void mete(String s) {
  datos.add(s);
 }

 /**
  * Elimina objetos de la Cola
  *
  * @return
  */
 public String saca() {
  return datos.remove(0);
 }

 /**
  * Indica el tamanio
  *
  * @return
  */
 public int size() {
  return datos.size();
 }

}

/**
 * Hereda de la Superclase Cola
 *
 * @author remoto
 */
class ColaMax1 extends Cola {

 private final int max;

 /**
  * Pone un maximo de objetos para la Cola
  *
  * @param max
  */
 public ColaMax1(int max) {
  this.max = max;
 }

 /**
  * Aniade si no hemos llegado al limite
  *
  * @param s
  */
 @Override
 public void mete(String s) {
  if (size() < max) { // tamanio no ha llegado al maximo 
   super.mete(s); // invoca el metodo Superclase para aniader otro objeto
  }
 }
}

class ColaMax2 extends Cola {

 private final int max;

 /**
  *
  * @param max
  */
 public ColaMax2(int max) {
  this.max = max;
 }

 /**
  * SobreEscribimos el metodo 'mete' de la SuperClase
  *
  * Saca el 1º si se va a superar el 'Limite'
  *
  * @param s
  */
 @Override
 public void mete(String s) {
  if (size() >= max) {
   super.saca();
   super.mete(s);
  }
 }

}

class Main {

 public static void main(String[] args) {

  String s1 = "1a";
  String s2 = "2a";
  String s3 = "3a";
  String s4 = "4a";
  Cola c = new Cola();
  c.mete(s1);
  c.mete(s2);
  c.mete(s3);
  c.mete(s4);
  System.out.println("• Cantidad de objetos : " + c.size());
  System.out.println("• Sacar un objeto : " + c.saca());
  System.out.println("• Longitud de objetos : " + c.size());
  System.out.println("• Sacar un objeto : " + c.saca());
  System.out.println("• Longitud de objetos : " + c.size());

  for (int i = 0; i < c.size(); i++) {
   System.out.println("Saca todos los elementos : " + c.saca());
  }

  System.out.println("• Longitud de objetos : " + c.size());

  String s1s = "1a1";
  String s2s = "2a2";
  String s3s = "3a3";
  String s4s = "4a4";
  String s5s = "5a5";
  String s5s1 = "5a51";
  String s5s2 = "5a52";

  System.out.println(" --- ColaMax1 --- ");
  ColaMax1 cm1 = new ColaMax1(5);
  System.out.println("♦ Longitud : " + cm1.size());

  cm1.mete(s1s);
  cm1.mete(s2s);
  cm1.mete(s3s);
  cm1.mete(s4s);
  cm1.mete(s5s);

  int tamanio = cm1.size();
  System.out.println("Tamanio ColaMax1 : " + tamanio);

  cm1.mete(s5s1);
  cm1.mete(s5s2);

  int tamanio1 = cm1.size();
  System.out.println("Tamanio ColaMax1 : " + tamanio1 + " : No se supera el limite establecido de 5 ");

  System.out.println(" --- ColaMax2 --- ");
  String s1c = "1aa1";
  String s2c = "2aa2";
  String s3c = "3aa3";

  ColaMax2 cm2 = new ColaMax2(3);
  cm2.mete(s1c);
  cm2.mete(s2c);
  cm2.mete(s3c);
  System.out.println("Tamanio : " + cm2.size());
 }
}


















