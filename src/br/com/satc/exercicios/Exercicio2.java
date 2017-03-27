package br.com.satc.exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o grau em Fahrenheit:  ");
        double OF = entrada.nextDouble();
        double OC;
        OC = (OF - 32) / 1.8;
        System.out.println("O grau em Celsius é " + format.format(OC));

    }
}
