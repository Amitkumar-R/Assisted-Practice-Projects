package com.assisted.project18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String input = "This is Java Programming";
		FileOutputStream fos = new FileOutputStream("a.txt");
		byte b[] = input.getBytes();
		fos.write(b);
		System.out.println("Data has been inserted successfully");

	}

}
