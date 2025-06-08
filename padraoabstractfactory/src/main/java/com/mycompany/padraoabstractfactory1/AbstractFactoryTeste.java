/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoabstractfactory1;

/**
 *
 * @author labex
 */
public class AbstractFactoryTeste {
    public static void main(String [] args){
        GUIFactory factory;
        
        //Simulando o sistema operacional
        String sistemaOperacional = "Linux";
        
        if(sistemaOperacional.equals("Windows")){
            factory = new WindowsFactory();
        }else{
            factory = new LinuxFactory();
        }
        
        Aplicacao app = new Aplicacao(factory);
        app.renderizar();
    }
}

