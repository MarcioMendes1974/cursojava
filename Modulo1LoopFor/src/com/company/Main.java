package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int qtdAlunos, qtdAlunosp=0, qtdAlunosi=0;
        double notaAlumos, mediaAlunosPares, mediaAlunosImpares;
         Scanner leitor = new Scanner(System.in);
    //*    System.out.println("Para calcular a media das notas dos alunos é preciso saber primeiramente," +
    //*            "quantos alunos tem na turma");
    //*    qtdAlunos = leitor.nextInt();
        qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("para calcular a media da nota dos alunos desta classe" +
                "é preciso peimeitamente saber a quantidade  de alunos"));
        mediaAlunosPares = 0;
        mediaAlunosImpares = 0;
                for(int i=0;i<qtdAlunos;i++) {
                    //*               System.out.println("digite a nota do "+(i+1)+"º Aluno");
                    //*               notaAlumos = leitor.nextDouble();
                    notaAlumos = Double.parseDouble(JOptionPane.showInputDialog("digite a nota do " + (i + 1) + " º aluno"));
                    if ((i + 1) % 2 == 0) {
                        mediaAlunosPares = mediaAlunosPares + notaAlumos;
                        qtdAlunosp++;
                    } else {
                        mediaAlunosImpares = mediaAlunosImpares + notaAlumos;
                        qtdAlunosi++;
                    }
                }
                mediaAlunosPares = mediaAlunosPares / qtdAlunosp;
                mediaAlunosImpares = mediaAlunosImpares / qtdAlunosi;
     //   System.out.println("media da nota dos alunos alunos é  "+mediaAlunos);
        JOptionPane.showMessageDialog(null,"A media das notas dos alunos pares é " +
                ""+mediaAlunosPares);
        JOptionPane.showMessageDialog(null,"A media das notas dos alunos pares é " +
                ""+mediaAlunosImpares);
        leitor.close();
    }
}
