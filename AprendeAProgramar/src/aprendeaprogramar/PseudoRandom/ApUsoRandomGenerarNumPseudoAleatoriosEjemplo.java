/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.PseudoRandom;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=638:generar-numeros-aleatorios-en-java-clase-random-y-metodo-nextint-ejercicio-ejemplo-resuelto-cu00672b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoRandomGenerarNumPseudoAleatoriosEjemplo {

}

/**
 * Objeto de esta clase se usa para generar una secuencia (stream) de numero
 * pseudoAleatorios a partir de una SEMILLA 'valor inicial'
 *
 * @author Portatil
 */
class EjemploClaseRandom {

}

class EntradaDeTeclado {

// variable de instancia (campo) del metodo
 private String entradaTeclado;

 /**
  *
  */
 public EntradaDeTeclado() {
  entradaTeclado = "";
 }

 /**
  *
  */
 public void pedirEntrada() {
  Scanner entradaScanner = new Scanner(System.in);
  entradaTeclado = entradaScanner.next();
 }

 /**
  *
  * @return
  */
 public String getEntrada() {
  return entradaTeclado;
 }

}

class SerieDeAleatorios {

 private ArrayList<Integer> serieAleatoria;

 /**
  *
  * @param numeroItems
  */
 public SerieDeAleatorios(int numeroItems) {
  serieAleatoria = new ArrayList<Integer>();
  for (int i = 0; i < numeroItems; i++) {
   serieAleatoria.add(0);
  }
  System.out.println("Serie inicializada . El numero de elementos en la serie es : " + getNumeroItems());
 }

 /**
  *
  * @return
  */
 public int getNumeroItems() {
  return serieAleatoria.size();
 }

 /**
  *
  */
 public void generarSerieDeAleatorios() {
  Random numAleatorio = new Random();
  for (int i = 0; i < serieAleatoria.size(); i++) {
//   A cada indice le aniado un nuevo num aleatorio
   serieAleatoria.set(i, numAleatorio.nextInt(100));
  }
  System.out.print(" • Serie generada ");
 }

 /**
  *
  */
 public void mostrarSerie() {
  System.out.println("Procedemos a mostrar la serie : ");
  for (Integer tmpObjeto : serieAleatoria) {
   System.out.println(" " + tmpObjeto.toString());
  }
 }
}

class TestPseudoAleatorio {

 public static void main(String[] args) {
  Integer tmpInteger = 0;

  EntradaDeTeclado entradaMain = new EntradaDeTeclado();

  char tecla = 'S';
  while (tecla == 'S') {
   System.out.print("Por Favor Introduce el numero de elementos en la serie de numero aleatorios ");
   entradaMain.pedirEntrada();
   tmpInteger = tmpInteger.valueOf(entradaMain.getEntrada());

   SerieDeAleatorios serieDePrueba = new SerieDeAleatorios((int) tmpInteger);
   serieDePrueba.generarSerieDeAleatorios();
   serieDePrueba.mostrarSerie();
   tecla = '\u0000';
   System.out.println("\n ? Generar otra serie (S/N): ");
   while (tecla != 'n' && tecla != 'N' && tecla != 's' && tecla != 'S') {
    entradaMain.pedirEntrada();
    if (entradaMain.getEntrada().equals("n") || entradaMain.getEntrada().endsWith("N")) {
     tecla = 'N';
    } else if (entradaMain.getEntrada().equals("s") || entradaMain.getEntrada().equals("S")) {
     tecla = 'S';
    } // cierre else if
   } // cierre while interior 
  } // cierre while exterior

 }
}
