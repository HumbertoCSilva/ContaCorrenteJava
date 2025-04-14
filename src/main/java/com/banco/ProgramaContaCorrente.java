package com.banco;

import javax.swing.JOptionPane;

public class ProgramaContaCorrente {
    public static void main(String[] args) {
        // Instanciando dois objetos da classe ContaCorrente
        ContaCorrente conta1 = new ContaCorrente(); // Usando o construtor padrão
        ContaCorrente conta2 = new ContaCorrente("Maria", 1000, 'E'); // Usando o construtor com parâmetros

        // Cadastrando dados da conta1 usando JOptionPane
        conta1.cadastraDados();

        // Imprimindo os dados das contas
        JOptionPane.showMessageDialog(null, "Conta 1:\n" + conta1.imprimeDados());
        JOptionPane.showMessageDialog(null, "Conta 2:\n" + conta2.imprimeDados());

        // Realizando operações de depósito e saque na conta1
        float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para depósito na conta 1:"));
        conta1.depositar(valorDeposito);

        float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para saque na conta 1:"));
        conta1.sacar(valorSaque);

        // Imprimindo os dados atualizados da conta1
        JOptionPane.showMessageDialog(null, "Conta 1 após operações:\n" + conta1.imprimeDados());
    }
}