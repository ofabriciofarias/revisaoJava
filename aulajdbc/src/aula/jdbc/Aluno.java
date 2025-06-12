/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Aluno {
    
    private int id;
    private String nome, endereco, email, curso;
    
    public Aluno(String nome, String endereco, 
            String email, String curso){
        //this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.curso = curso;
    }
    
    public static void inserirAluno(Aluno a){
        String nome = a.getNome();
        String endereco = a.getEndereco();
        String email = a.getEmail();
        String curso = a.getCurso();        

        String sql = "INSERT INTO alunos " 
                + "(nome, endereco, email, curso) VALUES "
                + "('" + nome + "',"
                + "'" + endereco + "', "
                + "'" + email + "', "
                + "'" + curso + "')";
        System.out.println(sql);
        
        Connection conn = ConnectionFactory.getConexao();
        System.out.println("Conn: " + conn);
    
        try{
            Statement stmt = conn.createStatement();
            int resultado = stmt.executeUpdate(sql);
            if(resultado != 0){
               // System.out.println("Aluno inserido "
               //         + "com sucesso!");
               JOptionPane.showMessageDialog(null,
                       "Aluno(a) Inserido(a) com sucesso");
            }
            stmt.close();
            conn.close();
        }catch(SQLException ex){
                System.out.println("Erro: " + ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

