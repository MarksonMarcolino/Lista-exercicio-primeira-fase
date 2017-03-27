package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String Nome = input.next();
        System.out.println("Qual sexo você é: ");
        String decisao = input.next();
        System.out.println("Qual seu estado civil.Casado ou solteiro: ");
        String decisao2 = input.next();
        if (decisao.toUpperCase().equals("F") && (decisao2.toUpperCase().equals("CASADO"))) {
            System.out.println("À quanto tempo é casado(a)?");

        }

    }

}
