
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio4 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorA, valorB, valorC;
        System.out.println("Qual é o valor de A?");
        valorA = entrada.nextFloat();
        System.out.println("Qual é o valor de B");
        valorB = entrada.nextFloat();
        System.out.println("Qual é o valor de C?");
        valorC = entrada.nextFloat();
        
        if (valorA+valorB<valorC) 
            System.out.println("A soma de " +valorA +" e " +valorB +" resultam em menos "
            + " que " +valorC);
        else 
            System.out.println("Valores inesperados.");
    }
    
}
