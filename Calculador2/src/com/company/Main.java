package com.company;

import java.util.Scanner;

public class Main {
    public static double resultado;


    public static void main(String[] args) {

	// write your code here
        Scanner leitor = new Scanner(System.in);
        double valor1=0 , valor2=0;
        double subtracao, divisao, multiplicacao;
        int opcao = 0;
        while (opcao!=6){
            exibirMenu();
            opcao = leitor.nextInt();
     //*       System.out.println("CALCULADORA");
            //*       System.out.println("DIGITE A AOPCAO");
            //*        System.out.println("1 - Digitar valores");
            //*        System.out.println("2 - Realizar soma");
            //*        System.out.println("3 - Realizar subtracao");
            //*        System.out.println("4 - Realizar divisao ");
            //*        System.out.println("5 - Realizar multiplicacao ");
            //*    System.out.println("6 - saair ");
            //*       opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("\n\ndigite o primero valor");
                    valor1 = leitor.nextDouble();
                    System.out.println("\n\nDigite o segundo valor");
                    valor2 = leitor.nextDouble();
                    System.out.println("Os valores "+valor1+ "e" +valor2+" foram armazenados");
                    break;
                case 2:
                    //*                System.out.println("\n\nrealizando a soma entre"+valor1+ "e" +valor2);
                    //*                soma = valor1 + valor2;
                    //*                System.out.println("\n\nO resultado foi"+soma+"!\n\n");
                    //*resultado= valor1 + valor2;
                    //*exibirResultado();
                    somar(valor1, valor2);
                    break;
                case 3:
                    //*    System.out.println("\n\nrealizando a subtracaoo entre"+valor1+ "e" +valor2);
                    //*    subtracao = valor1 - valor2;
                    //*   System.out.println("\n\nO resultado foi"+subtracao+"!\n\n");
                    subtrair(valor1,  valor2);
                    //*exibirResultado(soma);
                    break;
                case 4:
                    //*    System.out.println("\n\nrealizando a divisao"+valor1+ "e" +valor2);
                    //*    divisao = valor1 / valor2;
                    //*    System.out.println("\n\nO resultado foi"+divisao+"!\n\n");
                    dividir(valor1 , valor2);
                    //**exibirResultado();
                    break;
                case 5:
                    //*    System.out.println("\n\nrealizando a multiplicacao"+valor1+ "e" +valor2);
                    //*    multiplicacao = valor1 * valor2;
                    //*    System.out.println("\n\nO resultado foi"+multiplicacao+"!\n\n");
                    multiplicacao(valor1 , valor2);
                   //* exibirResultado();
                    break;
                case 6:
                    System.out.println("\n\nsaindo do sistema");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }


        }
        public static void exibirMenu(){
            System.out.println("CALCULADORA");
            System.out.println("DIGITE A AOPCAO");
            System.out.println("1 - Digitar valores");
            System.out.println("2 - Realizar soma");
            System.out.println("3 - Realizar subtracao");
            System.out.println("4 - Realizar divisao ");
            System.out.println("5 - Realizar multiplicacao ");
            System.out.println("6 - saair ");
    }

    public static void exibirResultado(double resultado) {
        System.out.println("O resultado foi " + resultado + "!");
    }

    public static void somar(double primeiroValor, double segundoValor ){
        double soma;
        System.out.println("n\nRealizando a soma entre "+primeiroValor+ "e" +segundoValor);
        soma = primeiroValor + segundoValor;
        exibirResultado(soma);
    }
    public static void subtrair(double primeiroValor, double segundoValor ){
        double subtrai;
        System.out.println("n\nRealizando a soma entre "+primeiroValor+ "e" +segundoValor);
        subtrai = primeiroValor - segundoValor;
        exibirResultado(subtrai);
    }
    public static void dividir(double primeiroValor, double segundoValor ){
        double divide;
        System.out.println("n\nRealizando a soma entre "+primeiroValor+ "e" +segundoValor);
        divide = primeiroValor / segundoValor;
        exibirResultado(divide);
    }
    public static void multiplicacao(double primeiroValor, double segundoValor ){
        double multiplicar;
        System.out.println("n\nRealizando a soma entre "+primeiroValor+ "e" +segundoValor);
        multiplicar = primeiroValor * segundoValor;
        exibirResultado(multiplicar);
    }

    }


