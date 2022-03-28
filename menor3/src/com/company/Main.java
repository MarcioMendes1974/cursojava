package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int a,b,c;
        String mensagem;
        System.out.println("digite 1");
        a=leitor.nextInt();
        System.out.println("digite 2");
        b=leitor.nextInt();
        System.out.println("digite 3");
        c=leitor.nextInt();
        if (!(a==b || a==c)){
            if(a<b && a<c){
                mensagem="o numero e o "+a;
            }
            else if (b<a && b<c){
                mensagem="o numero e o "+b;
            }

        }else{
            mensagem = "acabou";
        }
        leitor.close();
    }
}
