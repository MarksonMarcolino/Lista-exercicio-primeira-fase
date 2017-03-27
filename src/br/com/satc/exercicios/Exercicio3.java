package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o grau em Celsius:  ");
        double OC = entrada.nextDouble();
        double OF;
        OF = OC * 1.8 + 32;
        System.out.println("O grau em Fahrenheit é " + format.format(OF));

    }

}
