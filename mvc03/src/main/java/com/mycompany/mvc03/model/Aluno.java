/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc03.model;

/**
 *
 * @author Fabricio
 */
public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    
    public Aluno(String nome, String matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    /*
    é uma anotação do java que indica que o método que está sendo declarado
    está sobrescrevendo um método da superclasse ou de uma interface.
    Neste caso da classe Object.
    */
    @Override
    public String toString(){
        return nome + ";" + matricula + ";" + idade; 
    }
    
    
    public static Aluno fromString(String linha){
        String [] partes = linha.split(";");
        return new Aluno(partes[0],partes[1],Integer.parseInt(partes[2]));
    }
}
