package com.company;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float kminic;
        float kmfim;
        float qtdegas;
        float resultado;

        kminic = Float.parseFloat(showInputDialog("digite km inicial"));
        kmfim=Float.parseFloat(showInputDialog("digite km final"));
        qtdegas= Float.parseFloat(showInputDialog("digite a quantidade de gasolina"));
        resultado = (kmfim-kminic)/qtdegas;
        JOptionPane.showMessageDialog(null,"o consumo foi de "+resultado+" por litro");


    }

}
