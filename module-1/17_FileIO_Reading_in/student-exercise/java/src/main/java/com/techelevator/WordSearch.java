package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		
		File inputFile = getInputFileFromUser();
		String word = wordToSearch();
		search(inputFile, word);
	}
	
	
	private static File getInputFileFromUser() {
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("Please enter the file path");
		String path = fileInput.nextLine();
		
		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " does not exist");
			System.exit(1);
		}
		else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file");
			System.exit(1);
		}
		
		return inputFile;
	}

	private static String wordToSearch() {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the word to search for");
		String searchWord = userInput.nextLine();
		
		return searchWord;
	}

	private static void search(File inputFile, String searchWord) {
		@SuppressWarnings("resource")
		Scanner caseSensitive = new Scanner(System.in);
		System.out.println("Should the search be Case Sensitive? (y/n)");
		String yesOrNo = caseSensitive.nextLine();
		
		try (Scanner input = new Scanner(inputFile)) {
			int x = 1;
			while (input.hasNextLine()) {
				if (yesOrNo.equals("n")) {
					
					String line = input.nextLine();
					if (line.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(x + ") " + line);
					} else {
					}
				} else {
					String line = input.nextLine();
					if (line.contains(searchWord)) {
						System.out.println(x + ") " + line);
					}
					
				}
				x++;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist");
		}
		return;
	}

}
