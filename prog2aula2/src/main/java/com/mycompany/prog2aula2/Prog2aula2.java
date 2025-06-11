/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2aula2;
import com.mycompany.prog2aula2.pkt.*;

/**
 *
 * @author labex
 */
public class Prog2aula2 {

    public static void main(String[] args) {
        Controle control = new Controle();
        control.temperatura = 20;
        System.out.println("Controle Generico - Própria Classe");
        control.imprimir();
        
        System.out.println("Controle do Ar - Dentro do Pacote");
        ControleAr controleDoAr = new ControleAr();
        controleDoAr.temperatura = 18;
        controleDoAr.imprimir();
        controleDoAr.diminuir();
        controleDoAr.imprimir();
        
        System.out.println("Controle do Motor - Fora do Pacote");
        ControleMotor cM = new ControleMotor();
        cM.imprimirClique();
        cM.clique = 3; //Como veio de herança, é possível acessar a variável protected
    }
}
