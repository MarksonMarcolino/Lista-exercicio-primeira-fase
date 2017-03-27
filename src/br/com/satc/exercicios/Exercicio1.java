package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Exercicio1 {
    

    
    public static void main(String[] args) {
        System.out.println("Digite o raio do círculo : ");
        Scanner entrada = new Scanner(System.in);        
        double raio = entrada.nextDouble();
        double area = 3.14 * (raio*raio);
        System.out.println("A area do circulo é :  "+area+".");
        
    }
    
}
