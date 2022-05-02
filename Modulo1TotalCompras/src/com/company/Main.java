package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double total;
        String desconto;
        double totalCompra;
        total = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de compras "));
        desconto = JOptionPane.showInputDialog("Digite o cupom de desconto");

        if(total > 1000.0 || desconto.equalsIgnoreCase("Desconto20")){
            totalCompra = total - (total * 0.20);

        }else{
            totalCompra = total;
        }
        JOptionPane.showMessageDialog(null," total com desconto " +totalCompra);
    }
}
