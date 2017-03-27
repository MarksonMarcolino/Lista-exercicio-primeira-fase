
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio1 {

    
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        
        System.out.println("Qual é o Raio :");
        double r =  input.nextDouble();
           
        double A;
         A = (r * r) * 3.14 ;
        
       System.out.println("A sua Area é :" + A);
    }
    
}
