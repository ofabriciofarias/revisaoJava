/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.jdbc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labex
 */
public class Aulajdbc {
    public static void main(String [] args){
                
        Aluno a = new Aluno("Ray", "Juaba Station Masachusets Texas, 938", "rayban@ufpa.br", "Sistemas de Informação");
        a.setId(8);
        
        a.atualizarAluno();
        //a.inserirAluno();
        
        //a.setId(5);
        //a.excluirAluno();
    }
}


