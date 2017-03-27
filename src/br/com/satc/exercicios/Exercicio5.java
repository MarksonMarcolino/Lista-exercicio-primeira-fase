/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio5 {

  
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner entrada =new Scanner(System.in);
        String nome =entrada.next();
        System.out.println("Digite seu sexo(F=Feminino ou M=Masculino)");
        char sexo =entrada.next().charAt(0) ;
        System.out.println("Digite seu estado civil");
        String estadocivil =entrada.next();
        switch(sexo){
        case 'F' :  {
        if (estadocivil.toUpperCase().equals("CASADA")){
            System.out.println("Quantos anos é casada");
            String tempocasada = entrada.next();
            
        }}
    }
        
    }
        
        
        
        
    }
    

