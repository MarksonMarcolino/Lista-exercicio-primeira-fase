
package br.com.satc.exercicios;

import java.util.Scanner;


public class exercicio5 {

    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite a seguir seu nome :");
        String nome = entrada.nextLine();
        System.out.println(" Olá "+nome+" Digite seu sexo (F)feminino ou (M)masculino: ");
        String sexo = entrada.nextLine();
        System.out.println("Digite seu estado civil (C)casada ou (S)solteira ");
        String estado = entrada.nextLine();
         if ((sexo.toUpperCase().equals("F"))&& (estado.toUpperCase().equals("C"))) {
             System.out.println("Digite o tempo de casamento: ");
             String tempo=entrada.nextLine();
             System.out.println("------------PROGRAMA ENCERRADO----------");
         }
        
        
    
            
            
            
        
        
         
         }  
        
         
        
         
         
        
            
    }
    

