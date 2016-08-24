/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Visibilidad;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class A {

 private void metodoPrivate() {

 }

 /**
  * De paquete
  */
 void metodoFriendly() {

 }

 protected void metodoProtected() {

 }

 public void metodoPublic() {
 }

 void acceso(A a) {
  a.metodoPrivate();
  a.metodoProtected();
  a.metodoPublic();
  a.metodoFriendly();
 }

}
