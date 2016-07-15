/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Objetos;

import java.util.Scanner;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class APUsoDeConstructorObjetos {

 public static void main(String[] args) {
  System.out.println("Empezamos el programa");
  System.out.println("Por favor introduzca la entrada 1 ");
  EntradaDeTeclado entrada1 = new EntradaDeTeclado();
  System.out.println("Por favor introduzca la entrada 2 ");
  EntradaDeTeclado entrada2 = new EntradaDeTeclado();
  System.out.println("Por favor introduzca la entrada 3 ");
  EntradaDeTeclado entrada3 = new EntradaDeTeclado();
  System.out.println("Gracias");

 }
}

// Definimos una clase EntradaDeTeclado 0
class EntradaDeTeclado {

// Variable de instancia (campo) de la clase para almacenar valor
 private String entradaTeclado;

// Constructor
 public EntradaDeTeclado() {
  entradaTeclado = "";
//  al instanciar un objeto ejecutamos el metodo 
  pedirEntrada(); // llamada a un metodo interno
 }

 public void pedirEntrada() {
  Scanner entradaEscanner = new Scanner(System.in);
  entradaTeclado = entradaEscanner.nextLine();
 }

 public String getEntrada() {
  return entradaTeclado;
 }

 public String getPrimeraEntrada() {
  return entradaTeclado;
 }

 public String getPrimeraPalabra() {
  for (int i = 0; i < entradaTeclado.length() - 1; i++) {
   if (entradaTeclado.substring(i, i + 1).equals("")) {
    return entradaTeclado.substring(0, i + 1);
   }
  }
  return entradaTeclado;
 }

 public int getLongitud() {
  return entradaTeclado.length();
 }
}
