/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraobridge2;

/**
 *
 * @author labex
 */
public class Padraobridge2 {

    public static void main(String[] args) {
        Dispositivo tvSamsung = new TVSamsung();
        ControleAvancado controle = new ControleAvancado(tvSamsung);
        
        controle.ligar();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.setCanal(12);
        controle.aumentarVolume();
        controle.desligar();
        controle.aumentarVolume();
        controle.setCanal(12);
    }
}


