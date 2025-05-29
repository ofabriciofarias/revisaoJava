/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosingleton;

/**
 *
 * @author Fabricio
 */
public class principal {
    public static void main(String [] args){
        //Obter instância do Singleton
        Inscritos inscritos = Inscritos.getInstancia();
        
        //Adicionar pessoas
        inscritos.adicionarPessoa(new Pessoa("Fabricio", 37, "fabricio@gmail.com"));
        inscritos.adicionarPessoa(new Pessoa("Maria", 55, "m22@gmail.com"));
        inscritos.adicionarPessoa(new Pessoa("Peter", 12, "pter@gmail.com"));
        
        //Relatório de pessoas inscritas
        inscritos.listarPessoas();
    }
}


