/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Visibilidad;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class C extends A {

 @Override
 void acceso(A a) {
  a.metodoFriendly(); // mal
  a.metodoProtected(); // mal
  a.metodoPublic();
 }

 void acceso(C c) {
  c.metodoFriendly(); // mal
  c.metodoProtected();
  c.metodoPublic();
 }
}
