
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a temperatura em graus Fahrenheit:");
        float F = entrada.nextFloat();
        float Celsius = (float) ((F-32)/1.8);
        System.out.println("A temperatura em Celsius é "+Celsius+"");
    }
    
}
