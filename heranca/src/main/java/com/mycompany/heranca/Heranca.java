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
    }
}
