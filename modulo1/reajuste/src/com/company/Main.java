package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double salario = 0, reajuste=0;
            System.out.println("digite o salario :");
            salario = leitor.nextDouble();
            System.out.println("digite o reajuste :");
            reajuste = leitor.nextDouble();
            multiplicar(salario,reajuste);
                }


        public static void exibirResultado(double res){
            System.out.println("O resultado foi " + res + "!");
        }
        public static void multiplicar (double a,double b){
            double resultado;
            System.out.println("realizando o reajsute do salario");
            resultado = (a * b) +a;
            exibirResultado(resultado);
        }

    }

