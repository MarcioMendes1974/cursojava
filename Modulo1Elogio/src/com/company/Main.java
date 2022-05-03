package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int tipoElogio;

        do {

            tipoElogio = Integer.parseInt(JOptionPane.showInputDialog(" digite um tipo de elogio \n1-elogio prfissional\n2-elogio fisico" +
                    "\n3-elogio pessoal"));
            switch (tipoElogio) {
                case 1:
                    JOptionPane.showMessageDialog(null, "vc é um proffisonal dedicado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "vc é uma peesoa muito forte");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "vc é uma peesoa muito legal");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcao invalida");
                    break;
            }
        }while (tipoElogio < 30);
    }
}
