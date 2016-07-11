/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks.ClaseInteger;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xEjIntegerGenerarNumAleatorios {

 public int nextInt() {
  return 14;
 }

 public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

//  Extract the IntegerCache through reflection
  Class<?> clazz = Class.forName("java.lang.Integer$IntegerCache");
  Field field = clazz.getDeclaredField("cache");
  field.setAccessible(true);
  Integer[] cache = (Integer[]) field.get(clazz);

//  Rewrite the Integer cache
  for (int i = 0; i < cache.length; i++) {
   cache[i] = new Integer(new Random().nextInt(cache.length));
  }
// Mostrar numeros aleatorios
  for (int i = 0; i < 20; i++) {
   System.out.println((Integer) i);
  }
 }
}
