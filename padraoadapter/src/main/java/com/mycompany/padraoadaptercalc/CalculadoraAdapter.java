/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadaptercalc;

/**
 *
 * @author labex
 */
public class CalculadoraAdapter {
    private Calculadora calculadoraLegada;
    
    public CalculadoraAdapter(){
        this.calculadoraLegada = new Calculadora();
    }
    
    public float calcular(String operacao, float a, float b){
        if(operacao.equals("divide")){
            Operacao dividir = new Divisao();
            return dividir.calcular(a, b);
        }

        // Para operações suportadas pelo legado, delega para ele
        return calculadoraLegada.calcular(operacao, a, b);
    }
    
}

