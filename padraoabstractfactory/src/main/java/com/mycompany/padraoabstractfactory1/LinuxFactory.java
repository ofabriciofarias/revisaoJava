/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoabstractfactory1;

/**
 *
 * @author labex
 */
public class LinuxFactory implements GUIFactory{

    @Override
    public Botao criarBotao() {
        return new BotaoLinux();
    }

    @Override
    public Menu criarMenu() {
        return new MenuLinux();
    }
    
}
