/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraobridge3;

/**
 *
 * @author labex
 */
public class Padraobridge3 {

    public static void main(String[] args) {
        // Cliente pagando via Pix
        Pessoa cliente = new Cliente(new PagamentoPix());
        cliente.pagar(150.00);

        System.out.println();

        // Funcionário registrando venda em dinheiro
        Pessoa funcionario = new Funcionario(new PagamentoDinheiro());
        funcionario.pagar(500.00);

        System.out.println();

        // Cliente pagando com cartão
        Pessoa outroCliente = new Cliente(new PagamentoCartao());
        outroCliente.pagar(320.00);
    }
}
