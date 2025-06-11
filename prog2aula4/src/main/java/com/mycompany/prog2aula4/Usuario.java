/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author labex
 */
public class Usuario {
    private String nome, senha, cargo;
    private int idade;
    
    public void cadUsuario(String nome, String senha, int idade, String cargo){
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.cargo = cargo;
        
        //Irá cadastrar no banco de dados!!!!
        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
    }
    
    
}
