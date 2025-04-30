/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc02.model;

/**
 *
 * @author Fabricio
 */
/**
 * MODEL: Responsável por armazenar os dados e conter a lógica de negócio.
 */
public class Pessoa {
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Setter do nome (caso precise mudar depois)
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Lógica de negócio simples: retorna uma saudação personalizada
    public String gerarSaudacao() {
        return "Olá, " + nome + "! Seja bem-vindo ao nosso sistema.";
    }
}
