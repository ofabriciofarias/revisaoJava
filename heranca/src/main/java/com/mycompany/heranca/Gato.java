/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Fabricio
 */
public class Gato extends Animal {

    // Construtor que chama o construtor da superclasse
    public Gato(String nome) {
        super(nome); // Chama o construtor de Animal
    }

    @Override
    void apresentar() {
        System.out.println("Miau! Eu sou um gato chamado " + nome);
    }
}


