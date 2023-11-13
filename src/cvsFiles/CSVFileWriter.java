package cvsFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWriter {

	public static void main(String[] args) throws IOException {
		String csvFilename = System.getProperty("user.dir") + "/data/myFile1.csv";

		FileWriter writer = new FileWriter(csvFilename);
		writer.append("Name,Age,Email \n");
		writer.append("Akmal,43,akmal@hotmail.com \n");
		writer.append("Scott,45,scott@gmail.com \n");

		writer.close();
		System.out.println("CSV fileis create :" + csvFilename);
	}
}
