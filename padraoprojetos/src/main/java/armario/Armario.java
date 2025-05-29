/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;

/**
 *
 * @author Fabricio
 */
import java.util.ArrayList;
import java.util.List;

public class Armario {
    //Atributo estático para armazenar a única instância
    private static Armario instancia;
    
    //Lista de itens armazenados
    private List<String> itens;
    
    //Construtor privado que impede instâncias externas
    private Armario(){
        itens = new ArrayList<>();
    }
    
    //Método de acesso global à instância
    public static Armario getInstancia(){
        if(instancia == null){
            instancia = new Armario();
        }
        return instancia;
    }
    
    //Métodos para manipular os itens do armario
    public void adicionarItem(String item){
        itens.add(item);
        System.out.println(item +" foi adicionado ao armário");
    }
    
    public void listarItens(){
        System.out.println("Itens no armário:");
        for(String item : itens){
            System.out.println("- " + item);
        }
    }
}
