/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objeto;

/**
 *
 * @author Fabricio
 */
public class Carro {
    // Atributos
    String marca;
    int ano;

    //Método Construtor
    public Carro(){
        
    }
    
    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    
    // Método
    void buzinar() {
        System.out.println("Bii Bii!");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}


