/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio {

   
    public static void main(String[] args) {
       System.out.println("Qual a temperatura(Em graus Fahrenheit)");
       Scanner entrada =new Scanner(System.in);
       double f = entrada.nextDouble ();
       double c = (f - 32) / 1.8;
       System.out.println("A temperatura em Graus é :" +c+ ".");
      
       
       
       
    }
    
}
