/*
Faça um algoritmo que leia dois valores inteiros A e B se 
os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B. 
Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C 
e mostrar seu conteúdo na tela. 
*/
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Maurício
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor inteiro A: ");
        int a = entrada.nextInt();
        System.out.print("Valor inteiro B: ");
        int b = entrada.nextInt();
        if (a==b) {
            int c = a+b;
            System.out.println("A soma de A mais B é: "+c);
        } else {
            int c = a*b;
            System.out.println("A multiplicação de A mais B é: "+c);
        }
        
    }
    
}
