/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Fabricio
 */
public abstract class MensagemCreator {
    public abstract Destinatario criarDestinatario(); //Factory Method
    
    public void enviarMensagem(String mensagem){
        Destinatario d = criarDestinatario();
        d.receberMensagem(mensagem);
        
        //Registra mensagem na central (singleton)
        CentralMensagens.getInstancia().registrar(mensagem);
    }
}


