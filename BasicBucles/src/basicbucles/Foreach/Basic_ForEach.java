/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbucles.Foreach;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TED
 */
public class Basic_ForEach {

 public static void main(String[] args) {

  List<String> lenguaje = Arrays.asList("Java", "Python", "Ruby", "C#");

  for (int i = 0; i < lenguaje.size(); i++) {
   String cadena = lenguaje.get(i);
   System.out.println(" lenguaje " + cadena);
  }

 }

}
