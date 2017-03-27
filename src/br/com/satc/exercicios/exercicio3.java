package br.com.satc.exercicios;

import java.util.Scanner;


public class exercicio3 {

    public static void main(String[] args) {
      
        Scanner e = new Scanner(System.in);
        
         System.out.println("Digite a temperatura em Graus Celsus : ");
        double celsus = e.nextDouble();
        
        double Fahrenheit ;
        
        Fahrenheit = celsus * 1.8 + 32;
                
        System.out.println("A temperatura em graus Fahrenheit é :"+ Fahrenheit);
        
    }
    
}
