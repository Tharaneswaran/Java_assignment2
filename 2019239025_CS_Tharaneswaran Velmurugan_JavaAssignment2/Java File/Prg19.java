package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg19 {

	public static void main(String []args) throws IOException
		{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
		
		System.out.print("Enter the Desired type of Bubble Sorting \n 1)Ascending Order \n 2)Descending Order: \n 3)Exit\n");

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
		if(ch==1) 
		{
			System.out.println("\n----ASCENDING ORDER----\n");
			    int num = 0, i, j, temp;
			    
			 
			    System.out.println("Enter the number of integers to sort:");
			    String b = reader.readLine();
			    if (b.chars().allMatch(Character::isDigit))
			    	{
			          num = Integer.parseInt(b);
			    	}
			    else
			        {
		
			    	   System.out.println("Invalid input.  Please enter a valid number");
			 	    }
			 
			    int array[] = new int[num];
			 
			    System.out.println("Enter " + num + " integers: ");
			 
			    for (i = 0; i < num; i++) {
			    String x = reader.readLine();
			    if (x.chars().allMatch(Character::isDigit))
			    	{
			          array[i] = Integer.parseInt(x);
			    	}
			    else
			        {
		
			    	   System.out.println("Invalid input.  Please enter a valid number");
			 	    }
			    }
			    
			 
			    for (i = 0; i < ( num - 1 ); i++) {
			      for (j = 0; j < num - i - 1; j++) {
			        if (array[j] > array[j+1]) 
			        {
			           temp = array[j];
			           array[j] = array[j+1];
			           array[j+1] = temp;
			        }
			      }
			    }
			    System.out.println("Sorted list of integers in Ascending Order:");
			 
			    for (i = 0; i < num; i++) 
			      System.out.println(array[i]);
			  }
		
		if(ch==2) {
		    int num = 0, i, j, temp;
		    
		    System.out.println("\n----DESCENDING ORDER----\n");
		    System.out.println("Enter the number of integers to sort:");
		    String b = reader.readLine();
		    if (b.chars().allMatch(Character::isDigit))
		    	{
		          num = Integer.parseInt(b);
		    	}
		    else
		        {
	
		    	   System.out.println("Invalid input.  Please enter a valid number");
		 	    }
		 
		    int array[] = new int[num];
		 
		    System.out.println("Enter " + num + " integers: ");
		 
		    for (i = 0; i < num; i++) {
		    String x = reader.readLine();
		    if (x.chars().allMatch(Character::isDigit))
		    	{
		          array[i] = Integer.parseInt(x);
		    	}
		    else
		        {
	
		    	   System.out.println("Invalid input.  Please enter a valid number");
		 	    }
		    }
		    
		 
		    for (i = 0; i < ( num - 1 ); i++) {
		        for (j = 0; j < num - i - 1; j++) {
		          if (array[j] < array[j+1]) 
		          {
		            temp = array[j];
		            array[j] = array[j+1];
		            array[j+1] = temp;
		          }
		        }
		      }
		    System.out.println("Sorted list of integers In Descending Order:");
		 
		    for (i = 0; i < num; i++) 
		      System.out.println(array[i]);
		  }
		
		if(ch == 3) {
			System.out.println("\nExited Successfully ");
			return;
		}
			
		}
	}
