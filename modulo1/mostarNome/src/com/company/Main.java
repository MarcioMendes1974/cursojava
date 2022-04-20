package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ler = new Scanner(System.in);
        String nome;
        System.out.println("digite o nome :");
        nome= ler.nextLine();
        System.out.println("o nome digitado foi: "+nome);
        ler.close();

    }
}
