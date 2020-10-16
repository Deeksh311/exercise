package com.one;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Player Name: ");

		String name = scanner.next();

		System.out.println("Enter the Player Age: ");

		int age = scanner.nextInt();

		try {

			if (age < 19) {
				throw new CustomException();
			} else {
				System.out.println("Player Name:" + name);
				System.out.println("Palyer Age: " + age);
			}
		} catch (CustomException e) {

			System.out.println(e);
		}
	}

}
