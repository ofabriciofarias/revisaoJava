/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraoadapter;

/**
 *
 * @author labex
 */
public class Padraoadapter {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayerClient();
        
        player.play("mp3", "musica1.mp3");
        player.play("mp4", "musica1.mp4");
        player.play("vlc", "musica1.vlc");
        player.play("avi", "musica1.avi");
    }
}

