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
public class PauseState implements AudioPlayerState  {

    @Override
    public void startPlay() {
        System.out.println("Media went from paused to playing");
    }

    @Override
    public void stopPlay() {
        System.out.println("Stopping paused media");
    }

    @Override
    public void pausePlay() {
        System.out.println("Media is already paused");
    }
    
    
}
