/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadapterex1;

/**
 *
 * @author labex
 * 
 * ENUNCIACO
 * Exercício 01: 
Uma empresa possui um sistema legado que gerencia uma lista de pessoas em memória.
* Cada pessoa é representada por uma classe Pessoa, e as informações são armazenadas
* em uma lista simples do tipo List<Pessoa>. Atualmente, o sistema imprime os dados
* das pessoas em formato de texto comum no console.Contudo, surgiu a necessidade de
* integrar esse sistema com uma API externa que exige os dados no formato JSON.
* Como o sistema legado não tem suporte a JSON, nem usa bibliotecas externas 
* diretamente, você deve aplicar o padrão Adapter para realizar essa conversão,
* sem modificar a classe original Pessoa. 

 */
public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String toTexto() {
        return "Nome: " + nome + ", Idade: " + idade + ", Email: " + email;
    }
}

