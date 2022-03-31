package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int valor1,valor2,res;
        Scanner leitor= new Scanner(System.in);
        System.out.println("teste");
        System.out.println(" digite o primeiro valor");
        valor1= leitor.nextInt();
        System.out.println("digite o segundo valor");
        valor2= leitor.nextInt();
        res=valor1+valor2;
        System.out.println("a soma dos 2 nuemros " +res);
    }
}
