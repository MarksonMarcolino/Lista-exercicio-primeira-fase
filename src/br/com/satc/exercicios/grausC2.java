
package br.com.satc.exercicios;

import java.util.Scanner;

public class grausC2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
         System.out.println("Transforme Fahrenheit em Celsius");
         System.out.println("Qual a temperaura em ºF? ");
          float fah= entrada.nextFloat() ; 
           System.out.println("Sua temperatura em ºC é: "+(fah-32)/1.8);
            
        
       
    }
    
}
