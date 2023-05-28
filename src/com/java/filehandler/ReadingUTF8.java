package com.java.filehandler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadingUTF8 {
	
	public static void main(String[] args) throws Exception {
		// Opening the file
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Poem.txt"), "UTF-8"));
		// Reading and displaying all the rows in the file
		String row = br.readLine();
		while (row != null) {
			System.out.println(row);
			row = br.readLine();
		}
		br.close();
	}
}
