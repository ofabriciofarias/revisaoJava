/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2aula3;

/**
 *
 * @author labex
 */
public class Prog2aula3 {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        System.out.println("Saldo R$ " + c1.getSaldo());
        c1.setSaldo(700);
        System.out.println("Saldo R$ " + c1.getSaldo());
        c1.sacar(900);
        System.out.println("Saldo R$ " + c1.getSaldo());
        c1.sacar(350);
        System.out.println("Saldo R$ " + c1.getSaldo());
        
        //Cria um segundo objeto que receba 1300 reais.
        //Apresente o saldo.
        //Faça um saque de 314 reais.
        //Apresente o novo saldo
        ContaBancaria c2 = new ContaBancaria();
        c2.setSaldo(1300);
        System.out.println("Saldo R$ " + c2.getSaldo());
        c2.sacar(314);
        System.out.println("Saldo R$ " + c2.getSaldo());
    }
}
