/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.For;

/**
 *
 * @author Portatil
 */
public class T3Pag75EjerLetras {

 public static void main(String[] args) {

  Letras l = new Letras('e');
  l.getLetra();
  l.printLetra();
  Letras.convertir_letras('f');
 }
}

class Letras {

 private char letra;

 public Letras(char l) {
  letra = l;
  if (l >= 'a') {
   letra -= 'a';
   letra += 'A';
  }
 }

 public static void convertir_letras(char l) {
  char letra = l;
  if (letra >= 'a') {
   letra = (char) (letra - 'a');
   letra = (char) (letra + 'A');
  }
  System.out.println(letra);
 }

 public char getLetra() {
  return letra;
 }

 public void printLetra() {
  System.out.println(letra);
 }
}
