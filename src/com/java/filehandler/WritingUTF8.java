package com.java.filehandler;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WritingUTF8 {
	
	public static void main(String[] args) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("as.txt"), "UTF-8");
		osw.write("ґ: бйнуъ\n");
		osw.write("^: вкофы\n");
		osw.write("END");
		osw.close();
	}
}
