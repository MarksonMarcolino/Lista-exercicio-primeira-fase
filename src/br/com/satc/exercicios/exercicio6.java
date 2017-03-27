
package br.com.satc.exercicios;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        
         Scanner e = new Scanner(System.in);
          
           System.out.println("Digite o valor de A : ");
           float a = e.nextFloat();
           
            System.out.println("Digite o valor de B : ");
          float b = e.nextFloat();
          
          float c ;
          
          if (a==b){
              
              c = a + b;
              System.out.println("A soma dos valores é :"+ c);
              
          }else{
              
           c = a * b;
              System.out.println("A Multiplicação dos valores é :"+ c);
                 
          }
              
        
    }
    
}
