package com.mycompany.padraoprojetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabricio
 */
public class ConfigManager {
    //1 Atributo estático que armazenará a instância
    private static ConfigManager instance;
    
    //2. Construtor privado impede a criação de instância fora da classe
    private ConfigManager(){
        System.out.println("Inicializando ConfigManager....");
    }
    
    //3. Método estático que retorna a instância única (com lazy initialization)
    public static ConfigManager getInstance(){
        if(instance == null){
            instance = new ConfigManager();
        }
        return instance;
    }
    
    //Método de exemplo
    public void exibirConfiguracoes(){
        System.out.println("Exibindo configurações do sistema...");
    }
}


