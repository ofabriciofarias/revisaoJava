/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Fabricio
 */
// Superclasse
public class Animal {
    String nome;
    String tipo = "Animal";

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public Animal(){}

    void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }
    
    void apresentar() {
        System.out.println("Eu sou um animal chamado " + nome);
    }
    
    void dormir() {
        System.out.println(nome + " está dormindo...");
    }
    
    void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}



