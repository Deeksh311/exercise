package com.one;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream inputFile = new FileInputStream("C:\\Users\\lenovo\\Desktop\\input.txt.txt");

			while (inputFile.available() > 0) {
				int i = inputFile.read();
				System.out.println((char) i);
				inputFile.close();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
