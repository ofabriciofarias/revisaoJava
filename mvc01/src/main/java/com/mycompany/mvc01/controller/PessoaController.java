/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc01.controller;

/**
 *
 * @author Fabricio
 */

import com.mycompany.mvc01.model.Pessoa;
import com.mycompany.mvc01.view.PessoaView;

/**
 * CONTROLLER: Coordena as interações entre Model e View.
 * Recebe entradas da View, atualiza o Model e retorna resultados à View.
 */
public class PessoaController {
    private Pessoa modelo;
    private PessoaView view;

    // Construtor com view injetada (modelo será criado dinamicamente)
    public PessoaController(PessoaView view) {
        this.view = view;
    }

    // Fluxo principal do programa
    public void iniciar() {
        // 1. Solicita o nome ao usuário via VIEW
        String nome = view.solicitarNome();

        // 2. Cria o MODEL com o nome informado
        modelo = new Pessoa(nome);

        // 3. Chama método do MODEL que gera a saudação
        String saudacao = modelo.gerarSaudacao();

        // 4. Envia a mensagem de volta à VIEW
        view.exibirMensagem(saudacao);
    }
}
