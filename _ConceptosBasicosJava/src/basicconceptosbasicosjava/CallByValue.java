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
public class CallByValue {

 public static void main(String[] args) {

  Test ob = new Test();
  int a = 15, b = 20;

  System.out.println("a and b before call : " + a + " " + b);

  ob.meth(a, b);

  System.out.println("a and b after call : " + a + " " + b);
 }
}

class Test {

 void meth(int i, int j) {
  i *= 2;
  j /= 2;
 }
}


