package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("difite a opçao desejda\n1-opçao1\n2-opção2" +
                "\n3-opção3\n4-opçao4\n5-sair "));
           switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Você digitou a opção1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você digitou a opção2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Você digitou a opção3");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Você digitou a opção4");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "OK! saindo do sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção escolhida nao existe");
                    break;
                }

        }
    }
