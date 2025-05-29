/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Fabricio
 */
public class Leao extends Animal{

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Rugido!";
    }
    
}

