
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o o valor do raio:");
        float raio = entrada.nextFloat();
        float area =(float) ((raio*raio)*3.14);
        System.out.println("a area do seu circulo e "+area+"");
        
    }
    
}
