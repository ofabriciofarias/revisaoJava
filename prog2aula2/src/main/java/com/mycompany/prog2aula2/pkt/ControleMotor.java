/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2aula2.pkt;
import com.mycompany.prog2aula2.*;

/**
 *
 * @author labex
 */
public class ControleMotor extends Controle{
    public float potencia;
    private String acionamento;
    protected String combustivel;
    
    public void imprimirClique(){
        System.out.println("Clique: " + clique);
    }
}
