/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajdbc2;

/**
 *
 * @author labex
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void inserir(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, endereco, email, curso) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getCurso());
            stmt.executeUpdate();
            System.out.println("Aluno inserido com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public List<Aluno> listarTodos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        try (Connection conn = ConnectionFactory.getConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEndereco(rs.getString("endereco"));
                a.setEmail(rs.getString("email"));
                a.setCurso(rs.getString("curso"));
                lista.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar: " + ex.getMessage());
        }
        return lista;
    }

    public void atualizar(Aluno aluno) {
        String sql = "UPDATE alunos SET nome=?, endereco=?, email=?, curso=? WHERE id=?";
        try (Connection conn = ConnectionFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getCurso());
            stmt.setInt(5, aluno.getId());
            stmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar: " + ex.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM alunos WHERE id=?";
        try (Connection conn = ConnectionFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno excluído com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir: " + ex.getMessage());
        }
    }
}

