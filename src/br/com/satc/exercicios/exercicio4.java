
package br.com.satc.exercicios;

import java.util.Scanner;


public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite o valor A");
        float valora = entrada.nextFloat();
         System.out.println("Digite o valor B");
        float valorb = entrada.nextFloat();
         System.out.println("Digite o valor C");
        float valorc = entrada.nextFloat();
        float ab= valora+valorb;
         if (ab<valorc) {
             System.out.println("A soma do valor A com o valor B é menor que o valor C");
         }else{
             System.out.println("A soma do valor A com o valor B não é menor que o valor C");
         }
    }
    
}
