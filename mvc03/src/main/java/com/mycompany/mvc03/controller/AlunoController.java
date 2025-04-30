/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc03.controller;

import com.mycompany.mvc03.model.Aluno;
import com.mycompany.mvc03.model.AlunoRepositorio;
import com.mycompany.mvc03.view.AlunoView;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Fabricio
 * Controller vai receber as ações do view, processa lógica e interage com
 * o backend.
 */
public class AlunoController {
    private AlunoRepositorio repositorio;
    private AlunoView view;

    public AlunoController(){
        this.repositorio = new AlunoRepositorio();
        this.view = new AlunoView(this);
    }
    
    public void iniciar(){
        view.mostrarJanelaPrincipal();
    }
    public void cadastrarAluno(String nome, String matricula, int idade) {
        try{
            Aluno aluno = new Aluno(nome, matricula, idade);
            repositorio.salvarAluno(aluno);
            view.mostrarMensagem("Aluno cadastrado com sucesso!");
        }catch(IOException e){
            view.mostrarMensagem("Erro ao salvar aluno: " + e.getMessage());
        }
    }

    public void mostrarRelatorio() {
        try{
            List<Aluno> alunos = repositorio.listarAlunos();
            view.mostrarRelatorio(alunos);
        }catch(IOException e){
            view.mostrarMensagem("Erro ao carregar relatório: " + e.getMessage());
        }
    }
    
}
