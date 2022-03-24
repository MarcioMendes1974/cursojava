package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Scanner leitor = new Scanner(System.in);
       Float valorvenda,valorfinal;
       String fpgto;
       System.out.println("venda");
       valorvenda= leitor.nextFloat();
        System.out.println("digite a forma");
        fpgto= leitor.next();
        if(fpgto.equalsIgnoreCase( "PIX")) {
            valorfinal= (float) (valorvenda-(valorvenda*0.05));
        }
       else if(fpgto.equalsIgnoreCase(  "debito")){
           valorfinal=valorvenda;
        }
       else if(fpgto.equalsIgnoreCase( "credito"))
        valorfinal=valorvenda;
    }
}

