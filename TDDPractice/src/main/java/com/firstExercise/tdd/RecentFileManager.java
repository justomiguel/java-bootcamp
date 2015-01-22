package com.firstExercise.tdd;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecentFileManager<E> {

	private List<E> recentFiles = new ArrayList<E>();
	private int maxCapacity;
	
	
	public RecentFileManager(int maxCapacity){
		this.maxCapacity = maxCapacity;
	}
	
	public void add(E element){
		recentFiles.remove(element);
		recentFiles.add(0, element);
		checkCapacity();
	}
	
	public E getMostRecentFile(){
		return recentFiles.get(0);
	}
	
	public E getLeastRecentFile(){
		return recentFiles.get(recentFiles.size()-1);
	}
	
	private void checkCapacity() {
		if(recentFiles.size() > maxCapacity)
			recentFiles.remove(recentFiles.size()-1);
	}
	
	public ArrayList<E> getRecentFiles(){
		return (ArrayList<E>) recentFiles;
	}

}
