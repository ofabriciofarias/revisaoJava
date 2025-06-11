/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge2;

/**
 *
 * @author labex
 */
public class TVSamsung implements Dispositivo{
    
    @Override
    public void ligar() {
        System.out.println("Ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligado");
    }

    @Override
    public void setCanal(int canal) {
        System.out.println("Canal " + canal + " selecionado");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume++");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Volume--");
    }

    @Override
    public void mute() {
        System.out.println("Sem Som");
    }
    
}
