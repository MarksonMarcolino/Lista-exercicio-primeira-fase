
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatuda em graus Fahrenheit:");
        float grausF = entrada.nextFloat();
        double grausC;
        grausC = (grausF - 32)* 1.8;
        System.out.println("A temperatura de graus Fahrenheit para Celsius é de" +grausC);
        
    
    }
    
    
}
