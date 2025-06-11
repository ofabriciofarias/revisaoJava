/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.padraobridge2;

/**
 *
 * @author labex
 */
public interface Dispositivo {
    void ligar();
    void desligar();
    void setCanal(int canal);
    void aumentarVolume();
    void diminuirVolume();
    void mute();
}


