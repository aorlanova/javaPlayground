package testingCenter;

/* Name: Antonina Orlanova, CSC1302, Summer 2022
 * Program scans text file and sorts all words in the file by word length.*/

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.*;

public class SortWords {
	
	
	//main method.
	public static void main(String[] args) throws IOException {
		
		// scanner created, new File created.
		Scanner in = new Scanner(new File("war-and-peace.txt"));
		Map <Integer, Long> result = new TreeMap<>();
		List<String> wordList = new ArrayList<>();
		//all words in war-and-peace.txt added to wordList
		while (in.hasNext()) {
			
			
			wordList.add(in.next());
			
		}
	
		// stream created. Collects to result by grouping by length and the counts.
		Stream<String> words = wordList.stream();
		result = words.limit(40)
				.collect(Collectors.groupingBy(w -> w.length(), 
						Collectors.counting()));
		
		System.out.println("The amount of words and their lengths in War and Peace:");
		System.out.println(result);
		

	}
	
}
