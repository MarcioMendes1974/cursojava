package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao onibos para o ponto de votação...Digite sua idade"));
        if(idade<16){
            JOptionPane.showMessageDialog(null," Embarque nao permitido, idade nao permitida para votar "
            +idade+" Anos");
        }else{
            if(idade<18){
                JOptionPane.showMessageDialog(null," Embarque permitido, porem nao obrigatorio para idade "
                +idade+" Anos");
            }else{
                JOptionPane.showMessageDialog(null,"Embarque permitido, idade obrigatoria para votacao "
                +idade+" Anos");
            }
        }
    }
}
