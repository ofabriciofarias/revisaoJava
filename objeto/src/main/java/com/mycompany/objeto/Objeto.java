/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objeto;

/**
 *
 * @author Fabricio
 */
public class Objeto {

    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Hb20", 2016);

        // Atribuindo valores aos atributos
        //meuCarro.marca = "Toyota";
        //meuCarro.ano = 2022;
                

        // Chamando métodos
        meuCarro.buzinar();
        meuCarro.mostrarDados();
    }
}

