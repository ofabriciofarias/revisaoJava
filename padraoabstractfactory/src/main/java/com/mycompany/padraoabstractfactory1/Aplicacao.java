/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoabstractfactory1;

/**
 *
 * @author labex
 */
public class Aplicacao {
    private Botao botao;
    private Menu menu;
    
    public Aplicacao(GUIFactory factory){
        botao = factory.criarBotao();
        menu = factory.criarMenu();
    }
    
    public void renderizar(){
        botao.desenhar();
        menu.montar();
    }
}
