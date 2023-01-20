package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("inputFile.txt"));
			while(input.hasNext()) {
				System.out.println(input.next());
			}
			PrintWriter output = new PrintWriter(new File("outputFile.txt"));
			output.append("Here is my output.");
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

}
