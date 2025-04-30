/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc01.view;

/**
 *
 * @author Fabricio
 */

import java.util.Scanner;

/**
 * VIEW: Responsável pela interação com o usuário.
 * Exibe informações e coleta entradas via console.
 */
public class PessoaView {
    private Scanner scanner = new Scanner(System.in);

    // Exibe uma mensagem no console
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Solicita ao usuário o nome e retorna o valor digitado
    public String solicitarNome() {
        System.out.print("Digite seu nome: ");
        return scanner.nextLine();
    }
}

