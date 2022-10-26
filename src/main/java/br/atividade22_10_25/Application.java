package br.atividade22_10_25;


import javax.swing.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta: "));
            Double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
            Conta conta = new Conta(saldo, valorSaque);
            conta.saque(saldo, valorSaque);
            JOptionPane.showMessageDialog(null, conta.toString());
            }
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
