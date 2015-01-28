package com.firstExercise.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import com.firstExercise.tdd.WordWrapper;

public class WordWrapperTest {

	@Test
	public void SeconFirstTestdTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals("abc def", wrapper.wrapWords("abc def", 20));
	}
	
	@Test
	public void SecondTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals("Hello"+ WordWrapper.SEPARATOR+  "Word!", wrapper.wrapWords("Hello Word!", 7));
	}
	
	@Test
	public void ThirdTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals("a b"+ WordWrapper.SEPARATOR+  "c d"+ WordWrapper.SEPARATOR+  "e f", wrapper.wrapWords("a b c d e f", 3));
	}
	
	@Test
	public void FourthTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals("Excel"+ WordWrapper.SEPARATOR+ "ent", wrapper.wrapWords("Excelent", 5));
	}
}
