package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg3 {

	public static void main(String[] args) 
		throws IOException
		{
		 BufferedReader reader = new BufferedReader(
		 new InputStreamReader(System.in));
		 
		 int n=0 , i = 0,j=0;
		 double sum=0;


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

		  for (i = 1;i<=n;i++)
		  {
			 for(j=1;j<=i;j++)
			 {
			  sum=sum+j;
		     }
	      }

			System.out.println("The sum of the series-> 1 + (1 + 2) + (1+2+3) + ...  n : " + sum);
	}

}
