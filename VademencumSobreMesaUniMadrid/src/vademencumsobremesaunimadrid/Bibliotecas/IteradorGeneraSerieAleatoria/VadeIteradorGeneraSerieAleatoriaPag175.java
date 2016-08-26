/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.IteradorGeneraSerieAleatoria;

import java.util.Iterator;
import java.util.Random;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeIteradorGeneraSerieAleatoriaPag175 {

 public static void main(String[] args) {
  SerieAleatoria s = new SerieAleatoria();
  while (s.hasNext()) {
   Integer next_num = s.next();
   System.out.println("-> " + next_num);
   if (next_num > 200) {
    System.out.println("-> " + next_num);
    return;
   }
  }
 }
}

class SerieAleatoria implements Iterator<Integer> {

 private final Random random;

 public SerieAleatoria() {
  random = new Random();
 }

 @Override
 public boolean hasNext() {
  return true;
 }

 @Override
 public Integer next() {
  return (int) random.nextInt() / 10000000;
 }

 @Override
 public void remove() {
  throw new UnsupportedOperationException();
 }
}
