package testingCenter;
import java.util.*;
import java.nio.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.*;

public class ExplorerFile {

	public static void main(String[] args) throws IOException {
		
		// testFile is created, dooboo.txt
		File testFile = new File("dooboo.txt");
		String absPath = testFile.getAbsolutePath();
		System.out.println(absPath);
		List<String> wordFileList = new ArrayList<>();
		Map <Integer, Long> result = new TreeMap<>();
		
		
	
		try  {
			// file exists
			System.out.println("file found");
			// file input stream, fin made to print every word in file, dooboo.txt
			FileInputStream fin  = new FileInputStream(testFile);
			byte byteData;
			int i = 0;
			Scanner in = new Scanner(testFile);
			
			// while fin.read() does not return -1, every byte, type-casted to chat is printed.
			while (((byteData = (byte) fin.read()) != -1) || (i==10)) {
				
				System.out.print((char) byteData);
				i++;
				
			}
			
			// all words are added to the List of words in dooboo.txt
			while (in.hasNext()) {
				
				wordFileList.add(in.next());
				
			}
			
			// Stream to sort words by length.
			Stream<String> words = wordFileList.stream();
			result = words.collect(Collectors.groupingBy(w -> w.length(), 
					Collectors.counting()));
					
			System.out.println("The amount of words and their lengths in dooboo.txt:");
			System.out.println(result);
			
			in.close();
			fin.close();
			
			
		} catch (FileNotFoundException e){
			
			// file created if dooboo.txt not found.
			System.out.println("file not found");
			testFile.createNewFile();
			System.out.println("file created " + testFile.getAbsolutePath());
			
		}

	}

}
