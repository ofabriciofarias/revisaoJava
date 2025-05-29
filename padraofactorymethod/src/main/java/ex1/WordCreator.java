/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author Fabricio
 */
public class WordCreator extends DocumentoCreator{

    @Override
    public Documento criarDocumento() {
        return new WordDocumento(); // decide qual produto concreto instanciar
    }
    
}

