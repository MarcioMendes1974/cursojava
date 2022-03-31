package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int num1,num2,resp=0;
        int i=1;
        System.out.println("digite o 1 numero :");
        num1= leitor.nextInt();
        System.out.println("digite o 2 numero :");
        num2= leitor.nextInt();

        do{
            resp+=num2;
            i++;
        }while (i<=num1);
        System.out.println("multiplicação "+resp);
    }
}
