/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2aula3;

/**
 *
 * @author labex
 */
public class ContaBancaria {
    private double saldo = 0.0;

    //Verifico meu saldo em conta
    public double getSaldo() {
        return saldo;
    }

    //Adiciono dinheiro em conta
    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = this.saldo + saldo; //this.saldo += saldo
        }
    }
    
    public void sacar(double saque){
        if(saque > 0 && saque <= this.saldo){
            this.saldo = this.saldo - saque;
            System.out.println("Você sacou R$ " + saque);
            System.out.println("Novo saldo R$ " + this.saldo);
        }else{
            System.out.println("Saldo Insuficiente!Não é possível sacar R$ " + saque);
        }
    } 
}

