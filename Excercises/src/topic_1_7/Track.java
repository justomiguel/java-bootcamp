package topic_1_7;

public class Track implements MusicItem {
	private String name;
	private int duration;
	private String artist;
	private String song;//the song would be the mp3 or any format
	
	public Track(String name,String artist, int duration, String song){
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.song = song;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
}
