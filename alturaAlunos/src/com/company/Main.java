package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double altura=0,media,somaAlturas=0;
        Scanner leitor = new Scanner(System.in);
        int quantidadeAlunos=0;
        while(altura!=-1){
            System.out.println("digite a altura");
            altura= leitor.nextDouble();
            if(altura!=-1){
                somaAlturas+=altura;
                quantidadeAlunos++;

            }
        }
        media = somaAlturas/quantidadeAlunos;
        System.out.println("alturas = "+media);
        leitor.close();
    }
    }



