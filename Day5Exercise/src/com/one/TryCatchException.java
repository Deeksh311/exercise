package com.one;

import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Integers: ");
		Scanner scanner = new Scanner(System.in);

		try {
			int firstInteger = scanner.nextInt();
			int secondInteger = scanner.nextInt();
			System.out.println(firstInteger / secondInteger);
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}
}
