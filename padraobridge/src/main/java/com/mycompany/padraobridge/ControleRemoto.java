/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge;

/**
 *
 * @author labex
 */
public abstract class ControleRemoto {
    
    protected Dispositivo dispositivo;
    public boolean ligada = false;
    
    public ControleRemoto(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void setCanal(int canal);
    
}

