
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a area do circulo.");
        float raio = entrada.nextFloat();
        System.out.println("A area é: "+(raio*raio)*3.14);
        
        
    }
    
}
