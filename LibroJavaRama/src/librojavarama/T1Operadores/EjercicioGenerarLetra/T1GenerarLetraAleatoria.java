/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores.EjercicioGenerarLetra;

/**
 *
 * @author Portatil
 */
public class T1GenerarLetraAleatoria {

    public static char z;

    public static char getLetras() {
        return (char) (Math.random() * 26 + 'a');
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(" "+getLetras());
        }
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.println((char) (Math.random() * 26 + 'a'));
        }
        System.out.println("");

        while (z != 'a') {
            z = (char) (Math.random() * 26 + 'a');
            System.out.print(" "+z);
        }
        System.out.println("");

    }
}
