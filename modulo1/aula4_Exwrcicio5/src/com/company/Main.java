package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int qtdeSal,i=1;
        float salario,maiorSal=0,menorSal=9999999;
        float mediaSal,somaSal=0;
        System.out.println("digite a qtde de func ");
        qtdeSal= leitor.nextInt();

        while (i<=qtdeSal){
            System.out.println("digite o sala ");
            salario= leitor.nextFloat();
            if(salario<menorSal){
                menorSal=salario;
            }
            if(salario>maiorSal){
                maiorSal=salario;
            }
            somaSal+=salario;
            i++;

        }
        mediaSal=somaSal/qtdeSal;
        System.out.println("menor salario " +menorSal);
        System.out.println("maior salario " +maiorSal);
        System.out.println("media " +mediaSal);
        leitor.close();












    }
}
