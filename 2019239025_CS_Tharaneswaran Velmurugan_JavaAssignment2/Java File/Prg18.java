package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg18 {

    public static void main(String[] args)throws IOException
	{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));

        int n = 0, temp;

        System.out.print("Enter no. of elements you want in array:");

        String b = reader.readLine();
	    if (b.chars().allMatch(Character::isDigit))
	    	{
	          n = Integer.parseInt(b);
	    	}
	    else
	        {

	    	   System.out.println("Invalid input.  Please enter a valid number");
	 	    }


        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) 

        {

            String x = reader.readLine();
    	    if (x.chars().allMatch(Character::isDigit))
    	    	{
    	          a[i] = Integer.parseInt(x);
    	    	}
    	    else
    	        {

    	    	   System.out.println("Invalid input.  Please enter a valid number");
    	 	    }

        }

        for (int i = 0; i < n; i++) 

        {

            for (int j = i + 1; j < n; j++) 

            {

                if (a[i] > a[j]) 

                {

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }

        System.out.print("Ascending Order:");

        for (int i = 0; i < n - 1; i++) 

        {

            System.out.print(a[i] + ",");

        }

        System.out.print(a[n - 1]);

    }

}
