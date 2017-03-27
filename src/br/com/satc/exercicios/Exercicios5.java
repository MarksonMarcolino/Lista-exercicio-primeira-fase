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
public class Exercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       String nome,sexo,ec;
       int tca;
       System.out.print("Qual o seu nome?");
        nome = ler.nextLine();
       System.out.println("Qual o seu sexo:");
        sexo = ler.next();
       System.out.println("Qual seu estado Civil(Namorando,casado(a),viuvo(a))?");
        ec = ler.next();
        if ((sexo.toUpperCase().equals("F"))&&(ec.toUpperCase().equals("CASADA"))){
         System.out.println("Quantos anos você esta casada?");
          tca = ler.nextInt();
        }
    }
    
}
