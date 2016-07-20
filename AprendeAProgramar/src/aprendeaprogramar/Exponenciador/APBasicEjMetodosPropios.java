/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Exponenciador;

/**
 * @see ->
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=525:concepto-y-definicion-de-clase-en-java-objetos-del-mundo-real-y-abstractos-ejemplos-y-ejercicio-cu00644b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class APBasicEjMetodosPropios {

 public static void main(String[] args) {
  Exponenciador ex = new Exponenciador();
  int potenciaIterando = ex.getPotenciaIterando(2, 3);
  System.out.println(potenciaIterando);

  int potenciaConRecursion = ex.getPotenciaConRecursion(2, 3);
  System.out.println(potenciaConRecursion);

  ExponenciadorApiJava exaj = new ExponenciadorApiJava();
  int potencia = exaj.potenciaApiJava2(3, 3);
  System.out.println(potencia);
 }
}

class Exponenciador {

 public Exponenciador() {

 }

 public int getPotenciaIterando(int m, int n) {
  int resultado = 1;
  for (int i = 1; i <= n; i++) {
   resultado = resultado * m;
  }
  return resultado;
 }

 public int getPotenciaConRecursion(int m, int n) {
  if (n == 0) {
   return 1;
  } else {
   return m * getPotenciaConRecursion(m, n - 1);
  }
 }
}

class ExponenciadorApiJava {

 public ExponenciadorApiJava() {

 }

 public int potenciaApiJava(int n, int m) {
  double a = Math.pow(m, n);
  return (int) a;
 }

 public int potenciaApiJava2(int base, int indice) {
  return (int) Math.pow(base, indice);
 }
}
