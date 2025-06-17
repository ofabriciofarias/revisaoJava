/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2aula6.view;

/**
 *
 * @author labex
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import prog2aula6.controller.AlunoController;

public class Cadastro extends JFrame {

    private JTextField nomeField;
    private JTextField enderecoField;
    private JTextField emailField;
    private JTextField cursoField;
    private JButton salvarButton;
    private JButton limparButton;

    public Cadastro() {
        super("Formulário de Cadastro");

        // Layout
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // centraliza a janela

        // Componentes
        nomeField = new JTextField();
        enderecoField = new JTextField();
        emailField = new JTextField();
        cursoField = new JTextField();
        salvarButton = new JButton("Salvar");
        limparButton = new JButton("Limpar");

        // Adicionando os componentes
        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Curso:"));
        add(cursoField);
        add(salvarButton);
        add(limparButton);

        // Evento do botão Salvar
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlunoController ac = new AlunoController();
                ac.cadastrarAluno(nomeField.getText(), enderecoField.getText(), 
                        emailField.getText(), cursoField.getText());
            }
        });

        // Evento do botão Limpar
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomeField.setText("");
                enderecoField.setText("");
                emailField.setText("");
                cursoField.setText("");
            }
        });

        setVisible(true);
    }
}
