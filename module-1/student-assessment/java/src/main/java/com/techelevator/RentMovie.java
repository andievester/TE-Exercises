package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RentMovie {
	

	public static void main(String[] args) {
	

		File movieFile = new File("C:\\Users\\Student\\workspace\\avester-java\\module-1\\student-assessment\\java\\data-files\\MovieInput.csv");
	

		try (Scanner movieImporter = new Scanner(movieFile)) {
			while (movieImporter.hasNextLine()) {
				String line = movieImporter.nextLine();
				if (!line.isEmpty()) {
					String[] movieData = line.split(",");
					String title = movieData[0];
					String format = movieData[1];
					boolean isPremium = movieData[2] != null;
					MovieRental currentMovie = null;

					if (format.equals("VHS")) {
						currentMovie = new VHS(title, format, isPremium);
					}
					if (format.equals("DVD")) {
						currentMovie = new VHS(title, format, isPremium);
					}
					if (format.equals("Blu-Ray")) {
						currentMovie = new BluRay(title, format, isPremium);
					}
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("No file present");
			e.printStackTrace();
			System.exit(1);
		}
	
	}

	
}
