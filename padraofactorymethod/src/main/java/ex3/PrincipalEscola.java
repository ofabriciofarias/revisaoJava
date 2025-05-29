/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Fabricio
 */
public class PrincipalEscola {
    public static void main(String [] args){
        MensagemCreator mProf = new MensagemParaProfessor();
        MensagemCreator mAluno = new MensagemParaAluno();
        MensagemCreator mResp = new MensagemParaResponsavel();
        
        mProf.enviarMensagem("Não permita o uso de celular em sala!");
        mAluno.enviarMensagem("Avise seus pais ou responsável sobre a visita!");
        mResp.enviarMensagem("Venha visitar a escola!");
        
        //Exibe histórico da Central
        CentralMensagens.getInstancia().exibirHistorico();
    }
}

