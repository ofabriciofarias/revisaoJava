/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraoadapter;

/**
 *
 * @author labex
 */
//Classe legada que já aceita vlc e mp4.
public class AdvancedMediaPlayer {
    public void playVlc(String fileName){
        System.out.println("Reproduzindo arquivo VLC: " + fileName);
    }
    
    public void playMp4(String fileName){
        System.out.println("Reproduzindo arquivo MP4: " + fileName);
    }
}

