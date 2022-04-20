package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor= new Scanner(System.in);
        int idade;
        System.out.println(" digite a idade");
        idade=leitor.nextInt();
        if(idade<16){
            System.out.println("VC NAO PODE VOTAR");
        }
        else if (idade <18) {
            System.out.println("VC NAO E OBRIGADO VOTAR");
        }
        else{
            System.out.println("KD VC ALEX KD VC ALEX obrigatorio VOTAR");
        }

    }
}
