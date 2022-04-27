package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nome;
        Scanner leitor = new Scanner(System.in);
        System.out.println("por favor digite seu nome");
        nome = leitor.next();

        System.out.println("o nome digitado foi "+ nome);
        leitor.close();
    }
}
