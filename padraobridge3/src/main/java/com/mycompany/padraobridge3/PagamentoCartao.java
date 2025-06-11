/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge3;

/**
 *
 * @author labex
 */
public class PagamentoCartao implements FormaPagamento{

    protected int qtdParcelas = 1;
    
    @Override
    public void pagar(double valor) {
                System.out.println(qtdParcelas + " parcelas no cartão de "
                        + "crédito\nPagamento de " + valor/qtdParcelas + " "
                                + "reais por parcela.");
    }
    
}
