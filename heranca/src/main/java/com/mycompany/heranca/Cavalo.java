/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Fabricio
 */
public class Cavalo extends Animal{
    String tipo = "Cavalo";

    @Override
    void mostrarTipo() {
        System.out.println("Tipo filho: " + tipo);
        System.out.println("Tipo pai: " + super.tipo); // acessa o atributo da superclasse
    }
}

