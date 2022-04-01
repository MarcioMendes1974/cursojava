package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int valor1,valor2,res1,valor3,res2;
        Scanner leitor=new Scanner(System.in);
        System.out.println(" Digite km inicio viagem ");
        valor1=leitor.nextInt();
        System.out.println(" Digite km Final viagem ");
        valor2=leitor.nextInt();
        res1=valor2-valor1;
        System.out.println(" total de km rodados "+res1);
        System.out.println(" Digite qtde litros por KM ");
        valor3=leitor.nextInt();
        res2=res1/valor3;
        System.out.println(" media de km por litros "+res2);
    }
}

