/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.Polimorfismo;

/**
 *
 * Este ejemplo es una basura
 *
 * @author Portatil
 */
public class T5Pag125EjemploPolimorfismoLibroRama {

 public static void main(String[] args) {

 }
}

/*Clase Base*/
class Persona {

 private String nombre;
 protected int sueldoBase;

 public void setNombre(String nom) {
  nombre = nom;
 }

 public String getNombre() {
  return nombre;
 }

 public void setSueldoBase(int i) {
  sueldoBase = i;
 }

}

class EmpleadoA extends Persona { // Especializacion

 protected int sueldoBase;
 protected String puesto;

 public int getSueldo() {
  return sueldoBase;
 }

 @Override
 public void setSueldoBase(int s) {
  sueldoBase = s;
 }

 public void setPuesto(String jefe_almacen) {
  this.puesto = jefe_almacen;
 }

 public String getPuesto() {
  return this.puesto;
 }

}

class Encargado extends EmpleadoA { // Especializacion

 @Override
 public int getSueldo() {
  Double d = sueldoBase * 1.1;
  return d.intValue();
 }
}

class Test {

 public static void main(String[] args) {
  /*padre*/
  Persona p1 = new EmpleadoA()/*hija*/;
  p1.setNombre("Pepe");
  p1.setSueldoBase(100);

  EmpleadoA e1;
  e1 = new Encargado();

  String nom = p1.getNombre();
  System.out.println("Nombre - " + nom);

  e1.setSueldoBase(500);
  System.out.println("Sueldo total - " + e1.getSueldo());
  e1.setPuesto("Jefe almacen");
  System.out.println("Puesto - " + e1.getPuesto());
 }
}
