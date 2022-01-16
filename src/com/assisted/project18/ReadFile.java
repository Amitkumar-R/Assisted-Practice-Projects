package com.assisted.project18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("a.txt");
		fis.read();
		int i = 0;
		while((i = fis.read()) != -1) {
			System.out.println((char)i);
		}
		
	}

}
