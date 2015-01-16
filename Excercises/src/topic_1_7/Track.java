package topic_1_7;

public class Track implements MusicItem {
	private String name;
	private int duration;
	private String song;//the song would be the mp3 or any format
	
	public Track(String name, int duration, String song){
		this.name = name;
		this.duration = duration;
		this.song = song;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
