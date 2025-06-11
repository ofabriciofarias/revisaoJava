/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraobridge;

/**
 *
 * @author labex
 */
public class ControleSimples extends ControleRemoto{
    public ControleSimples(Dispositivo dispositivo){
        super(dispositivo);
    }

    @Override
    public void ligar() {
        dispositivo.ligar();
        ligada = true;
    }

    @Override
    public void desligar() {
        dispositivo.desligar();
        ligada = false;
    }

    @Override
    public void setCanal(int canal) {
        if(ligada){
            dispositivo.setCanal(canal);
        }else{
            System.out.println("TV Desligada.");
        }
    }
}

