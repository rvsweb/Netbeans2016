/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Visibilidad;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class B {

 void acceso(A a) {
//  a.metodoPrivate(); MAL
  a.metodoFriendly();
  a.metodoProtected();
  a.metodoPublic();
 }

}
