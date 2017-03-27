
package br.com.satc.exercicios;

import java.util.Scanner;


public class exercicio2 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus Fahrenheit: ");
        float temperatura = entrada.nextFloat();
        float conversao =(float) ((temperatura-32)/1.8);
        System.out.println("A temperatura em celsius é de "+conversao+".");
        
        
       
    }
    
}
