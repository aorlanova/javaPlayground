package testingCenter;

/* Name: Antonina Orlanova, CSC1302, Summer 2022
 Testing whether treeset or hashset is more efficient by adding all the words in war and peace to it and timing the process.*/

import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.*;

public class TestingSets extends StopWatch {

	public static void main(String[] args) {
		
		String fileName  = "war-and-peace.txt";
		//adding the words in war-and-peace to an ArrayList
		try (Scanner in = new Scanner(new File(fileName))) {
			
			ArrayList<String> words = new ArrayList<>();
			
			while (in.hasNext()) {
				
				String aWord = in.next();
				words.add(aWord);
				
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			// create new StopWatch object
			StopWatch timer = new StopWatch();
			timer.start();
			// begin addition to hashset
			Set<String> words = new HashSet<>();
			
			for (String aWord : words) {
				
				words.add(aWord);
				
			}
			timer.stop();
			
			// return time elapsed during addition to hashset
			long hashSetTime = timer.getElapsedTime();
			System.out.println(hashSetTime);
			timer.reset();
			
			// repeat same process as above, but using a treeset.
			timer.start();
			Set<String> w = new TreeSet<>();
			
			for (String aWord : w) {
				
				w.add(aWord);
				
			}
			timer.stop();
			
			long treeSetTime = timer.getElapsedTime();
			System.out.println(treeSetTime);
			timer.reset();
				

	}

}

