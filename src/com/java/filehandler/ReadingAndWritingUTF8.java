package com.java.filehandler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ReadingAndWritingUTF8 {
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Poem.txt"), "UTF-8"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("PoemCopy.txt"), "UTF-8");
		// Reading and writing all the rows in the file
		String row = br.readLine();
		while (row != null) {
			System.out.println(row);
			osw.write(row+"\n");
			row = br.readLine();
		}
		osw.close();
		br.close();
	}
}
