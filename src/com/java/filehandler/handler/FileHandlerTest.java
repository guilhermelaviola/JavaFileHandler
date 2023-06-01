package com.java.filehandler.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlerTest {
	
	public static void main(String[] args) throws IOException {
		readFileAndDisplayInConsole();
		readVariableAndWriteFile();
		readKeyboardAndWriteFile();
		readFileAndWriteFile();
	}

	public static void readFileAndDisplayInConsole() throws IOException {
		System.out.println("Executing readFileAndDisplayInConsole():");
		File inputFile = new File("ShoppingList.txt");
		Scanner input = new Scanner(inputFile);
		
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}

	public static void readVariableAndWriteFile() throws IOException {
		System.out.println("\r\nExecuting readVariableAndWriteFile():");
		/* The second FileWriter parameter specifies whether we want 
		 * to create a new file or not; or add it at the end of the same file (with append.)
		 */
		FileWriter file = new FileWriter("OutputFileVariable.txt", false);
		String row = "New test" + "\r\n" + "skipped a row.";
		file.write(row);
		file.close();
	}
	
	public static void readKeyboardAndWriteFile() throws IOException {
		System.out.println("\r\nExecuting readKeyboardAndWriteFile():");
		Scanner keyboard = new Scanner(System.in);
		/* The second FileWriter parameter specifies whether we want 
		 * to create a new file or not; or add it at the end of the same file (with append.)
		 */
		FileWriter file = new FileWriter("OutputFileKeyboard.txt", false);
		System.out.println("Type whatever you want. In order to end the program, type 'END'.");
		while (!keyboard.hasNext("END")) {
			file.write(keyboard.nextLine());
			file.write("\r\n");
			/*
			 * The command file.flush() can be used to release everything that was
			 * stored in the file.
			 */
			file.flush();
		}
		file.close();
		keyboard.close();
	}
	
	public static void readFileAndWriteFile() throws IOException {
		System.out.println("\r\nExecuting readFileAndWriteFile():");
		File inputFile = new File("ShoppingList.txt");
		Scanner input = new Scanner(inputFile);
		FileWriter file = new FileWriter("OutputFile.txt", false);
		while (input.hasNextLine()) {
			file.write(input.nextLine() + "\r\n");
		}
		file.close();
		input.close();
	}
}
