package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        float dollar;
        float valor;
        float resultado;
        System.out.println("Digite o valor da moeda : /");
        dollar = leitor.nextFloat();
        System.out.println("Digite o valor da doacao : ");
        valor = leitor.nextFloat();
        resultado = valor * dollar;
        System.out.println("o valor da doação é : "+resultado);


    }
}
