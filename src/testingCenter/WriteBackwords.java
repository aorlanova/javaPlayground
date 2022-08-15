package testingCenter;

/* Antonina Orlanova, CSC1302, Mrs. Jackson Summer 2022
 * Write a method that reverses all lines in a file.

Read all lines, reverse each line, and write the result.*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteBackwords {

	public static void main(String[] args) throws IOException {
		
		// in this file are the numbers 4 and 3, "4 3"
		// program output is "5251" this is correct, as ACSII values for 3 = 52, and 4 = 51.
		writeBack("fileList copy.txt");

	} // end of main
	
	// writeBack method, writes all lines in file backwards.
	public static void writeBack (String fileName) throws IOException {
		
		// create file with parameter
		RandomAccessFile sample = new RandomAccessFile(fileName, "rw");
		StringBuffer buffer = new StringBuffer();
		
		// begins iterating over file from last to first character.
		for (long i = sample.length() -1; i >= 0;i--) {
			
			sample.seek(i);
			buffer.append(sample.read());
			i--;
			
		}
		
		// closes sample file.
		sample.close();
		String back = new String();
		back = buffer.toString();
		System.out.println("backwords file content: " + back);
		
	}

}
