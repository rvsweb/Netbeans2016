/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ClaseScanner;

import java.util.Scanner;

/**
 * @see ->
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=627:pensar-en-objetos-una-entrada-de-teclado-o-consola-en-java-como-objeto-con-campos-y-metodos-cu00661b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version Pensar en objetos. Una entrada de teclado o consola en Java como
 * objeto con campos y métodos.
 * @author Raul Vela Salas
 */
public class APEntradaDeTeclado {

 private String entradaTeclado; // Variable de instancia (campo) de la clase

 public APEntradaDeTeclado() { // Constructor
  entradaTeclado = "";
  pedirEntrada(); // Esto es una llamada a un metodo interno , Al crear un objeto ejecutamos el metodo 
 }

 public void pedirEntrada() { // Metodo de la clase 
  Scanner entradaEscaner = new Scanner(System.in);
  entradaTeclado = entradaEscaner.nextLine();
 }

 public String getEntrada() {
  return entradaTeclado;
 }

 public String getPrimeraPalabra() {
  for (int i = 0; i < entradaTeclado.length(); i++) {
   if (entradaTeclado.substring(i, i + 1).equals(" ")) {
    return entradaTeclado.substring(0, i + 1);
   }
  }
  return entradaTeclado;
 }

 public int getLongitud() {
  return entradaTeclado.length();
 }

 public static void main(String[] args) {

  System.out.println("Empezamos el programa ");
  System.out.println("Por favor introduzca la entrada 1");
  APEntradaDeTeclado entrada1 = new APEntradaDeTeclado();
  System.out.println("Por favor introduzca la entrada 2");
  APEntradaDeTeclado entrada2 = new APEntradaDeTeclado();
  System.out.println("Por favor introduzca la entrada 3");
  APEntradaDeTeclado entrada3 = new APEntradaDeTeclado();
  System.out.println("Gracias");
  System.out.println("La entrada 1 ha sido " + entrada1.getEntrada() + " y consta de " + entrada1.getLongitud() + " caracteres");
  System.out.println("La entrada 2 ha sido " + entrada2.getEntrada() + " y consta de " + entrada2.getLongitud() + " caracteres");
  System.out.println("La entrada 3 ha sido " + entrada3.getEntrada() + " y consta de " + entrada3.getLongitud() + " caracteres");

 }
}
