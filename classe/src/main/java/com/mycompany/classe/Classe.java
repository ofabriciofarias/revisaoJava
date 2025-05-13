/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classe;

/**
 *
 * @author Fabricio
 */
public class Classe {

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Lucas", 30);

        // Chamando o método
        p1.apresentar(); // Olá, meu nome é Ana e tenho 25 anos.
        p2.apresentar(); // Olá, meu nome é Lucas e tenho 30 anos.
    }
}


