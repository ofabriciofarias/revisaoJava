/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosingleton;

/**
 *
 * @author Fabricio
 */
import java.util.ArrayList;
import java.util.List;

public class Inscritos {
    private static Inscritos instancia;
    private List<Pessoa> listaDeInscritos;
    
    //Construtor Privado
    private Inscritos(){
        listaDeInscritos = new ArrayList<>();
    }
    
    //Método de acesso à instância única
    public static Inscritos getInstancia(){
        if(instancia == null){
            instancia = new Inscritos();
        }
        return instancia;
    }
    
    //Métodos para manipular inscritos
    public void adicionarPessoa(Pessoa pessoa){
        listaDeInscritos.add(pessoa);
    }
    
    public void listarPessoas(){
        System.out.println("Lista de Pessoas Inscritas");
        for(Pessoa p : listaDeInscritos){
            System.out.println(p);
        }
    }
}

