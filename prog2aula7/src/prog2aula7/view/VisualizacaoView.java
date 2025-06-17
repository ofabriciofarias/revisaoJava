/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2aula7.view;

/**
 *
 * @author labex
 */
import prog2aula7.model.Aluno;
import prog2aula7.model.AlunoDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class VisualizacaoView extends JFrame {

    private JTable tabela;
    private DefaultTableModel tableModel;
    private JButton opcoesButton;
    private JButton voltarButton;
    private List<Aluno> listaAlunos;
    private JFrame menuAnterior;

    public VisualizacaoView(JFrame menuAnterior) {
        super("Visualização de Alunos");
        this.menuAnterior = menuAnterior;
        
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Cabeçalhos da tabela
        String[] colunas = {"ID", "Nome", "Endereço", "Email", "Curso"};

        tableModel = new DefaultTableModel(colunas, 0);
        tabela = new JTable(tableModel);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);

        opcoesButton = new JButton("Opções");
        add(opcoesButton, BorderLayout.SOUTH);
        
        voltarButton = new JButton("Voltar");
        add(voltarButton, BorderLayout.NORTH);

        carregarAlunos();

        opcoesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linhaSelecionada = tabela.getSelectedRow();

                if (linhaSelecionada == -1) {
                    JOptionPane.showMessageDialog(null, "Selecione um aluno na tabela.");
                    return;
                }

                Aluno aluno = listaAlunos.get(linhaSelecionada);
                String[] opcoes = {"Editar", "Excluir"};
                int escolha = JOptionPane.showOptionDialog(
                        null,
                        "Escolha uma ação para o aluno: " + aluno.getNome(),
                        "Ações",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes,
                        opcoes[0]
                );

                if (escolha == 0) {
                    editarAluno(aluno);
                } else if (escolha == 1) {
                    excluirAluno(aluno);
                }
            }
        });
        
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                    // Fecha a tela atual
                menuAnterior.setVisible(true); // Reexibe a tela do menu
            }
        });

        setVisible(true);
    }

    private void carregarAlunos() {
        tableModel.setRowCount(0); // limpa a tabela
        AlunoDAO dao = new AlunoDAO();
        listaAlunos = dao.listarTodos();

        for (Aluno aluno : listaAlunos) {
            tableModel.addRow(new Object[]{
                    aluno.getId(),
                    aluno.getNome(),
                    aluno.getEndereco(),
                    aluno.getEmail(),
                    aluno.getCurso()
            });
        }
    }

    private void editarAluno(Aluno aluno) {
        String novoNome = JOptionPane.showInputDialog("Editar nome:", aluno.getNome());
        if (novoNome != null && !novoNome.isBlank()) {
            aluno.setNome(novoNome);
            // Você pode fazer isso com os outros campos também, se quiser
            AlunoDAO dao = new AlunoDAO();
            dao.atualizar(aluno);
            carregarAlunos();
            JOptionPane.showMessageDialog(null, "Aluno atualizado.");
        }
    }

    private void excluirAluno(Aluno aluno) {
        int confirmacao = JOptionPane.showConfirmDialog(null,
                "Deseja realmente excluir " + aluno.getNome() + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            AlunoDAO dao = new AlunoDAO();
            dao.excluir(aluno.getId());
            carregarAlunos();
            JOptionPane.showMessageDialog(null, "Aluno excluído.");
        }
    }
}
