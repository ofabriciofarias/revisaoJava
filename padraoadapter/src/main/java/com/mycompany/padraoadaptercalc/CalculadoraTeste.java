/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadaptercalc;

/**
 *
 * @author labex
 */
public class CalculadoraTeste {
    public static void main(String[] args) {
        CalculadoraAdapter adapter = new CalculadoraAdapter();

        System.out.println("Soma: " + adapter.calcular("soma", 10, 5));
        System.out.println("Subtração: " + adapter.calcular("subtrai", 10, 5));
        System.out.println("Multiplicação: " + adapter.calcular("multiplica", 10, 5));
        System.out.println("Divisão: " + adapter.calcular("divide", 10, 2));
        System.out.println("Fim do programa!");
    }
}
