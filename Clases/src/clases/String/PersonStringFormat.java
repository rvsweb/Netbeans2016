/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.String;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class PersonStringFormat {

 static String name;

 public PersonStringFormat(String personName) {
  name = personName;
 }

 public String greet(String yourName) {
  return String.format("Hi %s, my name is %s", name, yourName);
 }

 public static void main(String[] args) {

  PersonStringFormat p = new PersonStringFormat("Pepe");
  p.greet("Juan");

 }
}
