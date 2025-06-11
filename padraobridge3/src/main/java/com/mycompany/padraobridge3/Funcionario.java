/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge3;

/**
 *
 * @author labex
 */
public class Funcionario extends Pessoa{

    public Funcionario(FormaPagamento formaPagamento){
        super(formaPagamento);        
    }
    
    @Override
    public void pagar(double valor) {
        System.out.println("Funcionário está registrando a venda...");
        formaPagamento.pagar(valor);
    }
    
}
