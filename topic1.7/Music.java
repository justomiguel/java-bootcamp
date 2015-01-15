/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audioplayerproject.Music;

/**
 *
 * @author roberta
 */
public class Music {

    private int songCode;//The unique idetifier of the song
    private String artist;
    private String album;
    private String songTitle;
    private int durationSong;

    public Music(int songCode, String artist, String album, String songTitle, int durationSong) {
        this.album = album;
        this.songTitle = songTitle;
        this.durationSong = durationSong;
        this.artist = artist;
        this.songCode = songCode;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getDurationSong() {
        return durationSong;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setDurationSong(int durationSong) {
        this.durationSong = durationSong;
    }

    public int getSongCode() {
        return songCode;
    }

    public void setSongCode(int songCode) {
        this.songCode = songCode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.songCode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Music other = (Music) obj;
        if (this.songCode != other.songCode) {
            return false;
        }
        return true;
    }

}
