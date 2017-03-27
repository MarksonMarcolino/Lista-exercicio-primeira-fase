
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual o valor de A");
        float a = entrada.nextInt();
        System.out.println("Qual o valor de B");
        float b = entrada.nextInt();
        System.out.println("Qual o valor de C");
        float c = entrada.nextInt();
        if ((a+b)< c) {
            System.out.println("A soma de A + B é menor que "+c);
    }
        else if ((a+b)>c){
            System.out.println("A soma de A + B é maior que "+c);
        }
        else if ((a+b)==c){
            System.out.println("A soma de A + B é igual a "+c);  
        }
    }
    
}
