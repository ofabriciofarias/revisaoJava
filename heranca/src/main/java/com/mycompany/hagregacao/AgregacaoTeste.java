/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hagregacao;

/**
 *
 * @author labex
 */
public class AgregacaoTeste {
    public static void main(String[] args) {
        // Criando professores independentemente da escola
        Professor prof1 = new Professor();
        prof1.setNome("João Paulo");
        Professor prof2 = new Professor();
        prof2.setNome("Daniela Figueiredo");
        Professor prof3 = new Professor("Fernanda Lima");

        // Criando escola e agregando os professores
        Escola escola = new Escola("Escola Modelo");
        escola.addProfessor(prof1);
        escola.addProfessor(prof2);

        // Professores podem existir sem estarem em uma escola
        System.out.println("Professor independente: " + prof3.getNome());

        // Listando professores da escola
        System.out.println();
        escola.listarProfessores();
    }
}

