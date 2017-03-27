
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
   Scanner entrada = new Scanner (System.in);
        System.out.println("Qual a Temperatura em Celsius");
        float c = entrada.nextInt();
        System.out.println("A Temperatura em Fahrenheit é "+((c*1.8)+32));    
    }
    
}
