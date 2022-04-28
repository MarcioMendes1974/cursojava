package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int valor1 ;
        int valor2;
        double resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.println("este programa vai somar subitrair  multiplicar e dividir");
        System.out.println("digite o primeiro valo para somar");
        valor1 = leitor.nextInt();
        System.out.println("digite o segundo valor para somar");
        valor2 = leitor.nextInt();
        resultado = valor1 + valor2;
        System.out.println(" o resultado da soma é : "+resultado);
        resultado = valor1 - valor2;
        System.out.println(" o resultado da subtração é : "+resultado);
        resultado = valor1 * valor2;
        System.out.println(" o resultado da multiplicacao é : "+resultado);
        resultado = valor1 / valor2;
        System.out.println(" o resultado da divisao é : "+resultado);
        leitor.close();


    }
}
