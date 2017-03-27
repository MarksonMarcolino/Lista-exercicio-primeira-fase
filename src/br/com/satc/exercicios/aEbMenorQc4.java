
package br.com.satc.exercicios;

import java.util.Scanner;

public class aEbMenorQc4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite o valor [A]: ");
         float VA= entrada.nextFloat();
            System.out.println("Diite o valor [B]: ");
            float VB= entrada.nextFloat();
                System.out.println("Digite o valor [C]: ");
                float VC= entrada.nextFloat();
                float AB= VA+VB;
                
                if (AB<VC) {
                    System.out.println("A soma dos valor é menor que C \n"
                            + "A+B="+AB+ "\n"
                            +"C="+VC);
                } else if (AB>VC) {
                    System.out.println("Valor inesperado.");
                } else 
                    System.out.println("Valor inesperado.");
                }             
         }
    

