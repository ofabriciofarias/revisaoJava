/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;

/**
 *
 * @author Fabricio
 */
public class MainArmarios {
    public static void main(String [] args){
        Armario armario1 = Armario.getInstancia();
        armario1.adicionarItem("Café");
        
        Armario armario2 = Armario.getInstancia();
        armario2.adicionarItem("Leite");
        
        //Verificar itens que estão no armário
        armario1.listarItens();
        
        //Confirmar se é a mesma instância
        System.out.println("Mesma instância? " + (armario1 == armario2));
    }
}


