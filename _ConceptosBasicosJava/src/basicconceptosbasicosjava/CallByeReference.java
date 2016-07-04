/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicconceptosbasicosjava;

/**
 * @title..:
 * @todo...:
 * @example:
 * @date...:
 * @author TED
 */
public class CallByeReference {

 public static void main(String[] args) {

// Object are passed by references
  Test1 ob = new Test1(15, 20);

  System.out.println("ob.a and ob. b before call : " + ob.a + " " + ob.b);
 }
}

class Test1 {

 int a, b;

 Test1(int i, int j) {
  this.a = i;
  this.b = j;
 }

// Object are passed by references
 void meth(Test1 o) {
  o.a *= 2;
  b /= 2;
 }
}
