/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.UsoThis;

/**
 * El 1º metodo con this puede referencia y ejecutar al 2º metodo pero el 2º
 * metodo no puede referenciar al 1º porque produce un fallo en la pila es una
 * falsa recursividad
 *
 * @author Raul Vela Salas
 */
public class T4Pag116UsoThisDentroDemMetodosBasicos {

 public void valor(String a) {
  this.valor2(" ♠ metodo valor2() ", "metodo valor2() ");
  System.out.println(a);
 }

 public void valor2(String a, String b) {
  this.valor3(" ♂ metodo valor3() ", "metodo valor3() ", "metodo valor3() ");
  System.out.println(a + b);
 }

 public void valor3(String a, String b, String c) {
  System.out.println(a + b + c);
 }

 public static void main(String[] args) {

  T4Pag116UsoThisDentroDemMetodosBasicos t4 = new T4Pag116UsoThisDentroDemMetodosBasicos();
  t4.valor(" • Soy el metodo 1 ");
  t4.valor2(" ♣  Soy el metodo 2 ", "Soy el metodo 2 ");
 }
}
