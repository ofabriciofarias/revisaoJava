/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc02.controller;

import com.mycompany.mvc02.model.Pessoa;
import com.mycompany.mvc02.view.PessoaView2;
/**
 *
 * @author Fabricio
 */
public class PessoaController {
    private Pessoa modelo;
    private PessoaView2 view;

    // Construtor com view injetada (modelo será criado dinamicamente)
    public PessoaController() {
        this.view = new PessoaView2(this);
    }

    
    public void processarNome(String nome) {
        modelo = new Pessoa(nome);
        String saudacao = modelo.gerarSaudacao();
        view.mostrarMensagem(saudacao);
    }
}

