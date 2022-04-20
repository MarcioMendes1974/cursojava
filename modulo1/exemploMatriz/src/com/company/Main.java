package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leitor = new Scanner(System.in);
        final int qtdecolunas = 4;
        final int qtdelinhas = 4;
        double[][] matriz = new double[qtdelinhas][qtdecolunas];
        //entrada de dados
        for (int linha = 0; linha < qtdelinhas; linha++) {
            for (int coluna = 0; coluna < qtdecolunas; coluna++) {
                System.out.println("digite a linha" + linha + "e coluna " + coluna);
                matriz[linha][coluna] = leitor.nextDouble();
            }
        }
            for (int linha = 0; linha < qtdelinhas; linha++) {
                for (int coluna = 0; coluna < qtdecolunas; coluna++) {
                    System.out.print(matriz[linha][coluna] + " ");
                }
            }
                System.out.println();

        }
    }

