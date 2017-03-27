package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número A : ");
        int A = entrada.nextInt();
        System.out.println("Digite o número B : ");
        int B = entrada.nextInt();
        if ( A==B ){
            int C = (A+B);
            System.out.println("A soma do dois números é : "+C+".");
        }else{
            int C = (A/B);
            System.out.println("A divisão entre os dois número é "
                    +C+ ".");
        
        }
        
    }
    
}
