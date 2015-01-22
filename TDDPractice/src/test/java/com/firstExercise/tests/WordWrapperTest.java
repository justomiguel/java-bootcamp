package com.firstExercise.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import com.firstExercise.tdd.WordWrapper;

public class WordWrapperTest {

	@Test
	public void SeconFirstTestdTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals(wrapper.wrapWords("abc def", 20), "abc def");
	}
	
	@Test
	public void SecondTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals(wrapper.wrapWords("Hello Word!", 7), "Hello"+ WordWrapper.separator+  "Word!");
	}
	
	@Test
	public void ThirdTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals(wrapper.wrapWords("a b c d e f", 3), "a b"+ WordWrapper.separator+  "c d"+ WordWrapper.separator+  "e f");
	}
	
	@Test
	public void FourthTest() {
		WordWrapper wrapper = new WordWrapper();
		assertEquals(wrapper.wrapWords("Excelent", 5), "Excel"+ WordWrapper.separator+ "ent");
	}
}
