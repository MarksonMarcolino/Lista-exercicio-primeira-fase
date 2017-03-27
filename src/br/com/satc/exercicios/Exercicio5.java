package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Oziel Silveira Junior
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("QUAL O SEU NOME: ");
        String nome = input.next();
        System.out.println("QUAL O SEU GENERO(F para FEMININO ou M para MASCULINO: ");
        char genero = input.next().charAt(0);
        System.out.println("QUAL O SEU ESTADO CIVIL(CASADO(A),SOLTEIRO(A),DIVORCIADO(A): ");
        String ecivil = input.next();
        switch (genero) {
            case 'F':
                if (ecivil.toUpperCase().equals("CASADA")) {
                    System.out.println("A quantos anos você é casada: ");
                    String Casada = input.next();
                }

        }

    }

}
