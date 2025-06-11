/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraobridge;

/**
 *
 * @author labex
 */
public class Padraobridge {

    public static void main(String[] args) {
        Dispositivo samsung = new TVSamsung();
        ControleRemoto controleSamsung = new ControleSimples(samsung);
        
        controleSamsung.ligar();              
        controleSamsung.setCanal(5);
        controleSamsung.setCanal(12);
        controleSamsung.desligar();
        controleSamsung.setCanal(10);
        
    }
}

