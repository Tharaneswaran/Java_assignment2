package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Prg20 {

	public static void main(String[] args) throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        System.out.print("Enter the Desired type of String Sorting \n 1)Ascending Order \n 2)Descending Order \n 3)Exit:\n");

        String c = reader.readLine();
	    int ch = 0;
		if (c.chars().allMatch(Character::isDigit))
	    	{
	          ch = Integer.parseInt(c);
	    	}
	    else
	        {

	    	   System.out.println("Invalid input.  Please enter a valid number");
	 	    }
		
		if(ch == 1) 
		{
		        int count;
		        String temp;
		        
		        //User will be asked to enter the count of strings 
		        System.out.print("Enter number of strings you would like to enter:");
		        String x = reader.readLine();
		        if (x.chars().allMatch(Character::isDigit))
				  {
				 	  count = Integer.parseInt(x);
				  }
				 else
				  {
				 	  System.out.println("Invalid Input only enter a Valid number: ");
				      return;
				  }
		        
		        String array1[] = new String[count];
		        //User is entering the strings and they are stored in an array
		        System.out.println("Enter the Strings one by one:");
		        for(int i = 0; i < count; i++)
		        {
		           array1[i] = reader.readLine();
		        }
		        
		        //Sorting the strings
		        for (int i = 0; i < count; i++) 
		        {
		            for (int j = i + 1; j < count; j++) { 
		                if (array1[i].compareTo(array1[j])>0) 
		                {
		                    temp = array1[i];
		                    array1[i] = array1[j];
		                    array1[j] = temp;
		                }
		            }
		        }
		        
		        //Displaying the strings after sorting them based on alphabetical order
		        System.out.print("Strings in Sorted Ascending Ordered Using Loop:");
		        for (int i = 0; i <= count - 1; i++) 
		        {
		            System.out.print(array1[i] + ", ");
		        }
		        Arrays.sort(array1);
		        System.out.println("\nStrings in Sorted Ascending Ordered Using toString method: : "+Arrays.toString(array1));
				}
		
		if(ch == 2) 
		{
			 int count;
		        String temp;
		        
		        //User will be asked to enter the count of strings 
		        System.out.print("Enter number of strings you would like to enter:");
		        String x = reader.readLine();
		        if (x.chars().allMatch(Character::isDigit))
				  {
				 	  count = Integer.parseInt(x);
				  }
				 else
				  {
				 	  System.out.println("Invalid Input only enter a Valid number: ");
				      return;
				  }
		        
		        String array1[] = new String[count];
		        //User is entering the strings and they are stored in an array
		        System.out.println("Enter the Strings one by one:");
		        for(int i = 0; i < count; i++)
		        {
		           array1[i] = reader.readLine();
		        }
		        
		        //Sorting the strings
		        for (int i = 0; i < count; i++) 
		        {
		            for (int j = i + 1; j < count; j++) { 
		                if (array1[i].compareTo(array1[j])<0) 
		                {
		                    temp = array1[i];
		                    array1[i] = array1[j];
		                    array1[j] = temp;
		                }
		            }
		        }
		        
		        //Displaying the strings after sorting them based on Descending alphabetical order
		        System.out.print("Strings in Sorted Descending Ordered Using Loop:");
		        for (int i = 0; i <= count - 1; i++) 
		        {
		            System.out.print(array1[i] + ", ");
		        }
		        Arrays.sort(array1, Collections.reverseOrder());
		        System.out.println("\nStrings in Sorted Descending Ordered Using toString method: : "+Arrays.toString(array1));
				}
		if(ch == 3) {
			System.out.println("\nExited Successfully ");
			return;
		}
			
		}
    }
