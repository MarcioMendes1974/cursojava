package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String usuario;
        usuario = JOptionPane.showInputDialog(" digite seu usuario ");
        if(!usuario.equalsIgnoreCase("ADMIn")){
            JOptionPane.showMessageDialog(null,"Atenção, usuário sem poderes administrativos");
        }else{
            JOptionPane.showMessageDialog(null,"acesso liberado");

        }


    }
}
