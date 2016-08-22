/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Inlining;

/**
 * @see - https://es.wikipedia.org/wiki/Funci%C3%B3n_inline
 * http://stackoverflow.com/questions/7772864/would-java-inline-methods-during-optimization
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeMetodoInlining {

 public static void main(String[] args) {
  String texto = MetodoInlining.texto(5);
  System.out.println(texto);
 }
}

/**
 * Wikipedia : Funciones que al compilar , no son llamadas en el codigo objeto ,
 * sino insertadas en las seccion del codigo donde se las llame
 *
 * Operacion Inversa de la extraccion de variables es la eliminacion de
 * variables ( inlining )
 *
 * Consiste en reemplazar el uso de una variable por una expresion en ella
 * cargada
 *
 * En el ejemplo anterior : Refactoring Pag 128 - linea 147 -> Consiste en
 * ejecutar los pasos en orden inverso
 *
 *
 *
 * @author remoto
 */
class MetodoInlining {

//• Sustitucion de condiciones anidadas por guardadas
// A veces se acumulan varias condiciones anidando unas tras otras 
// Aunque correcto , el codigo puede llegar a ser ininteligible
 /**
  * Condiciones anidadas
  *
  * @param nota
  * @return
  */
 public static String texto(double nota) {
  String txt;
  if (nota > 9.99) {
   txt = "Matricula de Honor";
  } else if (nota > 8.99) {
   txt = "SobreSaliente";
  } else if (nota > 6.99) {
   txt = "Notable";
  } else if (nota > 4.99) {
   txt = "Aprobado";
  } else {
   txt = "Suspenso";
  }
  return txt;
 }

 /**
  * Condiciones guardadas
  *
  * @param nota
  * @return
  */
 public static String texto1(double nota) {
  if (nota > 9.99) {
   return "Matricula de Honor";
  }
  if (nota > 8.99) {
   return "SobreSaliente";
  }
  if (nota > 6.99) {
   return "Notable";
  }
  if (nota > 4.99) {
   return "Aprobado";
  }
  return "Suspenso";
 }

}
