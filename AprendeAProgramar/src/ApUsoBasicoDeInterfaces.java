
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoBasicoDeInterfaces {

 public static void main(String[] args) {

//Interface          Clase Normal (Subclase)
  Figura cuad1 = new Cuadrado(3.5f);
  Figura cuad2 = new Cuadrado(2.2f);
  Figura cuad3 = new Cuadrado(8.9f);

  Figura circ1 = new Circulo(3.5f);
  Figura circ2 = new Circulo(4f);
  Figura circ3 = new Circulo(5f);

  Figura rect1 = new Rectangulo(2.25f, 2.55f);
  Figura rect2 = new Rectangulo(12f, 3f);
  Figura rect3 = new Rectangulo(24f, 6f);

  List<Figura> serieDeFiguras = new ArrayList<Figura>();
  serieDeFiguras.add(cuad1);
  serieDeFiguras.add(cuad2);
  serieDeFiguras.add(cuad3);

  serieDeFiguras.add(circ1);
  serieDeFiguras.add(circ2);
  serieDeFiguras.add(circ3);

  serieDeFiguras.add(rect1);
  serieDeFiguras.add(rect2);
  serieDeFiguras.add(rect3);

  float areaTotal = 0;

  System.out.println("Tenemos un total de :  " + serieDeFiguras.size());

  for (Figura tmp : serieDeFiguras) {
   areaTotal = areaTotal + tmp.area();
   System.out.println("Las figuras " + tmp.getClass().getName() + " tiene un area total de " + areaTotal + " uds cuadradas");
  }

 }
}

interface Figura {

 float PI = 3.14159265f; // Por defecto public static final 
 public static final float PI2 = 3.14159265f; // Por defecto abstract public

 float area();

 public abstract float area2();

}

class Cuadrado implements Figura {

 private float lado;

 public Cuadrado(float lado) {
  this.lado = lado;
 }

 @Override
 public float area() {
  return lado * lado;
 }

 @Override
 public float area2() {
  return lado * lado;
 }

}

class Circulo implements Figura {

 private float diametro;

 public Circulo(float diametro) {
  this.diametro = diametro;
 }

 @Override
 public float area2() {
  return (PI * diametro * diametro / 4f);
 }

 @Override
 public float area() {
  return (PI * diametro * diametro / 4f);
 }
}

class Rectangulo implements Figura {

 private float lado;
 private float altura;

 public Rectangulo(float lado, float altura) {
  this.lado = lado;
  this.altura = altura;
 }

 @Override
 public float area() {
  return lado * altura;
 }

 @Override
 public float area2() {
  return lado * altura;
 }

}
