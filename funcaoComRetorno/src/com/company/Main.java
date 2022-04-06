package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       int qtdeProduto;
       double totalVenda;
       System.out.println("entre qtde de produtosd :");
       qtdeProduto = leitor.nextInt();
       double[] produtos=new double[qtdeProduto];
       for (int i=0;i<produtos.length;i++){
           System.out.println("digite o valor ");
           produtos[i]= leitor.nextDouble();
       }
        System.out.println("O total do carrinho é R$" + somarCarrinho(produtos));
    }
        public static double somarCarrinho(double[] produtos) {
            double soma = 0;
            for(int i=0; i<produtos.length;i++) {
                soma = soma + produtos[i];
            }
            return soma;

                    }

}
