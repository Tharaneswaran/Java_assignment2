package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg9 {

	public static void main(String[] args) throws IOException
	{
		 BufferedReader reader = new BufferedReader(
		 new InputStreamReader(System.in));
		 
		 int number=0 , sum=0 , remainder=0;
		 System.out.print("Enter a number to check whether its Armstrong or not: ");
		 String b = reader.readLine();
		 if (b.chars().allMatch(Character::isDigit))
		 {
		 	number = Integer.parseInt(b);
		 }
		 else
		 {
		  	System.out.println("Invalid input.  Please enter a valid integer number");
		 	return;
		 }


		 while(number != 0)
		 {
			 remainder = number % 10 ;
			 sum += remainder*remainder*remainder ;
		         number = number / 10;

	      }
	      if(Integer.parseInt(b) == sum)
	      {
	      	System.out.println(Integer.parseInt(b) + " Is an Armstrong Number");
		  }
		  else
		  {
			System.out.println(Integer.parseInt(b) + " Is Not an Armstrong Number");
		  }


	}

}
