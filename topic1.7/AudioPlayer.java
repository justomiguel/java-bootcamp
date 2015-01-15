/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audioplayerproject.Music;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberta
 */
public class AudioPlayer {

    private List<Music> musicList = new ArrayList<>();
    private int track = 0;
    private boolean isPlaying = false;

    private Music actualTrack = null;

    public AudioPlayer(List<Music> songList) {
        this.musicList = songList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public String addSong(Music music) {
        this.musicList.add(music);
        track++;
        return (music.getSongTitle() + "Was added successfully");
    }

    public String removeSong(Music music) {
        if (musicList.remove(music)) {
            track--;
            return (music.getSongTitle() + "Was removed successfully");
        }

        return (music.getSongTitle() + "Wasn't removed");
    }

    public Music searchMusic(String songTitle) {

        for (Music m : musicList) {
            if (m.getSongTitle().contains(songTitle)) {
                return m;
            }
        }
        return null;
    }

    public void playMusic() {
        isPlaying = true;
        if (!musicList.isEmpty()) {
            actualTrack = musicList.get(0);
        }
        run();
    }

    public void stopMusic() {

        isPlaying = false;
    }

    public void pauseMusic() {

        isPlaying = true;
    }

    private void run() {
        while (isPlaying && actualTrack != null) {
            try {
                System.out.println("Now Playing: " + actualTrack.getSongTitle() + " by " + actualTrack.getArtist());
                sleep(Integer.toUnsignedLong(actualTrack.getDurationSong()));
                nextSong();
            } catch (InterruptedException ex) {
                Logger.getLogger(AudioPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void nextSong() {
        if (!musicList.isEmpty()) {
            if (actualTrack != null) {
                int index = musicList.indexOf(actualTrack) + 1;
                if (index >= musicList.size()) {
                    System.out.println("End of playlist reached");

                    actualTrack = null;
                    return;
                }
                actualTrack = musicList.get(index);
            } else {
                actualTrack = musicList.get(0);
            }
        }
    }

    public void previousSong(String songTitle) {
        if (!musicList.isEmpty()) {
            if (actualTrack != null) {
                int index = musicList.indexOf(actualTrack) + 1;
                if (index < 0) {
                    actualTrack = null;
                    return;

                }
                actualTrack = musicList.get(index);
            } else {
                actualTrack = musicList.get(0);
            }
        }
    }

}
