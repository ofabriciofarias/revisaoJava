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
        Professor prof1 = new Professor("Eduardo", 19000);
        prof1.setNome("Eduardo Xavier");
        Professor prof2 = new Professor("Luciele", 90000);
        //prof2.setNome("Daniela Figueiredo");
        Professor prof3 = new Professor("Fernanda Lima", 200);

        // Criando escola e agregando os professores
        Escola escola = new Escola("Escola Modelo", "Travessa das Flores 203");
        escola.addProfessor(prof1);
        escola.addProfessor(prof3);

        // Professores podem existir sem estarem em uma escola
        System.out.println("Professor independente: " + prof2.getNome());
        System.out.println("Salário = " + prof2.getSalario());

        // Listando professores da escola
        System.out.println();
        escola.listarProfessores();
    }
}

