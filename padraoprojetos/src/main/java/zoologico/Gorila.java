/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Fabricio
 */
public class Gorila extends Animal{

    public Gorila(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "uh uh ha ha!";
    }
    
}
