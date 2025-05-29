/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Fabricio
 */
import java.util.ArrayList;
import java.util.List;

public class CentralMensagens {
    private static CentralMensagens instancia;
    private List<String> historico;
    
    private CentralMensagens(){
        historico = new ArrayList<>();
    }
    
    public static CentralMensagens getInstancia(){
        if(instancia == null){
            instancia = new CentralMensagens();
        }
        return instancia;
    }
    
    public void registrar(String mensagem){
        historico.add(mensagem);
    }
    
    public void exibirHistorico(){
        System.out.println("\nHistórico de Mensagens Enviadas: ");
        for(String m: historico){
            System.out.println("- " + m);
        }
    }
}

