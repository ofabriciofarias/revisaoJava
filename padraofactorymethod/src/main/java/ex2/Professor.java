/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author Fabricio
 */
public class Professor implements Destinatario{

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Mensagem para o professor: " + mensagem);
    }
    
}


