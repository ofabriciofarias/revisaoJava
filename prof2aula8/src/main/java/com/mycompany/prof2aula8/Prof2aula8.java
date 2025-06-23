/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prof2aula8;

/**
 *
 * @author labex
 */
public class Prof2aula8 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fernando", "Viana", "Maria José", "José Maria");
        System.out.println(p1);
        
        System.out.println("");
        System.out.println("");
        Pessoa.PessoaBuilder p2 = new Pessoa.PessoaBuilder()
                .nome("Fabricio")
                .sobrenome("Farias")
                
                .nomePai("José");
        
        System.out.println(p2);
        
        System.out.println("");
        System.out.println("");
        Pessoa p3 = new Pessoa.PessoaBuilder()
                .nome("Rafael")
                .sobrenome("Moraes")
                .nomeMae("Claudia Maria")
                .build();
        
        System.out.println(p3);
    }
}
