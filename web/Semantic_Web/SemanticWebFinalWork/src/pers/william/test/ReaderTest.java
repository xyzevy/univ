package pers.william.test;

import org.junit.Test;

import pers.william.io.ReadFile;

public class ReaderTest {

	@Test
	public void testReader(){
		ReadFile readerFile = new ReadFile();
		
		System.out.println(readerFile.read("src/rating.txt").);
	}
	
}
