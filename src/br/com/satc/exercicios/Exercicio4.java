package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor A : ");
        double A = entrada.nextDouble();
        System.out.println("Digite um valor B : ");
        double B = entrada.nextDouble();
        System.out.println("Digite um valor C :");
        double C = entrada.nextDouble();
        double soma = (A+B);
        if (soma > C) { 
            System.out.println("A soma de A mais B não é menor "
                    + "do que o valor C.");       
        }else{
            System.out.println("O valor da soma de A mais B é menor "
                    + "do que o valor C.");
        
        }
        
        
    }
    
}
