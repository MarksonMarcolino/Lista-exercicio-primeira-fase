
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicios4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  ler = new Scanner(System.in);
        int a,b,c,s;
        System.out.println("Digite o valor A:");
         a = ler.nextInt();
        System.out.println("Digite o valor de B:");
         b = ler.nextInt();
        System.out.println("Digite o valor de C:");
         c = ler.nextInt();
        s = a+b;
         if (s<c){
           System.out.println("A soma de A+B é menor que o valor de C!");
         }else if(s>c){
            System.out.println("A soma de A+B é maior que o valor de C!"); 
         } else if (s==c){
            System.out.println("A soma de A+B é igual ao valor de C!");
        }
    }
    
}
