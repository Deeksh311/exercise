package com.one;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator my_calculator = new MyCalculator();
		System.out.println("Enter Integers: ");
		Scanner scanner=new Scanner(System.in);
		int n = scanner .nextInt();
        int p = scanner .nextInt();
        
        try
        {
            System.out.println(my_calculator.power(n, p));
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
	}

}
