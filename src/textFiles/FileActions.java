package textFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

	public static void createFolder(String path) {
		File folder = new File(path);
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created: " + path);
		}
	}

	// creating file
	public static void createFile(String path) {

		File myObj = new File(path);

		try {
			if (myObj.createNewFile()) {
				System.out.println("File is created " + myObj.getName());
			} else {
				System.out.println("File is alreadey exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// writing file
	public static void writeFile(String path) {
		try {
			FileWriter fileWriter = new FileWriter(path);
			fileWriter.write("Welcome to java file handling");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("And error occured .... ");
			e.printStackTrace();
		}

	}

	// reading data from the file
	public static void readFile(String path) {
		File myFile = new File(path);
		Scanner myScanner;
		try {
			myScanner = new Scanner(myFile);
			while (myScanner.hasNextLine()) {
				String data = myScanner.nextLine();
				System.out.println(data);
			}
			myScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("An error occered while reading....");

		}
	}

	// rename file
	public static void reNameFile(String oldFilePath, String newFilePath) {
		File oldFile = new File(oldFilePath);
		File newFile = new File(newFilePath);

		if (oldFile.renameTo(newFile)) {
			System.out.println("file is reanamed");
		} else {
			System.out.println("File can not renamed ");
		}
	}
	//delete file
	public static void deleteFile(String path) {
		File myobj=new File(path);
		if (myobj.delete()) {
			System.out.println("deleted the file"+myobj.getName());
		}else {
			System.out.println("Failed to delete the file");
		}
	}

	public static void main(String[] args) {
		String folderPath = "/Users/Home/folderCreatedByJava";
		createFolder(folderPath);

		String filePath = "/Users/Home/folderCreatedByJava/myfile.txt";
		createFile(filePath);
		writeFile(filePath);
		readFile(filePath);
		
		String newFilePath="/Users/Home/folderCreatedByJava/myfile1.txt";
		reNameFile(filePath, newFilePath);
		
		deleteFile(newFilePath);
		
		
	}
}
