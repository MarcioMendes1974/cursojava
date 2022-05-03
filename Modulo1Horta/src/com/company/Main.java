package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double umidade;
        double temperatura;

        umidade = Double.parseDouble(JOptionPane.showInputDialog(" Digite a umidade do AR \n"));
        temperatura= Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura \n"));
        if (umidade >70.00 ^ temperatura > 26.00){
            JOptionPane.showMessageDialog(null," Ligar os Ventiladores ");
        }else{
            JOptionPane.showMessageDialog(null," Acione os agronomoss ");
        }
    }
}
