package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double doacao,investimento;
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite a doacao");
        doacao= leitor.nextDouble();
        if(doacao<=1000){
            investimento= doacao*0.05;
        }
        else {
            investimento= doacao*0.15;
        }
        System.out.println("valor = "+investimento);
    }
}
