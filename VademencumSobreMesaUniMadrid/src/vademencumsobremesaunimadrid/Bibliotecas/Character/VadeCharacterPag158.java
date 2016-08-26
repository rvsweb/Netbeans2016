/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Character;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeCharacterPag158 {

 public static void main(String[] args) {
  char c = '1';
  boolean digit = Character.isDigit(c);
  System.out.println("isDigit : " + digit);
  boolean letter = Character.isLetter(c);
  System.out.println("isLetter : " + letter);
  boolean digit1 = Character.isLetterOrDigit(c);
  System.out.println("isLetterOrDigit : " + digit1);
  boolean lowerCase = Character.isLowerCase(c);
  System.out.println("isLowerCase : " + lowerCase);
  boolean upperCase = Character.isUpperCase(c);
  System.out.println("upperCase : " + upperCase);
  boolean whitespace = Character.isWhitespace(c);
  System.out.println("isWhitespace : " + whitespace);
  char toLowerCase = Character.toLowerCase(c);
  System.out.println("toLowerCase : " + toLowerCase);
  char toUpperCase = Character.toUpperCase(c);
  System.out.println("toUpperCase : " + toUpperCase);
 }
}
