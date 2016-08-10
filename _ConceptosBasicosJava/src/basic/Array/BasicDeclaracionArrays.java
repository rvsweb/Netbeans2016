/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.Array;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicDeclaracionArrays {

 public static void main(String[] args) {
  int[] test0 = new int[]{};
  for (int i = 0; i < test0.length; i++) {
   System.out.print(test0[i]);
  }

  System.out.println("- Declaracion basica - Array -   int[] test = new int[]{1, 2, 3};\n");
  int[] test1 = new int[]{1, 2, 3};
  for (int i = 0; i < test1.length; i++) {
   System.out.print(test1[i]);
  }

  System.out.println("\n - Declaracion basica - int[][] test2 = new int[][]{{}}; \n");

  int[][] test2 = new int[][]{{}};
  for (int i = 0; i < test2.length; i++) {
   System.out.print(test2[i]);
  }

  System.out.println("\n - Declaracion basica - int[][] test3 = new int[][]{{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};\n");

  int[][] test3 = new int[][]{{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};
  for (int i = 0; i < test3.length; i++) {
   for (int j = 0; j < test3[i].length; j++) {
    System.out.println(" - " + test3[i][j]);
   }
  }

  System.out.println("\n- int[][] test4 = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};");

  int[][] test4 = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};
  for (int i = 0; i < test4.length; i++) {
   System.out.println("");
   for (int j = 0; j < test4[i].length; j++) {
    System.out.println(" - " + test4[i][j]);
   }
  }

  System.out.println("");
 }

}
