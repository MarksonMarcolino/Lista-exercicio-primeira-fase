/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("QUAL A TEMPERATURA EM GRAUS CELSIUS: ");
        float c = input.nextFloat();
        System.out.println("A TEMPERATURA EM GRAUS CELSIUS É DE: " + (c + 32 * 1.8) + ".");

    }

}
