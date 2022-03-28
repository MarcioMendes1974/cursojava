package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int num;
        System.out.println("digite um numero");
        num = leitor.nextInt();
        switch (num){
            case 1:
                extenso='um';
                break;
            case 2:
                extenso='dois';
                break;
            case 3:
                extenso='tresum';
                break;
            default:
                "numero invalido";
        }
    }
}
