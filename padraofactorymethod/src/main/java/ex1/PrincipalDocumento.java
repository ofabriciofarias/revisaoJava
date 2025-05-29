/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author Fabricio
 */
public class PrincipalDocumento {

    public static void main(String [] args){
        DocumentoCreator pdfCreator = new PdfCreator();
        DocumentoCreator wordCreator = new WordCreator();
        
        pdfCreator.abrirDocumento(); //Abrindo documento pdf
        wordCreator.abrirDocumento(); //Abrindo documento word
    }
}


