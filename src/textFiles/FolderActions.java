package textFiles;

import java.io.File;

public class FolderActions {

	// creating folder
	public static void createFolder(String path) {
		File folder = new File(path);
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created " + path);
		}
	}

	// check if folder is exist
	public static boolean checkFolderIsExist(String path) {

		File folder = new File(path);
		return folder.exists();

	}

	// rename a folder
	public static void reNameAFolder(String oldeName, String newName) {
		File oldFolder = new File(oldeName);
		File newFolder = new File(newName);

		if (oldFolder.exists()) {
			oldFolder.renameTo(newFolder);
			System.out.println("Folder renamed to:" + newName);
		}
	}

	// delete folder
	public static void deleteFolder(String path) {
		// this code delete if only folder is empty
		File folder = new File(path);
		if (folder.exists()) {
			folder.delete();
		}
	}

	// delete file with folder
	public static void deleteFileWithFolder(String path) {
		// this code delete if file with folder
		File folder = new File(path);
		if (folder.exists()) {
			for (File file : folder.listFiles())
				file.delete();
		}
		folder.delete(); 
	}

	public static void main(String[] args) {

		String folderPath = "/Users/Home/folderCreatedByJava";
		createFolder(folderPath);
		boolean folderExists = checkFolderIsExist(folderPath);
		System.out.println("The folder is exist: = " + folderExists);

		String newFolderPath = "/Users/Home/folderCreatedByJava1";
		reNameAFolder(folderPath, newFolderPath);
		
		deleteFolder(newFolderPath);
		
		
		
		String folderPath2 = "/Users/Home/folderCreatedByJava";
		createFolder(folderPath2);
		boolean folderExists2 = checkFolderIsExist(folderPath);
		System.out.println("The folder is exist: = " + folderExists2);

		String newFolderPath2 = "/Users/Home/folderCreatedByJava2";
		reNameAFolder(folderPath2, newFolderPath2);
		
		deleteFileWithFolder(newFolderPath2);
	}

}
