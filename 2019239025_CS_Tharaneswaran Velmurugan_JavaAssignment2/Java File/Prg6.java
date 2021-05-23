package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg6 {

	public static void main(String[] args) throws IOException
	{
		 BufferedReader reader = new BufferedReader(
		 new InputStreamReader(System.in));
		 
		 int number=0 ;
		 System.out.print("Enter the number: ");
		 String b = reader.readLine();
		 if (b.chars().allMatch(Character::isDigit))
		 {
		 		number = Integer.parseInt(b);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }
		 int count=0;
		 for(int i = 1 ; i <=number ; i++)	
			{	
				if(number % i == 0)	{
					count=count+1;		//condition for getting the factors of number n
				}
				
			}
			if(count == 2) {                        //if factors are two then, number is prime else not
			System.out.println( number +" is Prime Number");
			}			
			else {
				System.out.println(number + " is Not a Prime Number");

			}

	}

}
