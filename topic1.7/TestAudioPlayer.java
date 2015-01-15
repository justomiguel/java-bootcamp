/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package audioplayerproject.Music;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roberta
 */
public class TestAudioPlayer {
    public static void main(String[] args) {
        Music tk1 = new Music(1, "Soda Stereo", "Zona de Promesas", "Zona de promesas", 700);
        Music tk2 = new Music(2, "Pink Floyd", "Any Colour You Like", "Dark Side of the moon", 900 );
        Music tk3 = new Music(3, "Amy Winehouse", "Back to Black", "Back to Black", 1200);
        List<Music> musicList = new ArrayList<>();
        musicList.add(tk1);
        musicList.add(tk2);
        musicList.add(tk3);
        
        AudioPlayer ap = new AudioPlayer(musicList);
        
        ap.nextSong();
        ap.playMusic();
        
        
    }
}
