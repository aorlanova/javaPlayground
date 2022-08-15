package testingCenter;

/* Antonina Orlanova, CSC1302, Mrs. Jackson Summer 2022
 * Write a method that, given a Path to a file that doesn't yet exist, creates all intermediate directories and the file..*/

import java.io.*;
import java.nio.*;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CreateFileDir {
	
	public static void main(String[] args) {
		
		// asks user for a full file path. Fails if the file path exists.
		try {
		Scanner console = new Scanner(System.in);
		
		System.out.println("enter full file path:");
		String getFile = console.next();
		createFilePath(Paths.get(getFile));
		
		}//try ends
		
		// if file path exists:
		catch(IOException e) {
			
			System.out.println("Error" + e);
			
		}
		
	}//end of main method
	
	// creates file entered by user and it's file path.
	public static void createFilePath(Path path) throws IOException {
		
		Path parent = path.getParent().toAbsolutePath();
		Path current = path.getRoot();
		
		for (Path p: parent) {
			
			current = current.resolve(p);
			
		}
		
		// file directories created
		if (!Files.exists(current)) {
			
			Files.createDirectories(current);
		}
		
		// final file created.
		Files.createFile(path);
		
	}

}//end of class
