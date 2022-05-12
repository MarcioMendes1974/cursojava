package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double  somaAltura=0.0, media;
        int qtdeAlunos = 0;
        double alturaAluno =0.0;
        int i =1;
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aluno "));
        while (i <= qtdeAlunos){
            alturaAluno = Double.parseDouble(JOptionPane.showInputDialog("digite a altura do "+i+" aluno "));
            somaAltura = somaAltura +
                    alturaAluno;
            i = i+1;
        }
        media = somaAltura / qtdeAlunos;
        JOptionPane.showMessageDialog(null,"A altura media dos alunos é "+media);
    }
}
