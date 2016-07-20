/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoClasesObjetos;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class APBasicClasesObjetos {

 public static void main(String[] args) {
  Taxi t = new Taxi("1111", "D13", 1);
  Persona p = new Persona("32");
  TaxiCond tc1 = new TaxiCond(t, p);
  tc1.getDatosTaxiCond();
 }
}

class Taxi {

 private String ciudad;
 private String matricula;
 private String distrito;
 private int tipoMotor;

 public Taxi() {
  this.ciudad = null;
  this.matricula = null;
  this.distrito = null;
  this.tipoMotor = 0;
 }

 public Taxi(String valorMatricula, String valorDistrito, int valorTipoMotor) {
  this.ciudad = "Mexico D.F";
  this.matricula = valorMatricula;
  this.distrito = valorDistrito;
  this.tipoMotor = valorTipoMotor;
 }

 public void setMatricula(String valorMatricula) {
  matricula = valorMatricula;
 }

 public void setDistrito(String valorDistrito) {
  distrito = "Distrito " + valorDistrito;
 }

 public void setTipoMotor(int valorTipoMotor) {
  tipoMotor = valorTipoMotor;
 }

 public String getMatricula() {
  return matricula;
 }

 public String getDistrito() {
  return distrito;
 }

 public int getTipoMotor() {
  return tipoMotor;
 }

}

class Persona {

 private String nombre;
 private int edad;

 public Persona() {
  nombre = "";
  this.edad = 0;
 }

 public Persona(String nombre) {
  this.nombre = nombre;
  this.edad = 0;
 }

 public String getNombre() {
  return nombre;
 }

}

class TaxiCond {

 private Taxi vehiculoTaxi;
 private Persona conductorTaxi;
 private String st;

 public TaxiCond() {
  vehiculoTaxi = new Taxi();
  conductorTaxi = new Persona();
 }

 public TaxiCond(Taxi vehiculoTaxi, Persona conductorTaxi) {
  this.vehiculoTaxi = vehiculoTaxi;
  this.conductorTaxi = conductorTaxi;
 }

 public TaxiCond(Taxi objetoTaxi, Persona objetoPersona, String mensaje) {
  conductorTaxi = new Persona(objetoPersona.getNombre());
  vehiculoTaxi = new Taxi(objetoTaxi.getMatricula(), objetoTaxi.getDistrito(), objetoTaxi.getTipoMotor());
  this.st = mensaje;
  System.out.println("Este es el mensaje : " + mensaje);
 }

 public void setMatricula(String valorMatricula) {
  vehiculoTaxi.getMatricula();
 }

 public String getDatosTaxiCond() {
  String matricula = vehiculoTaxi.getMatricula();
  String distrito = vehiculoTaxi.getDistrito();
  int tipoMotor = vehiculoTaxi.getTipoMotor();
  String cadenaTipoMotor = "";

  if (tipoMotor == 0) {
   cadenaTipoMotor = "$Desconocido";
  } else if (tipoMotor == 1) {
   cadenaTipoMotor = "$Gasolina";
  } else if (tipoMotor == 2) {
   cadenaTipoMotor = "$Diesel";
  } else if (tipoMotor > 2) {
   cadenaTipoMotor = "$No se ha seleccionado correctamente mediante if ";
  }

  switch (tipoMotor) {
   case 0:
    cadenaTipoMotor = "!Desconocido";
    break;
   case 1:
    cadenaTipoMotor = "!Gasolina";
    break;
   case 2:
    cadenaTipoMotor = "!Diesel";
    break;
   default:
    System.out.println("!No se selecciono correctamente mediante switch ");
    break;
  }

  String datosTaxiCond = "!El objeto TaxiCond presenta estos datos. Matricula : " + matricula + "! Distrito " + distrito + " !Tipo de motor: " + cadenaTipoMotor;

  System.out.println(datosTaxiCond);
  return datosTaxiCond;
 }
}
