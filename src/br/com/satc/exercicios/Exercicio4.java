/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.exercicios;

import java.util.Scanner;


public class Exercicio4 {

    
    public static void main(String[] args) {
    Scanner entrada =new Scanner(System.in);
    System.out.println("Digite o Valor A");
    int a = entrada.nextInt();
    System.out.println("Digite o valor B");
    int b = entrada.nextInt();
    System.out.println("Digite o valor C");
    int c = entrada.nextInt();
    double soma = (a+b);
    if (soma > c){  
    System.out.println("A soma de A e B é maior que C");
    }else{
    System.out.println("A soma de A e B não é maior que C");
 }}}