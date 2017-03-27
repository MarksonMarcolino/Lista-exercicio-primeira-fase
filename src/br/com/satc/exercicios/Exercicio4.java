package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        float A = input.nextFloat();
        System.out.println("Digite o valor de B: ");
        float B = input.nextFloat();
        System.out.println("Digite o valor de C: ");
        float C = input.nextFloat();
        if ((A+B) < C) {
            System.out.println((A+B)+ " que é a soma de A e B é menor que " + C);
            
        }if ((A+B)> C) {
            System.out.println((A+B + " que é a soma de A e B é maior que "+ C));
            
            
        }
            
            
            
            }
}
        
            
    

