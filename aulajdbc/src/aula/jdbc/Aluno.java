/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Aluno {
    
    private int id;
    private String nome, endereco, email, curso;
    
    public Aluno(){}
    
    public Aluno(String nome, String endereco, 
            String email, String curso){
        //this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.curso = curso;
    }
    
    public void inserirAluno(){
        String nome = this.getNome();
        String endereco = this.getEndereco();
        String email = this.getEmail();
        String curso = this.getCurso();        

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
    
     public static List<Aluno> lerTodosAlunos(){
        String sql = "SELECT * FROM alunos";
        
        List<Aluno> listAlunos = null;
        
        Connection conn = ConnectionFactory.getConexao();
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            listAlunos = new ArrayList<>();
            
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCurso(rs.getString("curso"));
                listAlunos.add(aluno);
            }
            conn.close();
            stmt.close();
            rs.close();             
        }catch(SQLException ex){
            System.out.println("Erro: " + ex);
        }
        return listAlunos;
    }
          
     public void atualizarAluno(){
        //System.out.println("Atualizando Aluno");
        String sql = "UPDATE alunos SET " 
                + "nome = '" + this.getNome() + "',"
                + "endereco = '" + this.getEndereco() + "',"
                + "email = '" + this.getEmail() + "',"
                + "curso = '" + this.getCurso() + "'"
                + "WHERE id = " + this.getId();
        
        Connection conn = ConnectionFactory.getConexao();
        
        try{
            Statement stmt = conn.createStatement();
            int resultado = stmt.executeUpdate(sql);
            if(resultado != 0){
                System.out.println("Aluno atualizado"
                        + " com sucesso!");
            }
            stmt.close();
            conn.close();
        }catch(SQLException ex){
                System.out.println("Erro: " + ex);
        }
    }
    
    public void excluirAluno(){
        String sql = "DELETE FROM alunos WHERE id = " + this.id;
        
        Connection conn = ConnectionFactory.getConexao();
        
        try{
            Statement stmt = conn.createStatement();
            int resultado = stmt.executeUpdate(sql);
            
            if(resultado != 0){
                System.out.println("Aluno Excluido "
                        + "com sucesso");
            }
            
            conn.close();
            stmt.close();
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

