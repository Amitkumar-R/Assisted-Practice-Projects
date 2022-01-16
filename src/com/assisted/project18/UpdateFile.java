package com.assisted.project18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	static void fileModify(String path, String oldStr, String newStr) {
		File fileModified = new File(path);
		String oldContent = "";
		BufferedReader bufferReader = null;
		FileWriter fileWriter = null;
		
		try {
			bufferReader = new BufferedReader(new FileReader(fileModified));
			String line = bufferReader.readLine();
			while(line != null) {
				oldContent = oldContent + line + System.lineSeparator();
				line = bufferReader.readLine();
			}
			String newContent = oldContent.replace(oldStr, newStr);
			fileWriter = new FileWriter(fileModified);
			fileWriter.write(newContent);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				bufferReader.close();
				fileWriter.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileModify("F:\\Java\\Assisted Practice Projects\\a.txt", "Java", "Python");
		System.out.println("Done");
	}

}
