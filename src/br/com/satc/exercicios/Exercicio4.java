
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        float A = entrada.nextFloat();
        System.out.println("Informe o valor de B:");
        float B = entrada.nextFloat();
        System.out.println("Informe o valor de C:");
        float C = entrada.nextFloat();
        
        float soma = (A+B);
        if (soma>C)
            System.out.println("Soma de A+B = "+soma+" é menor que C");
        else 
            System.out.println("Soma de A+B é menor que C="+C+"");
        
        
    
    
    
    }
    
}
