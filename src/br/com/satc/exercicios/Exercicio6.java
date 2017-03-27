
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorA, valorB;
        System.out.println("Qual é o valor de A?");
        valorA = entrada.nextFloat();
        System.out.println("Qual é o valor de B");
        valorB = entrada.nextFloat();
        
        if (valorA==valorB) {
            System.out.println("O valor de C será" +(valorA+valorB)); } else
            System.out.println("O valor de C será" +(valorA*valorB));
    }
}
                  
            
            
            
      
    

