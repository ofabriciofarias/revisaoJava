/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author Fabricio
 */
public class PdfCreator extends DocumentoCreator{

    @Override
    public Documento criarDocumento() {
        return new PdfDocumento(); // decide qual produto concreto instanciar
    }
    
    
}

