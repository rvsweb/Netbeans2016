/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.Static_e_Instancias;

/**
 *
 * @author Portatil
 */
public class T4Pag89EjemploClaseStatic {
}

class Cohete {

 private static int numcohetes = 0;

 public Cohete() {
  numcohetes++;
 }

 public int getcohete() {
  return numcohetes;
 }
}

class TestCohetes {

 public static void main(String[] args) {
  Cohete c1 = new Cohete();
  Cohete c2 = new Cohete();
  Cohete c3 = new Cohete();

  System.out.println("" + c1.getcohete());

 }
}
