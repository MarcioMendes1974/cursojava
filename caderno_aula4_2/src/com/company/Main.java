package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor=new Scanner(System.in);
        int numero=1,maior=-9999,menor=9999,i=1;
        float somat=0;
        float med;

         while(i<=4){
            System.out.println("digite o "+ i + "numero");
            numero=leitor.nextInt();
            if(numero<menor){
                menor=numero;
            }
            if(numero>maior){
                maior=numero;
            }
            somat+=numero;
            i++;
        }
         med=somat/i;
         System.out.println("maior nuemro " + maior);
         System.out.println("menor numero" + menor);
         System.out.println("media" + med);


    }
}
