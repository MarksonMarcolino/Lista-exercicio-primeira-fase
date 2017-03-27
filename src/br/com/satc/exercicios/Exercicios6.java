
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       double a,b,c;
       System.out.println("Digite o valor A:");
       a=ler.nextDouble();
       System.out.println("Digite o valor B:");
       b=ler.nextDouble();
        if (a==b){
            c=a+b;
            System.out.println("A soma dos valores A e B é "+c+".");
        }else{
            c=a*b;
            System.out.print("A multiplicação dos valor A e B é "+c+".");
        }
    }
    
}
