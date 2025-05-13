/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author Fabricio
 */
public class Heranca {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";
        dog.dormir(); // método herdado de Animal
        dog.latir();  // método próprio de Cachorro
        
        Animal a = new Animal();
        a.emitirSom(); // "Som genérico de animal"

        Cachorro c = new Cachorro();
        c.emitirSom(); // "Latido: au au!" (método sobrescrito)
        
        Gato g = new Gato("Mingau");
        g.apresentar(); // "Miau! Eu sou um gato chamado Mingau"
        
        Cavalo cav = new Cavalo();
        cav.mostrarTipo();
    }
}


