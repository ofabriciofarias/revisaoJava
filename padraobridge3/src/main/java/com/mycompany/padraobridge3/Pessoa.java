/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge3;

/**
 *
 * @author labex
 */
public abstract class Pessoa {
    protected FormaPagamento formaPagamento;
    
    public Pessoa(FormaPagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    
    public abstract void pagar(double pagar);
}
