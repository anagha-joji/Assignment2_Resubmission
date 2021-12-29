package assignment2_Q2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; // Import the Scanner class to read text files

public class CountingWordsFromFile {

	static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException {
		try {
		      File myObj = new File("C:\\Users\\Achu\\eclipse-workspace\\assignment2_Q2\\outputfile.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } finally {
		    	System.out.println("Paragraph has been read from file. ");
		    }
		
		//reading the file and counting the words
		Scanner file = new Scanner (new File(filename));
		while(file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
		if(count != null)
			count ++;
		else
		   count = 1;
		   words.put(word,count);
		}
		file.close();
		}
	public static void main(String[] args){
		Map<String,Integer> words = new HashMap<String, Integer>();
		try {
			CountWords("C:\\Users\\Achu\\eclipse-workspace\\assignment2_Q2\\outputfile.txt",words);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		System.out.println(words);
		}
}
	
	