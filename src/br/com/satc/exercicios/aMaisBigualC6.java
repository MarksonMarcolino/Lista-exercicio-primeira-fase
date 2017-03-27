
package br.com.satc.exercicios;

import java.util.Scanner;


public class aMaisBigualC6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
         System.out.println("Insira o primeiro valor: ");
          float valor1=  entrada.nextFloat();
           System.out.println("Insira o segundo valor: ");
            float valor2= entrada.nextFloat();
             if (valor1==valor2) {
                 System.out.println("O terceiro valor ficará:" +(valor1+valor2) );
             }else 
                 System.out.println("O terceiro valor ficará:" +(valor1-valor2) );
    }
    
}
