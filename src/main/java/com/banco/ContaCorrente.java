package com.banco;

import javax.swing.JOptionPane;

public class ContaCorrente {
    // Atributos
    public String nome;
    public float saldo;
    public float limite;
    public char tipo;

    // Construtor padrão
    public ContaCorrente() {
        this.nome = "";
        this.saldo = 0;
        this.limite = 0;
        this.tipo = 'C'; // 'C' para Conta Comum, 'E' para Conta Especial
    }

    // Construtor com parâmetros
    public ContaCorrente(String nome, float saldo, float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    // Construtor com parâmetros (sem limite)
    public ContaCorrente(String nome, float saldo, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = 0; // Limite padrão
        this.tipo = tipo;
    }

    // Método cadastrar dados
    public void cadastraDados() {
        nome = JOptionPane.showInputDialog("Digite o nome do titular:");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo inicial:"));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (C para Comum, E para Especial):").charAt(0);
        if (tipo == 'E') {
            limite = Float.parseFloat(JOptionPane.showInputDialog("Digite o limite da conta especial:"));
        }
    }

    // Método para imprimir dados
    public String imprimeDados() {
        return "Conta Corrente: \n" +
                "Nome: " + nome + "\n" +
                "Saldo: " + saldo + "\n" +
                "Limite: " + limite + "\n" +
                "Tipo: " + (tipo == 'C' ? "Comum" : "Especial");
    }

    // Método para depositar valor
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!\nNovo saldo: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido para depósito.");
        }
    }

    // Método para sacar valor
    public void sacar(float valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\nNovo saldo: " + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para saque.");
        }
    }
}