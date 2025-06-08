/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hcomposicao;

import java.util.ArrayList;

/**
 *
 * @author labex
 */
public class Residencia {
    private ArrayList<Comodo> comodos;
    
    public Residencia(){
        this.comodos = new ArrayList<>();
    }
    
    public void addComodo(String nome){
        Comodo comodo = new Comodo();
        comodo.setComodo(nome);
        comodos.add(comodo);
    }
    
    public void listarComodos(){
        System.out.println("Listar Comodos");
        for(Comodo c: comodos){
            System.out.println("- " + c.getComodo());
        }
    }
}

