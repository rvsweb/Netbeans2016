/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T1Operadores;

/**
 *
 * @author Portatil
 */
public class T1BasicOperadoresUnitarios {

    public static void main(String[] args) {
        int a = 97;
        System.out.println(~a);
        int aa = -97;
        System.out.println(~aa);
        
        int b = 99;
        System.out.println(-b);
        System.out.println(--b);
        System.out.println(++b);
        System.out.println(b);
        
        int r2 = 2;
        int r3 = 3;
        int resultados = r2 *= r3;
        System.out.println(resultados);
        resultados = resultados /= r3;
        System.out.println(resultados);
        resultados = resultados %= r3;
        System.out.println("aqui "+resultados);
        resultados = resultados %= r3;
        System.out.println("aqui "+resultados);
        
        
        System.out.println("Operadores de Bits");
        /**
        +---+---+---+---+---+---+---+---+
        | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 | ← Posición del bit
        +---+---+---+---+---+---+---+---+
        |128|64 |32 |16 | 8 | 4 | 2 | 1 | ← Valor del bit de acuerdo a su posición
        +---+---+---+---+---+---+---+---+
          ↖ Bit más significativo     ↖ Bit menos significativo
        **/
        int num = 5;
        num = num << 0; // Hace referencia a la posicion de los valores en bits
        System.out.println(" 0 = "+num);
        num = num << 1; // Hace referencia a la posicion de los valores en bits
        System.out.println(num);
        num = num << 2; // Hace referencia a la posicion de los valores en bits
        System.out.println(num);
        num = num << 3; // Hace referencia a la posicion de los valores en bits
        System.out.println(num);
        num = num >> 2;
        System.out.println(num);
        
        
        
        
        
        
        
    }
}
