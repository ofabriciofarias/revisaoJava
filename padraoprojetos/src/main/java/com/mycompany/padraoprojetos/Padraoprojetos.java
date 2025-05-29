/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraoprojetos;

/**
 *
 * @author Fabricio
 */
public class Padraoprojetos {

    public static void main(String[] args) {
        ConfigManager config1 = ConfigManager.getInstance();
        ConfigManager config2 = ConfigManager.getInstance();
        
        config1.exibirConfiguracoes();
        
        //Verificando se são a mesma instância
        System.out.println(config1 == config2); //true
    }
}

