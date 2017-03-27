
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual a Temperatura em Fahrenheit");
        float F = entrada.nextInt();
        System.out.println("A Temperatura em Celsius é "+ (F -32)/1.8);
    }
    
}
