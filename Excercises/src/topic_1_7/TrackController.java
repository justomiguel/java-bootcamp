package topic_1_7;

import java.util.Observable;

import topic_1_1.Item;

public class TrackController extends Observable{
	
	private MusicDriver driver;
	
	public TrackController(MusicDriver driver){
		this.driver = driver;
	}
	
	public void setSongToPlay(MusicItem m){
		driver.selectSong(m.getSong());
		System.out.println("Playing "+ m.getName());
		notifySongChange(m);
	}
	
	public void play(){
		driver.playSong();
		System.out.println("Song in playing");
	}
	
	public void stop(){
		driver.stopSong();
		System.out.println("Song was stopped");
	}
	
	public void pause(Track t){
		driver.pause();
		System.out.println("Song was paused");
	}
	
	public void notifySongChange(MusicItem m){
		this.setChanged();
		this.notifyObservers(m.getName());
	}
}
