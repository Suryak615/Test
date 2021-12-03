package com.dnpass.corejavatraining.day7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
		FileReader fd = new FileReader("C:\\Users\\subas\\OneDrive\\Desktop\\lap request details.txt");
		BufferedReader bf = new BufferedReader(fd);
		String line = bf.readLine();
		while(line != null)
		{
		  System.out.println(line);
		  line = bf.readLine();
		}
		}
		catch(FileNotFoundException e) {
		System.out.println("File doesnot exists. "+e);
	}
		catch(IOException e) {
		System.out.println("File is empty.");
	}


		finally{
			System.out.println("Thank you");
		}
	}

}

