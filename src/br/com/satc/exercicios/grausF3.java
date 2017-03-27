
package br.com.satc.exercicios;

import java.util.Scanner;


public class grausF3 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.println("Transforme a temperatura em ºFahrenheit");
            System.out.println("Digite o valor em ºC:");
             float Celsius= entrada.nextFloat();
              System.out.println("Sua temperatura em ºF é: "+((Celsius*1.8)+32));
        
    }
    
}
