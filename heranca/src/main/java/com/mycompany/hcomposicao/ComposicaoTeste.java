/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hcomposicao;

/**
 *
 * @author labex
 */
public class ComposicaoTeste {
    public static void main(String [] args){
        Residencia casa = new Residencia();
        
        casa.addComodo("Sala");
        casa.addComodo("Cozinha");
        casa.listarComodos();
        casa.addComodo("Banheiro 1");
        casa.addComodo("Banheiro 2");
        casa.listarComodos();             
    }
}
