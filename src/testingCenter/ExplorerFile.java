package testingCenter;
import java.util.*;
import java.io.*;

public class ExplorerFile {

	public static void main(String[] args) throws IOException {
		
		File testFile = new File("dooboo.txt");
		String absPath = testFile.getAbsolutePath();
		System.out.println(absPath);
		try  {
			
			System.out.println("file found");
			FileInputStream fin  = new FileInputStream(testFile);
			byte byteData;
			int i = 0;
			while (((byteData = (byte) fin.read()) != -1) || (i==10)) {
				
				System.out.print((char) byteData);
				i++;
			}
			
			fin.close();
			
			
		} catch (FileNotFoundException e){
			
			System.out.println("file not found");
			testFile.createNewFile();
			System.out.println("file created " + testFile.getAbsolutePath());
			
		}

	}

}
