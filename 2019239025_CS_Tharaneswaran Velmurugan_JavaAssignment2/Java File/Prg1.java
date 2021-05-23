package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Prg1 {
    public static void main(String[] args)
        throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        
 
        int n=0 ,sum=0 ,i=1;
	
	
	   	 System.out.print("Enter no of series 'n' : ");
	   	 String x = reader.readLine();
	   	 if (x.chars().allMatch(Character::isDigit))
	   	  {
	   	 	  n = Integer.parseInt(x);
	   	  }
	   	 else
	   	  {
	   	 	  System.out.println("Invalid Input only enter a Valid number: ");
	   	      return;
	   	  }
	   	  for(i=1;i<=n;i++)
	   	  {
	   		  sum+=((i*i)/i);
	   	  }
	   	  System.out.println("Sum of series is: 1^2 / 1 + 2^2 / 2 + 3^2 / 3 + .... + n^2 / n:\n Sum = "+sum);

    }
}