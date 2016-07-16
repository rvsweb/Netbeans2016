/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniCatalunia.ClasesObjetos;

/**
 * @see -> http://people.ac.upc.edu/cruellas/past/Clases-y-objetos.pdf
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEUniCataluniaClasesObjetosConstructores {

 public static void main(String[] args) {
  Coordinate c = new Coordinate(1, 1, 5);
  Coordinate c0 = new Coordinate();

 }
}

class Coordinate {

 protected int row, col;
 public static int valor;

 /**
  *
  */
 public Coordinate() {
  this.row = 1;
  this.col = 1;
 }

 /**
  *
  * @param r
  * @param c
  */
 public Coordinate(int r, int c) {
  if (r < 1 || r > 8 || c < 1 || c > 8) {
   throw new IllegalArgumentException("Valores por encima de los deseados ");
  }
  this.row = r;
  this.col = c;
 }

 /**
  *
  * @param r
  * @param c
  */
 public Coordinate(int r, int c, int valor) {
  if (r < 1 || r > 8 || c < 1 || c > 8) {
   throw new IllegalArgumentException("Valores por encima de los deseados ");
  }
  this.row = r;
  this.col = c;
  this.valor = valor;
 }

 /**
  *
  * @return
  */
 public int getRow() {
  return this.row;
 }

 /**
  *
  * @return
  */
 public int getCol() {
  return this.col;
 }

 /**
  *
  * @param col
  */
 public void setCol(int col) {
  if (col < 1 || col > 8) {
   throw new IllegalArgumentException("Column Error");
  }
  this.col = col;
 }

 /**
  *
  * @param row
  */
 public void setRow(int row) {
  if (row < 1 || row > 8) {
   throw new IllegalArgumentException("Row Error");
  }
  this.row = row;
 }

 /**
  *
  * @param r
  * @param c
  */
 public void set(int r, int c) {
  if (r < 1 || r > 8 || c < 1 || c > 8) {
   throw new IllegalArgumentException("Row Error");
  }
  this.row = r;
  this.col = c;
 }

}
