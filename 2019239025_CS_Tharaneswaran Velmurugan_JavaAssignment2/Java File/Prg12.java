package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg12 {

	public static void main(String[] args)  throws IOException
	{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
        int s,n; 
		int i,j;
		int count=0,k,b,sum,fact;
		System.out.printf("Enter the Start range : ");
        String a = reader.readLine();
		 if (a.chars().allMatch(Character::isDigit))
		 {
		 		s = Integer.parseInt(a);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }
		System.out.printf("Enter the End range : ");
        String x = reader.readLine();
		 if (x.chars().allMatch(Character::isDigit))
		 {
		 		n = Integer.parseInt(x);
			}
	     else {
			 System.out.println("Invalid Input only enter a number: ");
			 return;
		 }
		System.out.println("------------------------------------------------");
		for(i=s;i<=n;i++)
		{
			sum=0;
			for(j=i;j>0;j=j/10)
			{       
				fact=1;
				b=j%10;
				for(k=1;k<=b;k++)
				{
					fact=fact*k;
				}
				sum=sum+fact;

			}
			if(sum==i)
			{
				count++;
				System.out.println("Krishnamoorthy no is: " + sum);

			}


		}
		System.out.println("Total no of Krishnamoorthy : " + count);
	}

}
