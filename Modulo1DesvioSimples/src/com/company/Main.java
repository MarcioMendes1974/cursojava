package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    Scanner leitor = new Scanner(System.in);
        double doacao,investiemnto,usoimediato;
     //   System.out.println("digite o valor da doaçao");
     //   doacao = leitor.nextDouble();
     //   investiemnto = doacao * 0.05;
     //   usoimediato = doacao - investiemnto ;
     //   System.out.println("o valor da doação é eede R$ : "+doacao+", o valor de investiemnto será de : "+investiemnto+
      //          " e o o valor para uso imediato será de : "+usoimediato);
        doacao =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da doacao "));
        if(doacao<1000){
          investiemnto = doacao * 0.05;
        }else {
            investiemnto = doacao * 0.15;
        }
         usoimediato = doacao - investiemnto ;
        JOptionPane.showMessageDialog(null,"O valor da doação é de R$ : "+doacao+
               " o valor do investimento será de R$ :"+investiemnto+
                " o Valor para uso imediato Sera de R$ : "+usoimediato);

    }
}
