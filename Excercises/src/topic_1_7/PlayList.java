package topic_1_7;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PlayList implements MusicItem{
	private List<MusicItem> music;
	private String name;
	private int duration;
	
	public PlayList(String name, List<MusicItem> music){
		this.name = name;
		this.music = music;
	}
	
	@Override
	public String getName() {
		return name;
	}

	//return a random song
	public String getSong() {
		Collections.shuffle(music);
		return music.get(0).getSong();
	}

	@Override
	public int getDuration() {
		duration = 0;
		for(MusicItem m: music)
			duration += m.getDuration();
		return duration;
	}
	
	public void addItem(MusicItem m){
		music.add(m);
	}
	
	public void removeItem(MusicItem m){
		music.remove(m);
	}
}
