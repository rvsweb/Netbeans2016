/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.Multi_Clave;

import java.util.HashMap;
import java.util.Map;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class Vade_Map_Multi_Clave {

 /**
  * Mapas utilizan 1 solo objeto como CLAVE
  *
  * Cuando se quieren usar varios objetos como clave , necesario crear un objeto
  * que contenga diferentes elementos de la 'clave'
  *
  * CUIDADO : de redefinir los metodos equals() , hashCode() para obtener los
  * resultados deseados
  *
  * @param args
  */
}

/**
 * Queremos guardar 'Objetos' asociados a 2 claves
 *
 * Coordenadas X-Y en un plano, NO PODEMOS USAR UN ARRAY Bidimensional bien
 * porque las coordenadas no estan acotadas( el array seria demasiado grande )
 *
 * Bien porque la tabla es poco densa ( la mayor parte de las posiciones estan
 * vacias y el array estaria desperdiciado con celdas 'null' )
 *
 * @author remoto
 */
class Punto {

 private final int x, y;

 public Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public int getX() {
  return x;
 }

 public int getY() {
  return y;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) {
   return true;
  }
  if (o == null) {
   return false;
  }
//  Si no es objeto entra y devuelve false
  if (!(o instanceof Punto)) {
   return false;
  }
  Punto punto = (Punto) o;
  return x == punto.x && y == punto.y;
 }

 @Override
 public int hashCode() {
  return 31 * x + y;
 }
}

/**
 * • Tabla MultiClave
 *
 * Configurado el metodo 'equals'
 *
 * Ahora podemos usar estas 'Claves' para 'Acceder' al Mapa
 *
 * @author remoto
 */
class SparseTable {

// Interface - Map apunta a la clase HashMap 
 private final Map<Punto, Object> map = new HashMap<>();

 /**
  * Asocia los 'valores' a la 'llave'
  *
  * @param x
  * @param y
  * @param o
  */
 public void put(int x, int y, Object o) {
  map.put(new Punto(x, y), o);
 }

 /**
  * Obtener los 'valores' de cada llave
  *
  * El metodo es generalizable a cualquier conjunto de datos que queremos usar
  * como "clave de acceso" , sin mas que envolverlo en la clave combinada
  * correspondiente
  *
  * @param x
  * @param y
  * @return
  */
 public Object get(int x, int y) {
  return map.get(new Punto(x, y));
 }

 public static void main(String[] args) {

  Punto p1 = new Punto(1, 2);
  Punto p2 = new Punto(2, 3);
  Punto p3 = new Punto(1, 2);

  boolean equivale = p1.equals(p3);
  System.out.println("• Valor : " + equivale);
  boolean equivale1 = p1.equals(p2);
  System.out.println("• Valor : " + equivale1);

  SparseTable spt = new SparseTable();

  spt.put(p1.getX(), p1.getY(), p1);
  spt.put(p2.getX(), p2.getY(), p2);
  spt.put(p3.getX(), p3.getY(), p3);

  for (Punto indice : spt.map.keySet()) {
   System.out.println("• " + indice.getX() + "\n• " + indice.getY());
   System.out.println("-------------------");
  }

  spt.map.put(p1, "1");
  spt.map.put(p2, "2");
  spt.map.put(p3, "3");

  Object ver1 = spt.map.get(p1);
  System.out.println("♦ " + ver1);
  Object ver2 = spt.map.get(p2);
  System.out.println("♦ " + ver2);
  Object ver3 = spt.map.get(p3);
  System.out.println("♦ " + ver3);

  System.out.println("tamaño : " + spt.map.size());

  SparseTable spt1 = new SparseTable();

  Punto p4 = new Punto(1, 2);
  Punto p5 = new Punto(3, 4);

  spt1.put(1, 1, p1);
  spt1.put(1, 2, p2);
  spt1.put(2, 2, p3);
  spt1.put(3, 3, p4);
  spt1.put(4, 4, p5);

 }
}
