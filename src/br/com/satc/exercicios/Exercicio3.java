
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio3 {

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
          System.out.println("Informe a temperatuda em graus Celcius:");
        float grausC = entrada.nextFloat();
        double grausF;
        grausF = ( grausC * 1.8 + 32 );
        System.out.println("A temperatura de graus Celsius para Fahrenheit é " +grausF );
        
    
    
    }
    
}
