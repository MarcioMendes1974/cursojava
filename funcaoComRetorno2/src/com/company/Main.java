package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Scanner leitor=new Scanner(System.in);
        int qtdeProdutos;
        double totalVenda;
        System.out.println("Entre com a quantidade de produtos no carrinho:");
        qtdeProdutos=leitor.nextInt();
        double[] produtos=new double[qtdeProdutos];
        for(int i=0;i< produtos.length;i++){
            System.out.println("Digite o valor do produto");
            produtos[i]=leitor.nextDouble();
        }
        //Conceder 10% de desconto quando o valor total do carrinho for maior que R$500,00
        totalVenda=somarCarrinho(produtos);
        if(totalVenda>500){
            totalVenda=totalVenda-(totalVenda*0.1);
        }
        System.out.println("Valor final da venda: R$" + totalVenda);
    }
    public static double somarCarrinho(double[] produtos) {
        double soma = 0;
        for(int i=0; i<produtos.length;i++) {
            soma = soma + produtos[i];
        }
        return soma;

    }
}
