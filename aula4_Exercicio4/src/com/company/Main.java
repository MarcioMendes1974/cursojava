package com.company;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Scanner leitor = new Scanner(System.in);
    int num=0,i=0,qtdeNum=0;
    float media,somat=0;

    while (num!=9999){
        System.out.println("digite numero int ");
        num= leitor.nextInt();

        if(num!=9999){
            somat+=num;
            qtdeNum ++;
        }
    }
    media=somat/qtdeNum;
    System.out.println("a soma digitas" +somat +
            "\nmedia" +media);
}
}
