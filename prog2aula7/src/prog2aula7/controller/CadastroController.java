/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2aula7.controller;

import javax.swing.JFrame;
import prog2aula7.view.Cadastro;

/**
 *
 * @author labex
 */
public class CadastroController {
    
    public CadastroController(JFrame janelaAnterior){
        janelaAnterior.setVisible(false);
        new Cadastro(janelaAnterior);     // Passa a referência para o Cadastro
        
    }
    
}
