/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author Fabricio
 */
public class PrincipalConta {
    public static void main(String[] args) {
        ContaBancaria conta = ContaBancaria.getInstancia("João da Silva");

        conta.depositar(1000.0);
        conta.depositar(500.0);
        conta.sacar(300.0);
        conta.exibirSaldo();
    }
}

