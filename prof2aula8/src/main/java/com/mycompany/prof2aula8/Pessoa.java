/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prof2aula8;

/**
 *
 * @author labex
 */
public class Pessoa {
    private String nome, sobrenome, nomeMae, nomePai;

    public Pessoa(String nome, String sobrenome, String nomeMae, String nomePai) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    
    @Override
    public String toString(){
        return "Pessoa\nNome Completo: " + this.nome + " " + this.sobrenome + ""
                + "\nNome da Mãe: " + this.nomeMae + ""
                + "\nNome do Pai: " + this.nomePai;
    }
    
    public static class PessoaBuilder{
        
        private String nome, sobrenome, nomeMae, nomePai;
        public PessoaBuilder(){}
        
        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        
        public PessoaBuilder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }
        
        public PessoaBuilder nomeMae(String nomeMae){
            this.nomeMae = nomeMae;
            return this;
        }
        
        public PessoaBuilder nomePai(String nomePai){
            this.nomePai = nomePai;
            return this;
        }
        
        public Pessoa build(){
            return new Pessoa(nome, sobrenome, nomeMae, nomePai);
        }
        
        @Override
        public String toString(){
        return "Builder\nNome Completo: " + this.nome + " " + this.sobrenome + ""
                + "\nNome da Mãe: " + this.nomeMae + ""
                + "\nNome do Pai: " + this.nomePai;
        }
    }//Fim da classe PessoaBuilder
}//Fim da classe Pessoa
