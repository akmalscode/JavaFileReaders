package cvsFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileReader {

	public static void dataReadFromScannerClass() throws FileNotFoundException {

		// Approach 1 :using Scanner class
		File file = new File(System.getProperty("user.dir") + "/data/myFile1.csv");
		Scanner scanner = new Scanner(file);
		scanner.useDelimiter(",");

		while (scanner.hasNext()) {
			System.out.print(scanner.next() + "\t");
		}
		scanner.close();
	}

	// Approach 2: using java Split() method

	public static void dataReadUsingSplitMethod() throws IOException {
		String csvFileName = System.getProperty("user.dir") + "/data/myFile1.csv";
		FileReader fileReader = new FileReader(csvFileName);

		BufferedReader br = new BufferedReader(fileReader);
		String line;
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			for (String value : data) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		dataReadFromScannerClass();
		//dataReadUsingSplitMethod();
	}
}