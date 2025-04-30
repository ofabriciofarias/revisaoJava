/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc02.view;

/**
 *
 * @author Fabricio
 */

import com.mycompany.mvc02.controller.PessoaController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PessoaView2{
    private JFrame frame;
    private JTextField nomeField;
    private JPanel telaInicial;
    private JPanel telaMensagem;
    private JLabel mensagemLabel;

    private PessoaController controller;

    public PessoaView2(PessoaController controller){
        this.controller = controller;
        inicializarGUI();
    }
    
    private void inicializarGUI(){
        frame = new JFrame("Sistema de Boas Vindas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocale(null);
        
        criarTelaInicial();
        criarTelaMensagem();
        
        frame.setContentPane(telaInicial);
        frame.setVisible(true);
    }
    
    //Tela inicial: input + botão de confirmar
    private void criarTelaInicial(){
        telaInicial = new JPanel();
        telaInicial.setLayout(new GridLayout(3,1));
        
        JLabel label = new JLabel("Digite seu nome:", SwingConstants.CENTER);
        nomeField = new JTextField();
        
        JButton confirmarBtn = new JButton("Confirmar");
        confirmarBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                controller.processarNome(nome);
            }
        });
        
        telaInicial.add(label);
        telaInicial.add(nomeField);
        telaInicial.add(confirmarBtn);
    }
    
    private void criarTelaMensagem(){
        telaMensagem = new JPanel();
        telaMensagem.setLayout(new BorderLayout());
        
        mensagemLabel = new JLabel("", SwingConstants.CENTER);
        mensagemLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        JButton voltarBtn = new JButton("Voltar");
        voltarBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(telaInicial);
                frame.revalidate();
            }
        });
        
        telaMensagem.add(mensagemLabel, BorderLayout.CENTER);
        telaMensagem.add(voltarBtn, BorderLayout.SOUTH);
    }

    public void mostrarMensagem(String mensagem) {
        mensagemLabel.setText(mensagem);
        frame.setContentPane(telaMensagem);
        frame.revalidate();
    }
}































       
