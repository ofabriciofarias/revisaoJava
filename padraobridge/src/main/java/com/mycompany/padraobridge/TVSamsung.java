/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge;

/**
 *
 * @author labex
 */
public class TVSamsung implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("TV Samsung ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("TV Samsung desligada.");
    }

    @Override
    public void setCanal(int canal) {
        System.out.println("TV Samsung. Canal " + canal);
    }    
}

