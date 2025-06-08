/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hagregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labex
 */
public class Escola {
    private String nome;
    private List<Professor> professores;// = new ArrayList<>();
    
    public Escola(String nome){
        this.nome = nome;
        this.professores = new ArrayList<>();
    }
    
    public void addProfessor(Professor professor){
        professores.add(professor);
    }
    
    public void listarProfessores(){
        System.out.println("Lista Professores da Escola " + nome);
        for(Professor p: professores){
            System.out.println("- " + p.getNome());
        }
    }
}

