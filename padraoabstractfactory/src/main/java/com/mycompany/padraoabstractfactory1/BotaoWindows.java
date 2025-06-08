/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoabstractfactory1;

/**
 *
 * @author labex
 */
public class BotaoWindows implements Botao{
    @Override
    public void desenhar(){
        System.out.println("Desenhando botão no estilo Windows");
    }
}
