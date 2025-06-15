/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajdbc2;

/**
 *
 * @author labex
 */
public class Aluno {
    private int id;
    private String nome, endereco, email, curso;

    public Aluno() {}

    public Aluno(String nome, String endereco, String email, String curso) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.curso = curso;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + endereco + " - " + email + " - " + curso;
    }
}

