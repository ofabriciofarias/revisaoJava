/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge2;

/**
 *
 * @author labex
 */
public abstract class ControleRemoto {
    protected Dispositivo dispositivo;
    public boolean ligado = false;
    
    public ControleRemoto(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void setCanal(int canal);
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void mute();  
}


