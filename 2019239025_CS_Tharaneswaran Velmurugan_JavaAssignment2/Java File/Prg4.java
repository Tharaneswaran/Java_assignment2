package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg4 {

	public static void main(String[] args) 		
			throws IOException
	{
		 BufferedReader reader = new BufferedReader(
		 new InputStreamReader(System.in));
		 
		 int n=0 ,a=0, i = 0,j=0;
		 double sum=1;
		 double fact=1;

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
		 if (n>0)
			{

		  		System.out.println("Enter the value of x:");
		  		x = reader.readLine();
		  		if(x.matches("-?\\d+(\\.\\d+)?"))
					{
			     		a = Integer.parseInt(x);
					}
		  		else
		    		{
		 		 		System.out.println("Invalid input.  Please enter a valid integer number");
		 		 		return;
		 	 		}
		  	 for( i=2 ; i <= n ;i++)
		  	 {
			   for(j=i-1; j>0; j--)
			   {
				 fact = fact*j;
			    }

				if(i%2==0)
				{
					sum = sum - Math.pow(a,i-1)/fact;

			    }
			   else
			   {
				 sum = sum + Math.pow(a,i-1)/fact;

			   }
	           fact=1;
			 }
			}
		else
			{
					 sum =0;
			}
			System.out.println("The sum of the series-> 1 - X + X^2 / 2! - X^3 / 3! +.....n is :" + sum);

	}

}
