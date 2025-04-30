/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvc01;

/**
 *
 * @author Fabricio
 */
import com.mycompany.mvc01.controller.PessoaController;
import com.mycompany.mvc01.view.PessoaView;

/**
 * Mvc01: Classe principal que inicia a aplicação.
 * Simula o servidor/backend instanciando os componentes do MVC.
 */
public class Mvc01 {
    public static void main(String[] args) {
        // 1. Cria a VIEW
        PessoaView view = new PessoaView();

        // 2. Cria o CONTROLLER e injeta a VIEW
        PessoaController controller = new PessoaController(view);

        // 3. Inicia o fluxo da aplicação
        controller.iniciar();
    }
}

