/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc03.view;

import com.mycompany.mvc03.controller.AlunoController;
import com.mycompany.mvc03.model.Aluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


/**
 *
 * @author Fabricio
 * 
 * Frontend é o view
 */
public class AlunoView {
    private AlunoController controller;
    
    private JFrame frame;
    private JTextField nomeField;
    private JTextField matriculaField;
    private JTextField idadeField;
    
    public AlunoView(AlunoController controller){
        this.controller = controller;
    }
    
    public void mostrarJanelaPrincipal(){
        frame = new JFrame("Cadastro de alunos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6,1));
        
        nomeField = new JTextField();
        matriculaField = new JTextField();
        idadeField = new JTextField();
        
        frame.add(new JLabel("Nome:"));
        frame.add(nomeField);
        frame.add(new JLabel("Matricula:"));
        frame.add(matriculaField);
        frame.add(new JLabel("Idade:"));
        frame.add(idadeField);
        
        JButton cadastrarBtn = new JButton("Cadastrar");
        JButton relatorioBtn = new JButton("Ver Relatório");
        
        cadastrarBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String matricula = matriculaField.getText();
                int idade;
                
                try{
                    idade = Integer.parseInt(idadeField.getText());
                    controller.cadastrarAluno(nome, matricula, idade);
                }catch(NumberFormatException ex){
                    mostrarMensagem("Idade inválida.");
                }
            }
        });
        
        relatorioBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.mostrarRelatorio();
            }
        });
        
        frame.add(cadastrarBtn);
        frame.add(relatorioBtn);
        
        frame.setVisible(true);
    }
    
    public void mostrarMensagem(String idade_invalida) {
                JOptionPane.showMessageDialog(frame, idade_invalida);
    }
    
    public void mostrarRelatorio(List<Aluno> alunos){
        StringBuilder sb = new StringBuilder("Relatório de Alunos:\n");
        for(Aluno a : alunos){
            sb.append("Nome: ").append(a.getNome())
                    .append(" | Matrícula: ").append(a.getMatricula())
                    .append(" | Idade: ").append(a.getIdade()).append("\n");
        }
        
        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textArea);
        
        JOptionPane.showMessageDialog(frame, scroll, "Relatório", JOptionPane.INFORMATION_MESSAGE);
    }    
}


























