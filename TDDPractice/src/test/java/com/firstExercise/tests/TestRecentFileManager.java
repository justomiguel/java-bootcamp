package com.firstExercise.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

import com.firstExercise.tdd.RecentFileManager;

public class TestRecentFileManager {

	@Test
	public void Inicialtest() {
		File f = new File("");
		RecentFileManager manager = new RecentFileManager(15);
		manager.add(f);
		assertEquals(manager.getMostRecentFile(),f);
	}
	
	@Test
	public void Maxtest() {
		File f1 = new File("h");
		File f2 = new File("j");
		File f3 = new File("k");
		File f4 = new File("i");
		File f5 = new File("l");
		RecentFileManager manager = new RecentFileManager(2);
		manager.add(f1);
		manager.add(f2);
		manager.add(f3);
		manager.add(f4);
		manager.add(f5);
		ArrayList<Object> test = new ArrayList<Object>();
		test.add(f5);
		test.add(f4);
		assertEquals(manager.getRecentFiles(), test);
	}
	@Test
	public void getLEastUsedtest() {
		File f1 = new File("h");
		File f2 = new File("j");
		File f3 = new File("k");
		File f4 = new File("i");
		File f5 = new File("l");
		RecentFileManager manager = new RecentFileManager(5);
		manager.add(f1);
		manager.add(f2);
		manager.add(f3);
		manager.add(f4);
		manager.add(f5);
		assertEquals(manager.getLeastRecentFile(), f1);
	}

}
