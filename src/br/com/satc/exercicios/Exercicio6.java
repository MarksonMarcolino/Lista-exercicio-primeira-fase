
package br.com.satc.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     System.out.println("Qual o Numero em A");
     int a = entrada.nextInt();
     System.out.println("Qual o Numero em B");
     int b = entrada.nextInt();
      if (a==b) {
          int c;
          c=a+b;
          System.out.println("o calculo deu "+c);
      }
      else if (a!=b){
      int c;
      c=a*b;
      System.out.println("o calculo deu "+c);
    }
    }
}
