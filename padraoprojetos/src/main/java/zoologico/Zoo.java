/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Fabricio
 */
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static Zoo instancia;
    private List<Animal> animais;
    
    private Zoo(){
        animais = new ArrayList<>();
    }
    
    public static Zoo getInstancia(){
        if(instancia == null){
            instancia = new Zoo();
        }
        return instancia;
    }
    
    public void addAnimal(Animal animal){
        animais.add(animal);
    }
    
    public void exibeRelatorio(){
        System.out.println("Relatório de animais do Zoo!");
        for(Animal ani: animais){
            System.out.println(ani);
        }
    }
}
