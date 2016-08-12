/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Composicion;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeComposicionConceptoPag36 {

}

/**
 * Cuando usar Composicion :
 *
 * Cuando se necesita la funcionalidad de otra clase dentro de esta pero no su
 * interfaz ' por eso la otra clase aparece como "private" '
 *
 * @author Portatil
 */
class A {

}

class B {

// Se dice que se usa el principio de composicion cuando para construir
// una nueva clase empleamos otras clases ya definidas 
// Se dice que B usa la clase A 
 private A a = new A();

}
