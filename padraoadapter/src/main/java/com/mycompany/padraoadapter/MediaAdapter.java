/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadapter;

/**
 *
 * @author labex
 */
//Adapter que conecta as duas interfaces
//Responsável em juntar as funcionalidades da classe legada com
//as novas necessidades/atualizações.
public class MediaAdapter implements AudioPlayer{
    private AdvancedMediaPlayer advancedPlayer;
    
    public MediaAdapter(String audioType){
        //Quando instanciar um objeto da nova classe já faz a instância
        //da classe legada.
        advancedPlayer = new AdvancedMediaPlayer();
    }

    //Refaz a implementação do método play da interface
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedPlayer.playMp4(fileName);
        }else{
            System.out.println("Formato não suportado: " + audioType);
        }
    }
    
    
}
