package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg10 {

	public static void main(String[] args) throws IOException
	{
		 BufferedReader reader = new BufferedReader(
		 new InputStreamReader(System.in));
		 

       int lower,upper;

       System.out.printf("Enter lower bound of the interval: ");
       String a = reader.readLine();
		 if (a.chars().allMatch(Character::isDigit))
		 {
		 		lower = Integer.parseInt(a);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }

       // Ask user to enter upper value of interval
       System.out.printf("\nEnter upper bound of the interval: ");
       String b = reader.readLine();
		 if (b.chars().allMatch(Character::isDigit))
		 {
		 		upper = Integer.parseInt(b);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }

		    for(int number = lower + 1; number < upper; ++number) {
		      int digits = 0;
		      int result = 0;
		      int originalNumber = number;

		      // number of digits calculation
		      while (originalNumber != 0) {
		        originalNumber /= 10;
		        ++digits;
		      }

		      originalNumber = number;

		      // result contains sum of nth power of its digits
		      while (originalNumber != 0) {
		        int remainder = originalNumber % 10;
		        result += Math.pow(remainder, digits);
		        originalNumber /= 10;
		      }

		      if (result == number)
		        System.out.print(number + " ");
		      }
		  }

	}

