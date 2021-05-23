package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg11 {

	    static int factorial(int n) 
	    { 
	        int fact = 1; 
	        while (n != 0) { 
	            fact = fact * n; 
	            n--; 
	        } 
	        return fact; 
	    } 
	 
	    static boolean isKrishnamurthy(int n) 
	    { 
	        int sum = 0; 
	  
	        int temp = n; 
	        while (temp != 0) { 

	            sum += factorial(temp % 10); 
	  

	            temp = temp / 10; 
	        } 
	  

	        return (sum == n); 
	    } 
	  

	    public static void main(String[] args)  throws IOException
		{
				BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		        int n; 
		        System.out.printf("Enter the number : ");
		        String a = reader.readLine();
				 if (a.chars().allMatch(Character::isDigit))
				 {
				 		n = Integer.parseInt(a);
					}
			     else {
					 System.out.println("Invalid Input only enter a number: ");
					 return;
				 }
		        if (isKrishnamurthy(n)) 
		        {
		            System.out.println(n +" is a Krishnamoorthy number");} 
		        else {
		            System.out.println(n +" is a not Krishnamoorthy number"); }
	    } 

	}

