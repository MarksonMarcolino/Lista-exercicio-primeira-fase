
package br.com.satc.exercicios;

import java.util.Scanner;


public class exercicio4 {

    
    public static void main(String[] args) {
        
          Scanner a = new Scanner(System.in);
          
           System.out.println("Digite o valor de A : ");
           float A = a.nextInt();
           
            System.out.println("Digite o valor de B : ");
          float B = a.nextInt();
           
            System.out.println("Digite o valor de C : ");
           float C = a.nextInt();
           
           float soma = A + B ;
           
           if( soma > C){
               
               System.out.println("A soma é maior que o terceiro valor ");
               
           }else{
             System.out.println("A soma é menor que o terceiro valor ");  
           }
       
        
    }
    
}
