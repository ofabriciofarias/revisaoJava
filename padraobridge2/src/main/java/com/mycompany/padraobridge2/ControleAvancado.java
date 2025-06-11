/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge2;

/**
 *
 * @author labex
 */
public class ControleAvancado extends ControleRemoto{

    public ControleAvancado(Dispositivo dispositivo){
        super(dispositivo);
    }
    
    @Override
    public void ligar() {
        System.out.println("Ligar a TV");
        ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligar a TV");
        ligado = false;
    }

    @Override
    public void setCanal(int canal) {
        if(ligado){
            System.out.println("Canal " + canal + " selecionado");
        }
    }

    @Override
    public void aumentarVolume() {
        if(ligado){
            System.out.println("Aumentar++");
        }
    }

    @Override
    public void diminuirVolume() {
        if(ligado){
            System.out.println("Diminuir++");
        }
    }

    @Override
    public void mute() {
        if(ligado){
            System.out.println("Sem Som");
        }
    }
    
}
