package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double altura1, altura2, altura3, altura4, altura5, altura6, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do 1º aluno");
        altura1 = leitor.nextDouble();
        System.out.println("Digite a altura do 2º aluno");
        altura2 = leitor.nextDouble();
        System.out.println("Digite a altura do 3º aluno");
        altura3 = leitor.nextDouble();
        System.out.println("Digite a altura do 4º aluno");
        altura4 = leitor.nextDouble();
        System.out.println("Digite a altura do 5º aluno");
        altura5 = leitor.nextDouble();
        System.out.println("Digite a altura do 6º aluno");
        altura6 = leitor.nextDouble();
        media = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6)/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();

    }
}
