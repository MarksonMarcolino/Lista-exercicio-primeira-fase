
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio3 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus Celsius : ");
        float temperatura = entrada.nextFloat();
        float conversao =(float) ((temperatura*1.8)+32);
        System.out.println("A temperatura em Fahrenheit é de "+conversao+".");
     }
    
}
