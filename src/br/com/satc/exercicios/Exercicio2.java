package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio2 {

    
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em graus fahrenheit : ");
        Scanner entrada = new Scanner(System.in);
        double F = entrada.nextFloat();
        double C = (F-32)/1.8;
        System.out.println("A temperatura de fahrenheit em celsius é : "+C+".");

    }
    
}
