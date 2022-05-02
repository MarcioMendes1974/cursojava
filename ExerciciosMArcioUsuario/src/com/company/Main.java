package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String usuario;
        String senha;
        usuario = JOptionPane.showInputDialog("Digite o Usurio : ");
        senha = JOptionPane.showInputDialog("Digite a senha : ");

        if(usuario.equalsIgnoreCase("marcio") && senha.equalsIgnoreCase("100774") ){
            JOptionPane.showMessageDialog(null,"acesso liberado ");
        }else{
            JOptionPane.showMessageDialog(null,"Usuario ou senha invalida");
        }
    }
}
