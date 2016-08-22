/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Pila_STACK;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadePilas_StackPag119 {

 public static void main(String[] args) {
  try {
   String s0 = "01";
   String s1 = "11";
   String s2 = "21";
   String s3 = "31";
   String s4 = "41";
   PilaLista pl = new PilaLista();
   try {

    pl.push(s0);
    pl.push(s1);
    pl.push(s2);
    pl.push(s3);
    pl.push(s4);

   } catch (ExceptionPilaLlena ex) {
    Logger.getLogger(VadePilas_StackPag119.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("♦ Pila llena : " + ex.getMessage());
   }

   System.out.println("• Longitud total : " + pl.longitud());

   System.out.println("• Ver el ultimo objeto sin retirarlo : " + pl.top());

   System.out.println("♦ Elimina el ultimo objeto de la lista " + pl.pop());

   System.out.println("• Ver el ultimo objeto sin retirarlo : " + pl.top());

   System.out.println("• Longitud total : " + pl.longitud());

  } catch (ExceptionPilaVacia ex) {
   Logger.getLogger(VadePilas_StackPag119.class.getName()).log(Level.SEVERE, null, ex);
  }

//  Lista vacia para lanzar la excepcion 
  PilaLista lista_vacia = new PilaLista();
  if (lista_vacia.longitud() == 0) {
   try {
    throw new ExceptionPilaVacia("♦ La pila esta vacia ");
   } catch (ExceptionPilaVacia ex) {
    Logger.getLogger(VadePilas_StackPag119.class.getName()).log(Level.SEVERE, null, ex);
    String message = ex.getMessage();
    System.out.println("♠ Mensaje : " + message);
   }
  }

 }
}

/**
 * Estructura de objetos
 *
 * Listas de objetos que se caracterizan porque los nuevos objetos se añaden al
 * final y tambien salen por el final
 *
 * De esta forma , resulta que el ultimo que entra es el primero que sale ( LIFO
 * ) Last in First Out
 *
 * @author remoto
 * @param <T>
 */
interface Pila<T> {

 /**
  * Mete un objeto T al final de la Pila
  *
  * @param t
  * @throws ExceptionPilaLlena
  */
 void push(T t) throws ExceptionPilaLlena;

 /**
  * Retira el ultimo objeto de la pila
  *
  * @return @throws ExceptionPilaVacia
  */
 T pop() throws ExceptionPilaVacia;

 /**
  * Mira , Sin retirar , el ultimo objeto
  *
  * @return @throws ExceptionPilaVacia
  */
 T top() throws ExceptionPilaVacia;

 /**
  * Longitud de la coleccion de objetos
  *
  * Objetos de la lista
  *
  * @return
  */
 int longitud();

}

/**
 * Implementar las pilas como 'Listas'
 *
 * Pila implementar con una 'Listas'
 *
 * @author remoto
 * @param <T>
 */
class PilaLista<T> implements Pila<T> {

 private List<T> lista = new ArrayList<>(); // Creo una referencia a un objeto de tipo ArrayList para una Interfaces List de Tipo Objeto propio

 /**
  * Mete objetos
  *
  * @param t
  * @throws ExceptionPilaLlena
  */
 @Override
 public void push(T t) throws ExceptionPilaLlena {
  lista.add(t);
 }

 /**
  * Mira , sin Retirar , El ultimo Objeto
  *
  * @return
  * @throws ExceptionPilaVacia
  */
 @Override
 public T top() throws ExceptionPilaVacia {
//  if (lista.size() == 0) {
  if (lista.isEmpty()) {
   throw new ExceptionPilaVacia();
  }
  return lista.get(lista.size() - 1);
 }

 /**
  * Borra / Retira el ultimo objeto de la pila
  *
  * @return
  * @throws ExceptionPilaVacia
  */
 @Override
 public T pop() throws ExceptionPilaVacia {
//  if (lista.size() == 0) {
  if (lista.isEmpty()) {
   throw new ExceptionPilaVacia();
  }
  return lista.remove(lista.size() - 1);
 }

 /**
  * Muestra la longitud
  *
  * @return
  */
 @Override
 public int longitud() {
  return lista.size();
 }

}

class ExceptionPilaLlena extends Exception {

 public ExceptionPilaLlena(String msg) {
  super(msg);
 }
}

class ExceptionPilaVacia extends Exception {

 public ExceptionPilaVacia() {
  System.out.println("• La pila esta vacia ");
 }

 public ExceptionPilaVacia(String msg) {
  super(msg);
 }

}
