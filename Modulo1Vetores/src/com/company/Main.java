package com.company;

import java.util.Scanner;

public class Main {

    public static final int qtdeAlunos = 10;
    public static void main(String[] args) {
	// write your code here

    double[] alunos = new double[qtdeAlunos];
    double total = 0;
        Scanner leitor = new Scanner(System.in);
    for (int i=0;i<alunos.length;i++){
            System.out.println("digite o consumo do " +(i+1)+ " ºAluno");
            alunos[i] = leitor.nextDouble();
            total = total + alunos[i];
        }
        for(int i =0;i<alunos.length;i++){
            System.out.println(" o consumo do "+(i+1)+" º aluno e "+alunos[i]);
        }
        System.out.println(" o total do consumo foi de "+total);
        leitor.close();
    }
}
