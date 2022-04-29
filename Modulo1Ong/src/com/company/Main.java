package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int idade;
    //    System.out.println("Por favor Digite sua idade : ");
    //    idade = leitor.nextInt();
    //    if(idade <18){
    //        System.out.println("Jogo proibido para menor de 18 anos");
    //    }else{
    //        System.out.println("Jogo liberado para a idade : "+idade+" Anos");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Casa de Jogos..Digite sua idade"));
        if(idade < 18){
            JOptionPane.showMessageDialog(null,"Jogo proibido para menores de 18 anos");
        }else{
            JOptionPane.showMessageDialog(null,"jogo permitido para sua idade "+idade+" Anos");
        }
        }
     //  leitor.close();
    }

