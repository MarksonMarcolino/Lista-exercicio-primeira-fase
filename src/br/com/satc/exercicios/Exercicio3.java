
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva a temperatura em graus Celsius:");
        float C = entrada.nextFloat();
        float Fahrenheit = (float) ((C*1.8)+32);
        System.out.println("A temperatura em Celsius é "+Fahrenheit+"");
    }
    }
    

