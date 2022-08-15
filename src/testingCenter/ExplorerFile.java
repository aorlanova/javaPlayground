package testingCenter;
import java.util.*;
import java.nio.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.*;

public class ExplorerFile {

	public static void main(String[] args) throws IOException {
		
		File testFile = new File("dooboo.txt");
		String absPath = testFile.getAbsolutePath();
		System.out.println(absPath);
		List<String> wordFileList = new ArrayList<>();
		Map <Integer, Long> result = new TreeMap<>();
		
		
		try  {
			
			System.out.println("file found");
			FileInputStream fin  = new FileInputStream(testFile);
			byte byteData;
			int i = 0;
			Scanner in = new Scanner(testFile);
			
			while (((byteData = (byte) fin.read()) != -1) || (i==10)) {
				
				System.out.print((char) byteData);
				i++;
				
			}
			
			while (in.hasNext()) {
				
				wordFileList.add(in.next());
				
			}
			
			Stream<String> words = wordFileList.stream();
			result = words.collect(Collectors.groupingBy(w -> w.length(), 
					Collectors.counting()));
					
			System.out.println("The amount of words and their lengths in dooboo.txt:");
			System.out.println(result);
			
			in.close();
			fin.close();
			
			
		} catch (FileNotFoundException e){
			
			System.out.println("file not found");
			testFile.createNewFile();
			System.out.println("file created " + testFile.getAbsolutePath());
			
		}

	}

}
