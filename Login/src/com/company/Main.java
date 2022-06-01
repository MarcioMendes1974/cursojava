package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static boolean validarLogin(String username, String password){
       if(username.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("1234")){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        String usuario , senha;
    //  System.out.println("Digite o usuario");
    //  usuario=leitor.next();
        usuario = JOptionPane.showInputDialog("Digite o nome do Usuario");
    //    System.out.println("Digite a senha");
    //    senha=leitor.next();
        senha = JOptionPane.showInputDialog("Digite a Senha ");

        if(validarLogin(usuario,senha)){
    //        System.out.println("acesso liberado para o usuario: "+usuario);
           JOptionPane.showMessageDialog(null,"Acesso Liberado para o Usuario "+usuario);

        }else{
    //        System.out.println("vc digitou usuario ou senha invalidos");
            JOptionPane.showMessageDialog(null,"Você digitou Usuario ou Senha invalidos");
        }
    }
}
