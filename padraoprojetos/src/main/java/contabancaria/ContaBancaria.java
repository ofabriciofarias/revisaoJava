/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Fabricio
 */
public class ContaBancaria {
    private static ContaBancaria instancia;
    private String titular;
    private double saldo;

    // Construtor privado
    private ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Método de acesso Singleton
    public static ContaBancaria getInstancia(String titular) {
        if (instancia == null) {
            instancia = new ContaBancaria(titular);
        }
        return instancia;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

