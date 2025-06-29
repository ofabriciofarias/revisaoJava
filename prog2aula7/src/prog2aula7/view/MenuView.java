/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2aula7.view;

/**
 *
 * @author labex
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controladores (você implementará depois)
import prog2aula7.controller.CadastroController;
import prog2aula7.controller.ConsultaController;
import prog2aula7.controller.VisualizacaoController;

public class MenuView extends JFrame {

    private JButton cadastrarButton;
    private JButton consultarButton;
    private JButton fecharButton;

    public MenuView() {
        super("Menu Principal");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Centraliza a janela
        setLayout(new GridLayout(3, 1, 10, 10));

        cadastrarButton = new JButton("Cadastrar");
        consultarButton = new JButton("Consultar");
        fecharButton = new JButton("Finalizar");

        // Adiciona os botões
        add(cadastrarButton);
        add(consultarButton);
        add(fecharButton);

        // Eventos já prontos (você implementará os controllers)
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroController controller = new CadastroController(MenuView.this);
                //controller.cadastrarAluno();
            }
        });

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsultaController controller = new ConsultaController(MenuView.this);
               // controller.executarConsulta();
            }
        });

        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Encerra totalmente o programa
            }
        });

        setVisible(true);
    }
}