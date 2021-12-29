package assignment2Q1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;


public class ListOperations {

	public static void main(String[] args) {
		//creating list of numbers with duplicate values
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		//creating string list with duplicate values
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList("Anagha","Beneetha","Anagha","Sreya","alka","Raj","Alka"));
		
		//printing lists with duplicates
		System.out.println("Integer ArrayList with duplicates: " +numList);
		System.out.println("String ArrayList with duplicates: " +strList);
		
		//removing duplicates using Hash Set
		LinkedHashSet<Integer> numSet = new LinkedHashSet<Integer>(numList);
		LinkedHashSet<String> strSet = new LinkedHashSet<String>(strList);
		
		//creating new lists without duplicates
		ArrayList<Integer> numListWithoutDuplicates = new ArrayList<Integer>(numSet);
		ArrayList<String> strListWithoutDuplicates = new ArrayList<String>(strSet);
		
		//printing the lists 
		System.out.println("Integer ArrayList after removing duplicates: "+numListWithoutDuplicates);
		System.out.println("String ArrayList after removing duplicates: "+strListWithoutDuplicates);
		
		//sorting string list
		Collections.sort(strListWithoutDuplicates); //method in collections that sort in ascending order
		
		//printing sorted String List
		System.out.println("Sorted String List is: " +strListWithoutDuplicates);
		
		//creating 2 separate lists to store odd and even values
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		
		//separating odd and even
		for(int i : numListWithoutDuplicates) {
			if(i%2 == 0) {
				evenList.add(i);
			} else {
				oddList.add(i);
			}
		}
		
		//printing the lists
		System.out.println("Integer List with Even Values: " + evenList);
		System.out.println("Integer List with Odd Values: " + oddList);
		
		//Writing Results to file
		try {
			FileWriter writer = new FileWriter("C:\\Users\\Achu\\eclipse-workspace\\assignment2Q1\\src\\testout.txt");		 
			for(int i : numListWithoutDuplicates) {
				writer.write(i + System.lineSeparator());
			 }
			 
			for(String str : strListWithoutDuplicates) {
				writer.write(str + System.lineSeparator());
			 }
			writer.flush();
			writer.close();
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Resulting Lists have been written to file. ");
			}
		
    }
}


