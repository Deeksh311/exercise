package com.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float runRate;
		System.out.println("Enter Runs: ");
		int runs = Integer.parseInt(reader.readLine());
		System.out.println("Enter Overs: ");
		int overs = Integer.parseInt(reader.readLine());
		try {
			runRate = (float) runs / overs;
			System.out.println("Current Run Rate : " + runRate);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

}
