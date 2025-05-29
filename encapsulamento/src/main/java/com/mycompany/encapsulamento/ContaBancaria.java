/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author Fabricio
 */
public class ContaBancaria {
    private double saldo; // atributo encapsulado

    // Getter: permite ler o saldo
    public double getSaldo() {
        return saldo;
    }
    
    //Setter: adiciona saldo diretamente
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // Setter: permite modificar o saldo, com validação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}

