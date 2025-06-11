/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hagregacao;

/**
 *
 * @author labex
 */
public class Professor {
    private String nome;
    private float salario;

    /*
    public Professor(){}
    
    public Professor(String nome){
        this.nome = nome;
    } */
    public Professor(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
