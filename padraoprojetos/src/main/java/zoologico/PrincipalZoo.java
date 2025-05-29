/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Fabricio
 */
public class PrincipalZoo {
    public static void main(String [] args){
        
        Zoo z1 = Zoo.getInstancia();
        z1.addAnimal(new Gorila("Koko", 7));
        z1.addAnimal(new Lobo("Papão", 4));
        
        Zoo z2 = Zoo.getInstancia();
        z2.addAnimal(new Leao("Miau", 17));
        
        z1.exibeRelatorio();
        
    }
}


