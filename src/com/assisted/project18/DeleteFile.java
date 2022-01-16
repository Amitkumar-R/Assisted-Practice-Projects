package com.assisted.project18;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			Files.deleteIfExists(Paths.get("F:\\Java\\Assisted Practice Projects\\a.txt"));
		} catch(NoSuchFileException nsfe) {
			System.out.println("No such file exists");
		} catch(DirectoryNotEmptyException dne) {
			System.out.println("Directory is not empty");
		} catch(IOException ioe) {
			System.out.println("Invalid permission");
		}
		System.out.println("Deleted successfully");
	}

}
