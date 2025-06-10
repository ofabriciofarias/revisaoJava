/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadaptercalc;

/**
 *
 * @author labex
 */
public class Divisao implements Operacao{

    @Override
    public float calcular(float a, float b) {
        if(b == 0){ 
            throw new ArithmeticException("Divisão por zero");
        }
        return a/b;
    } 
}


