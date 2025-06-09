/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2aula1;

/**
 *
 * @author labex
 */
public class Prog2aula1 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Cris";
        p.idade = 22;
        
        p.apresentar();
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Rubens Sergio";
        p2.idade = 30;
        
        p2.apresentar();
        
        //Instancie um objeto e adicione nome juliana e idade 33.
        //Apresente em tela.
        Pessoa p3 = new Pessoa();
        p3.nome = "Juliana";
        p3.idade = 33;
        
        p3.apresentar();      
    }
}
