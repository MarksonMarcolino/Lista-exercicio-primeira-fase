package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temperatura (em graus Celsius)? ");
        float temp = input.nextFloat();
        System.out.println("A temperatura em graus Fahrenheit é de " + ((temp*1.8)-32));
    }

}
