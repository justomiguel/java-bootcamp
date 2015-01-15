/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audioPlayerPackage;

/**
 *
 * @author Santiago
 */
public class PlayState implements AudioPlayerState {
    
    @Override
    public void startPlay() {
        System.out.println("Media is already playing !");
    }

    @Override
    public void stopPlay() {
        System.out.println("Stopping media");
    }

    @Override
    public void pausePlay() {
        System.out.println("Pausing media");
    }
}
