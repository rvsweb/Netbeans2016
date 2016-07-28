/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList.Ejemplos;

import java.util.ArrayList;
import java.util.Random;

/**
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y
 * 1000 como se le definen al crear un objeto
 *
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApArrayListEjemplos {

 /**
  * Metodo Main
  *
  * @param args
  */
 public static void main(String[] args) {
  SerieDeAleatoriosD sad = new SerieDeAleatoriosD(10);
  sad.generarSerieDeAleatorios();
  int cantidad = sad.getNumeroItems();
  System.out.println("Cantidad de num : " + cantidad);

 }
}

class SerieDeAleatoriosD {

// Campos de clase 
// -> Datos miembros , Miembros de instancia
 private ArrayList<Integer> serieAleatoria;

 /**
  * Constructor para la serie de numeros Aleatorios
  *
  * @param numeroItems - El parametro 'int numeroItems' define el numero de
  * elementos que va a tener la serie aleatoria definiendo en cada posicion del
  * ArrayList el valor '0'
  */
 public SerieDeAleatoriosD(int numeroItems) {
  serieAleatoria = new ArrayList<>();
//  Crea un ArrayList de 10 objetos con valor '0'
  for (int i = 0; i < numeroItems /*10*/; i++) {
   serieAleatoria.add(0); // rellena con '0' cada posicion del 'ARRAY' que no esta rellena de numeros
  } // fin for
  System.out.println("Serie inicializada : El numero de elementos en la serie es : " + getNumeroItems());
 } // fin Constructor

 /**
  * Metodo que devuelve el numero de items ( numero aleatorios ) existentes en
  * la serie
  *
  * @return El numero de items (numero aleatorios) de que consta la serie
  */
 public int getNumeroItems() {
  return serieAleatoria.size();
 }

 /**
  * Metodo SET que genera la serie de numeros Aleatorios para fijar su valor en
  * el atributo serieAleatoria
  */
 public void generarSerieDeAleatorios() {
  Random numAleatorio = new Random();
  for (int i = 0; i < serieAleatoria.size(); i++) {
// Carga Variable de instancia con el numero aleatorio
   serieAleatoria.set(i, numAleatorio.nextInt(1000));
   System.out.println("• Serie generada -> " + serieAleatoria);
  } // fin for
 } // fin metodo

} // fin clase
