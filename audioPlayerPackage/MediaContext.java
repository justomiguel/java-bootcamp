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
public class MediaContext implements AudioPlayerState {
    
    private AudioPlayerState state;

    public AudioPlayerState getState() {
        return state;
    }

    public void setState(AudioPlayerState state) {
        this.state = state;
    }

    @Override
    public void startPlay() {
        this.state.startPlay();
    }

    @Override
    public void stopPlay() {
        this.state.stopPlay();
    }

    @Override
    public void pausePlay() {
        this.state.pausePlay();
    }
    
    
}
