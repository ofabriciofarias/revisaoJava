/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2aula6.controller;

/**
 *
 * @author labex
 */
import prog2aula6.model.Aluno;
import prog2aula6.model.AlunoDAO;

import javax.swing.*;

public class AlunoController {

    public void cadastrarAluno(String nome, String endereco, String email, String curso) {
        try {
            Aluno aluno = new Aluno(nome, endereco, email, curso);
            AlunoDAO dao = new AlunoDAO();
            dao.inserir(aluno);

            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }
    }
}
