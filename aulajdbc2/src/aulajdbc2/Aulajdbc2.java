/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulajdbc2;

/**
 *
 * @author labex
 */
import java.util.List;

public class Aulajdbc2 {
    public static void main(String[] args) {
        AlunoDAO dao = new AlunoDAO();

        // Inserir aluno
        Aluno a1 = new Aluno("Raiane", "Rua da Aldeia", "rai@email.com", "Sistemas");
        dao.inserir(a1);

        // Listar alunos
        List<Aluno> lista = dao.listarTodos();
        for (Aluno a : lista) {
            System.out.println(a);
        }

        // Atualizar o primeiro aluno (exemplo)
        if (!lista.isEmpty()) {
            Aluno a = lista.get(3);
            a.setEndereco("Rua Atualizada");
            dao.atualizar(a);
        }

        // Excluir o último aluno
        if (!lista.isEmpty()) {
            int idParaExcluir = lista.get(lista.size() - 1).getId();
            dao.excluir(idParaExcluir);
        }
    }
}