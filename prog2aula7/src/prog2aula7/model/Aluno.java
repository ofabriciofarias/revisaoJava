/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2aula7.model;

/**
 *
 * @author labex
 */
public class Aluno extends Pessoa{
    private String email, curso;

    public Aluno() {}

    public Aluno(String nome, String endereco, String email, String curso) {
        super(nome, endereco);
        this.email = email;
        this.curso = curso;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return getId() + " - " + getNome() + " - " + getEndereco() + " - " + email + " - " + curso;
    }
}

