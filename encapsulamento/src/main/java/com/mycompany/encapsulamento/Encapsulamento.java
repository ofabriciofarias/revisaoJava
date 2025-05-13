/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento;

/**
 *
 * @author Fabricio
 */
public class Encapsulamento {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500.0);
        conta.sacar(200.0);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());    
    }
}

