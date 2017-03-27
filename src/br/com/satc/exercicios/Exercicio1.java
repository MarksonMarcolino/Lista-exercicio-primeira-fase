
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Exercicio1 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float raio;
        System.out.println("Qual é o raio do círculo?");
        raio = entrada.nextFloat();
        float area = (float) ((raio*raio)*3.14);
        System.out.println("A área desse círculo é: " +area);
        
    }
    
}
