package topic_1_7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String args[]){
		MusicItem song1 = new Track("Uptwon Fuck", "Bruno Mars", 100, "uptownfunk.mp3");
		MusicItem song2 = new Track("Just the way you are", "Bruno Mars", 200, "uptownfunk.mp3");
		MusicItem song3 = new Track("Granade", "Bruno Mars", 150, "uptownfunk.mp3");
		
		List<MusicItem> playlist = new ArrayList<MusicItem>();
		playlist.add(song1);
		playlist.add(song2);
		playlist.add(song3);
		
		MusicItem playlist1 = new PlayList("Mix de Bruno Mars", playlist);
		
		TrackController t = new TrackController(new MusicDriver());
		
		t.setSongToPlay(song1);
		t.play();
		t.pause();
		t.stop();
		
		//the view that observes the trackcontroller
		MusicView view = new MusicView(t);
	}
}
