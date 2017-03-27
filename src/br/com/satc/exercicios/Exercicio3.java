/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
    System.out.println("Qual a temperatura(Em graus Celsius)");
       Scanner entrada =new Scanner(System.in);
       double c = entrada.nextDouble ();
       double graus2 = (c * 1.8) - 32 ;
       System.out.println("A temperatura em Fahrenheit é :" +graus2+ ".");   
    }
    
}
