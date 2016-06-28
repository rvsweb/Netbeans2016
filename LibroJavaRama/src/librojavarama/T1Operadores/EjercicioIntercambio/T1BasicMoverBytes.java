/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores.EjercicioIntercambio;

/**
 *
 * @author Portatil
 */
public class T1BasicMoverBytes {

    public static void main(String[] args) {

//+-----+-----+-----+-----+-----+
//| 16  |  8  |  4  |  2  |  1  | ←  Valor del bit de acuerdo a su posición
//+-----+-----+-----+-----+-----+     expresado en números
//| 2^4 | 2^3 | 2^2 | 2^1 | 2^0 | ←  Valor del bit de acuerdo a su posición
//+-----+-----+-----+-----+-----+     expresado en forma de potencias de 2
//Hexadecimal 0x100
//en Decimal 256
//en Binary 100000000
        int i = 0x100;
        System.out.println(i);
        i >>>= 1;
        System.out.println(i);

    }
}
