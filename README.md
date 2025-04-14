# Conta Corrente em Java (com JOptionPane)

Este é um projeto simples de uma **Conta Corrente** em Java utilizando `JOptionPane` para interação com o usuário. Ele permite cadastrar uma conta, realizar depósitos, saques e visualizar os dados da conta.

## 📌 Funcionalidades

- Cadastro de conta com nome, saldo, tipo (Comum ou Especial) e limite (se aplicável)
- Impressão dos dados da conta
- Depósito de valores
- Saque com verificação de saldo e limite
- Interface com o usuário via caixas de diálogo (`JOptionPane`)

## 🛠️ Tecnologias

- Java
- Swing (`javax.swing.JOptionPane`)

## 📂 Estrutura dos Arquivos



## ▶️ Como executar

1. Clone este repositório:

```bash
git clone https://github.com/HumbertoCSilva/ContaCorrenteJava.git



cd ContaCorrenteJava
javac -d bin src/main/java/com/banco/*.java
java -cp bin com.banco.ProgramaContaCorrente
