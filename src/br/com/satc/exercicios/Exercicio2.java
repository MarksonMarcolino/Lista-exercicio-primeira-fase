
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temperatura (em Fahrenheit)? ");
        float temp = input.nextFloat();
        System.out.println("A temperatura em graus Celsius é de "+ (temp-32)/1.8);
        
    
   }
}
