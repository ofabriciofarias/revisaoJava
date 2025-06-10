/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadaptercalc;

/**
 *
 * @author labex
 */
public class Calculadora {
    public float calcular(String operacao, float a, float b) {
        if(operacao.equals("soma")) {
            return a + b;
        } else if (operacao.equals("subtrai")) {
            return a - b;
        } else if (operacao.equals("multiplica")) {
            return a * b;
        }
        return 0;
    }
}


