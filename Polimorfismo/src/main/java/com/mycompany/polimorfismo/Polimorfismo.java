/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class Polimorfismo {

    public static void main(String[] args) {
        //Exemplo do polimorfismo estático
        //Calculadora calc = new Calculadora();
        //System.out.println("Resultado da soma = " + calc.somar(2, 2));
        
        //Exemplo do polimorfismo dinâmico
        /*Animal a1 = new Cachorro();  // referência do tipo Animal
        Animal a2 = new Gato();

        a1.fazerSom(); // "Latido"
        a2.fazerSom(); // "Miado"*/
        
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Gato());

        for (Animal a : animais) {
            a.fazerSom(); // funciona para qualquer animal!
        }   
    }
}

