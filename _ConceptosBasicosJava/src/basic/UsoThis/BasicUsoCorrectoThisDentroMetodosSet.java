/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.UsoThis;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoCorrectoThisDentroMetodosSet {

}

/**
 * CUANDO SE DECLARA 'this' DENTRO DE UN METODO VOID 'set' SIEMPRE REFERENCIARA
 * A LA Variable Referencia OBJETO QUE SE DECLARE DENTRO DEL CONSTRUCTOR
 *
 * @author Portatil
 */
class Ejem {

 private String valor = "22";

 public Ejem() {
  this.valor = null;
 }

 public Ejem(String valor) {
  this.valor = valor;
 }

 public String getValor() {
  return valor;
 }

 public void setValor(String valor) {
  this.valor = valor;
 }

 public void usarThis() {
// this - Se referie al objeto que se instanciara debajo del main().
  System.out.println(this);
 }

 public void usarThisConRefAtributoInstanciaConstructorAsignaValor() {
// Hace referencia al objeto Instanciado
//  this.valor = "Variable local";
  System.out.println("• Este objeto : " + this); //Referencia al objeto instanciado dentro del main 
  System.out.println("• Variable -> valor : " + valor); //El constructor le asigna un valor 
  System.out.println("• Referencia this.valor " + this.valor); //El constructor le asigna un valor 
 }

 public void usarThisConRefAtributoInstancia() {
// Hace referencia al objeto Instanciado
  this.valor = "Variable local";
  System.out.println("• Este objeto : " + this); //Referencia al objeto instanciado dentro del main 
  System.out.println("• Variable -> valor : " + valor); //El constructor le asigna un valor 
  System.out.println("• Referencia this.valor " + this.valor); //El constructor le asigna un valor 
 }

 public Class getClaseActual() {
  Class claseName = this.getClass();
  return claseName;
 }

 public static void main(String[] args) {

  Ejem ej = new Ejem();
  Class claseActual = ej.getClaseActual();
  System.out.println("Cual es la clase actual : " + claseActual);

  System.out.println("------------------------");
  
  System.out.println("• Ejem e = new Ejem();");
// Este 'this' hace referencia al propio objeto
  Ejem e = new Ejem();
  e.usarThis();

  System.out.println("• Ejem e1 = new Ejem();");
  Ejem e1 = new Ejem();
  e1.usarThis();
  e1.usarThisConRefAtributoInstanciaConstructorAsignaValor();

  System.out.println("• new Ejem().usarThis();");
  new Ejem().usarThis();

  System.out.println(" ◘ new Ejem(\"ParametroSinVariableReferencia\").usarThis();");
  new Ejem("ParametroSinVariableReferencia").usarThis();

  System.out.println("• Ejem e2 = new Ejem();");
  Ejem e2 = new Ejem();
  e2.usarThis();
  e2.usarThisConRefAtributoInstanciaConstructorAsignaValor();

  System.out.println("• Ejem e_con_parametros = new Ejem(\"Parametro\");");
  Ejem e_con_parametros = new Ejem("Parametro_Constructor");
  e_con_parametros.usarThis();
  e_con_parametros.usarThisConRefAtributoInstanciaConstructorAsignaValor();

  System.out.println("• Ejem e_con_parametros = new Ejem(\"Parametro\");");
  Ejem e_con_parametros2 = new Ejem("Parametro2_Constructor");
  e_con_parametros2.usarThis();
  e_con_parametros2.usarThisConRefAtributoInstanciaConstructorAsignaValor();

 }
}
