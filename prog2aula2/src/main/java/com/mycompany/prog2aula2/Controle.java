/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2aula2;

/**
 *
 * @author labex
 */
public class Controle {
    int temperatura;
    protected int clique = 6;
    
    int aumentar(){
        return temperatura++;
    }
    
    int diminuir(){
        return temperatura--;
    }
    
    void imprimir(){
        System.out.println("Temp: " + temperatura);
    }
}
