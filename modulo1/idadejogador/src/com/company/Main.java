package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int idade;
        Scanner leitor=new Scanner(System.in);
        System.out.println("idade");
        idade= leitor.nextInt();
        if(idade>=12){
            System.out.println("vove pode jogar");
        }
        leitor.close();
    }
}
