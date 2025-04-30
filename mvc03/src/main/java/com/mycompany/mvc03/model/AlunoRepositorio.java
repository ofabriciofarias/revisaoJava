/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc03.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabricio
 * Backend que lida com o armazenamento no arquivo txt.
 * Garante a persistência dos dados
 */
public class AlunoRepositorio {
    private static final String ARQUIVO = "alunos.txt";
    
    public void salvarAluno(Aluno aluno) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))){
            writer.write(aluno.toString());
            writer.newLine();
        }
    }
    
    public List<Aluno> listarAlunos() throws IOException{
        List<Aluno> alunos = new ArrayList<>();
        File arquivo = new File(ARQUIVO);
        
        if(!arquivo.exists()) return alunos;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;
            
            while((linha = reader.readLine()) != null){
                alunos.add(Aluno.fromString(linha));
            }
        }
        return alunos;
    }
}
























