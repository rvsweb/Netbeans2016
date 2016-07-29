/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=671:para-que-sirven-las-interfaces-java-implementar-una-interfaz-del-api-ventajas-y-ejemplos-basicos-cu00697b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class TestInterface {

 public static void main(String[] args) {
  Figura cuad1 = new Cuadrado(3.5f);
  Figura cuad2 = new Cuadrado(2.2f);
  Figura cuad3 = new Cuadrado(8.9f);

  Figura circ1 = new Circulo(3.5f);
  Figura circ2 = new Circulo(4f);

  Figura rect1 = new Rectangulo(2.25f, 2.55f);
//  Se me olvido poner en su clase implements Rectangulo y me pidio que lo enmascarase/casting a Figura
//Interface ref = Interface    Clase Normal
  Figura rect2 = (Figura) new Rectangulo(2.25f, 2.55f);

  List<Figura> serieDeFiguras = new ArrayList<>();
  serieDeFiguras.add(cuad1);
  serieDeFiguras.add(cuad2);
  serieDeFiguras.add(cuad3);
  serieDeFiguras.add(circ1);
  serieDeFiguras.add(circ2);
  serieDeFiguras.add(rect1);
  serieDeFiguras.add(rect2);

  float areaTotal = 0;

  for (Figura tmp : serieDeFiguras) {
   areaTotal = areaTotal + tmp.area();
   System.out.println("" + tmp.toString());
   System.out.println("Tenemos un total de " + serieDeFiguras.size() + " figuras y su area total es de : " + areaTotal + " Uds Cuadradas");
  }

 }
}
