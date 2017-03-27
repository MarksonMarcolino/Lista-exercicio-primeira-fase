/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio6 {

   
    public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
         System.out.println("Digite o valor de A");
         int a = entrada.nextInt();
         System.out.println("Digite o valor de B");
         int b = entrada.nextInt();
         if ( a == b){
             int c = (a+b);
             System.out.println("A soma dos valores é igual a :  " +(c));
         } else {
            int c = a*b; 
             System.out.println("A Multiplicação dos valores é :  " +(c));
             
         }
             
         }
    
    
    
    }
    

