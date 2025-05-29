/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author Fabricio
 */
public abstract class DocumentoCreator {
    public abstract Documento criarDocumento(); //Factory Method
    
    public void abrirDocumento(){
        Documento doc = criarDocumento(); //Uso do factory method
        doc.abrir();
    }
}

