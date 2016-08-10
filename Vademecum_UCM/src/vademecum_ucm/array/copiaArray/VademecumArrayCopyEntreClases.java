/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.array.copiaArray;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumArrayCopyEntreClases {

 public static void main(String[] args) {

  A a1 = new A(1, 1);
  A a2 = new A(2, 2);
  A a3 = new A(3, 3);
  A a4 = new A(4, 4);
  A a5 = new A(5, 5);
  A a6 = new A(6, 6);
  A a7 = new A(7, 7);
  A a8 = new A(8, 8);
  A a9 = new A(9, 9);
  A a10 = new A(10, 10);

  A[] a_v = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};
  B[] b_v = new B[10];

  for (A i : a_v) {
   System.out.println(i);
  }

  B b = new B();
  b.copiador(b_v, 0, a_v, 0, 10);

  System.out.println("---------------------------");
  for (B i2 : b_v) {
   System.out.println(i2);
  }

 }
}

class A {

 private int a;
 private int b;

 A() {
  this.a = 0;
  this.b = 0;
 }

 A(int a, int b) {
  this.a = a;
  this.b = b;
 }

 @Override
 public String toString() {
  return a + " - " + b;
 }

}

class B extends A {

 public void copiador(B[] origen, int p1, A[] destino, int p2, int n) {
  A[] temporal = new A[n];
  for (int k = 0; k < n; k++) {
   temporal[k] = origen[p1 + k];
  }
  for (int k = 0; k < n; k++) {
   destino[p2 + k] = temporal[k];
  }
 }

}
