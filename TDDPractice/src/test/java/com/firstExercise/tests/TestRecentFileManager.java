package com.firstExercise.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.firstExercise.tdd.RecentFileManager;

public class TestRecentFileManager {

	@Test
	public void TestInicial() {
		File f = new File("");
		RecentFileManager manager = new RecentFileManager(15);
		manager.add(f);
		assertEquals(f, manager.getMostRecentFile());
	}
	
	@Test
	public void TestMaxUsage() {
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
		List<Object> test = new ArrayList<Object>();
		test.add(f5);
		test.add(f4);
		assertEquals(test, manager.getRecentFiles());
	}
	@Test
	public void TestgetLEastUsedtest() {
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
		assertEquals(f1, manager.getLeastRecentFile());
	}

}
