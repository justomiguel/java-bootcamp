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
public class StopState implements AudioPlayerState  {
    
        @Override
    public void startPlay() {
        System.out.println("Media went from stopped to playing");
    }

    @Override
    public void stopPlay() {
        System.out.println("Media is already stopped !");
    }

    @Override
    public void pausePlay() {
        System.out.println("Stopped media can't be paused");
    }
}
