package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] alunos = new double[5];
        double total=0,media;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i<=4; i++) {
            System.out.println("Por favor, digite o consumo do " + (i + 1) + "º aluno");
            alunos[i] = leitor.nextDouble();
            total = total + alunos[i];
        }
            for (int i = 0; i <=4; i++) {
                System.out.println("O aluno " + (i + 1) + " consumiu R$" + alunos[i]);
            }
            media=total/5;

            System.out.println("O total de consumo foi de R$" + total);
            System.out.println("media igual " +media);

            leitor.close();



        }
}
