package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio3 {

    
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em graus celsius : ");
        Scanner entrada = new Scanner(System.in);
        double C = entrada.nextFloat();
        double F = (C*1.8)+32;
        System.out.println("A temperatura de fahrenheit em fahrenheit é : "+F+".");
    }
    
}
