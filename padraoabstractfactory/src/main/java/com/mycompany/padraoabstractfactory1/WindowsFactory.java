/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoabstractfactory1;

/**
 *
 * @author labex
 */
public class WindowsFactory implements GUIFactory{

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Menu criarMenu() {
        return new MenuWindows();
    }   
}


