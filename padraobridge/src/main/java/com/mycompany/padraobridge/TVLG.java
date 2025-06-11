/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge;

/**
 *
 * @author labex
 */
public class TVLG implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("TV LG ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("TV LG desligada.");
    }

    @Override
    public void setCanal(int canal) {
        System.out.println("TV LG. Canal " + canal);
    }    
}


