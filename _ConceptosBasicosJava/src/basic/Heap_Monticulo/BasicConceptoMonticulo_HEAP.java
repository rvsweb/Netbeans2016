/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.Heap_Monticulo;

import java.security.InvalidKeyException;
import static javafx.scene.input.KeyCode.T;
import javax.swing.text.Position;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicConceptoMonticulo_HEAP {

 private boolean isEmpty() {
  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }

 class Ejem {

 }

 public static void main(String[] args) {
  System.out.print("\u001B[33m En computación, un montículo (heap en inglés)"
          + " es una estructura de datos del tipo árbol con información "
          + "perteneciente a un conjunto ordenado. Los montículos "
          + "máximos tienen la característica de que cada nodo padre "
          + "tiene un valor mayor que el de cualquiera de sus nodos hijos, "
          + "mientras que en los montículos mínimos, el valor del nodo padre"
          + " es siempre menor al de sus nodos hijos.\n"
          + "Un árbol cumple la condición de montículo si satisface"
          + " dicha condición y además es un árbol binario casi completo. "
          + "Un árbol binario es completo cuando todos los niveles están llenos,"
          + " con la excepción del último, que se llena desde la izquierda "
          + "hacia la derecha.\n"
          + "En un montículo de prioridad, el mayor elemento "
          + "(o el menor, dependiendo de la relación de orden escogida) está"
          + " siempre en el nodo raíz. Por esta razón, los montículos son "
          + "útiles para implementar colas de prioridad. "
          + "Una ventaja que poseen los montículos es que, por ser árboles "
          + "completos, se pueden implementar usando arreglos (arrays), "
          + "lo cual simplifica su codificación y libera al programador del "
          + "uso de punteros.\n"
          + "La eficiencia de las operaciones en los montículos es crucial en"
          + " diversos algoritmos de recorrido");
 }

 /**
 public void insertItem(Object k, Object e) throws InvalidKeyException {
  if (!comp.isComparable(k)) {
   throw new InvalidKeyException("Invalid Key");
   Position z = T.add(new Item(k, e));
   Position u;
   while (!T.isRoot(z)) {
    u = T.parent(z);
    if (comp.isLessThanOrEqualTo(key(u), key(z))) {
     break;
    }
    T.swapElements(u, z);
    z = u;
   }
  }
 }

 public Object removeMin() {
  if (isEmpty()) {
   throw new PriorityQueueEmptyException("Priority Queue Empty");
   Object min = element(T.root());
   if (size() == 1) {
    T.remove();
   } else {
    T.replaceElement(T.root(), T.remove());
    Position r = T.root();
    while (T.isInternal(T.leftChild(r))) {
     Position s;
     if (T.isExternal(T.rightChild(r)) || comp.isLessThanOrEqualTo(key(T.leftChild(r)), key(T.rightChild(r)))) {
      s = T.leftChild(r);
     } else {
      s = T.righChild(r);
     }
     if (comp.isLessThan(key(s), key(r))) {
      T.swapElements(r, s);
      r = s;
     } else {
      break;
     }
    }
   }
  }
 }
  */ 

}
