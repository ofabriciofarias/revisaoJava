/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.jdbc;

/**
 *
 * @author labex
 */
public class Aulajdbc {
    public static void main(String [] args){
        Aluno a = new Aluno("João", "Coronel Raimundo Leão", "jjao@ufpa.br", "Sistemas de Informação");
        Aluno.inserirAluno(a);        
    }
}

