
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio1 {

   
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a medida do raio do círculo:");
        float raio = entrada.nextFloat();
        double area;
        area = (raio * raio) * 3.14 ;  
        System.out.println("A medida da área do círculo é de:" +area);
        
    }
    
}
