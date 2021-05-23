package com.anna.msc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg15 {

	static int GetUserInputInt(String x)throws IOException
	{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
		int b;
	    System.out.println(x);
	    String n = reader.readLine();
	    if (n.chars().allMatch(Character::isDigit))
	    	{
	          b = Integer.parseInt(n);
	    	}
	    else
	        {

	    	   System.out.println("Invalid input.  Please enter a valid number");
	    	   return 0;
	 	    }

	    return b;
	}
	static Double GetUserInputDouble(String x)throws IOException
	{
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
		double p;
		String n;
	    System.out.println(x);
	    n= reader.readLine();
	    if(n.matches("-?\\d+(\\.\\d+)?"))
	    	{
	           p = Double.parseDouble(n);
	    	}
	    else
	        {

	    	   System.out.println("Invalid input.  Please enter a valid number");
	    	   return (double)0;
	 	 	}

	    return p;
	}


	static  void PrintResult(double X1[][], double X2[][], double X3[][])
	{
		int R1 = X1.length,C1 = X1[0].length;
		double Temp[][] = new double [R1][C1];
		System.out.println("First matrix \n");
		for(int n = 1; n<=3 ;n++)
		{
	      if( n == 1)
	      {
			  Temp = X1;
			  R1 = X1.length;
			  C1 = X1[0].length;
	      }
	      else if ( n == 2)
	       {
			   System.out.println("\nSecond matrix \n");
			   R1 = X2.length;
			   C1 = X2[0].length;
			   Temp =  X2;

		   }
	      else if ( n == 3)
	       {
			   System.out.println("\nResultant matrix \n");
			   R1 = X3.length;
			   C1 = X3[0].length;
			   Temp = X3;

		   }

		 for(int i=0;i<R1;i++)
		 {
			for(int j=0;j<C1;j++)
			{
				System.out.print(Temp[i][j]+"\t");
			}
				System.out.print("\n");
	     }

	    }
	 }

	 public static void main(String[] args)throws IOException
		{

		int R1 = 0 , R2 = 0 ,C1 = 0 ,C2 = 0;
		double M1[][];
		double M2[][];
		double M3[][];
		System.out.println("Matrix Multiplication");
		
		R1= GetUserInputInt("Enter the Number of rows for Matrix A:");
		C1= GetUserInputInt("Enter the Number of column for Matrix A:");
		R2= GetUserInputInt("Enter the Number of rows for Matrix B:");
		C2= GetUserInputInt("Enter the Number of column for Matrix B:");
		M1= new double[R1][C1];
		M2= new double[R2][C2];
		M3= new double[R1][C2];

		if (R2 == C1)
		{
			for(int i=0;i<R1;i++)
			{
				for(int j=0;j<C1;j++)
				{
					M1[i][j]= GetUserInputDouble("Enter the elements of the First Matrix M1["+i+"]"+"["+j+"] :" );
				}
			}
			for(int i=0;i<R2;i++)
			{
				for(int j=0;j<C2;j++)
				{
					M2[i][j]= GetUserInputDouble("Enter the elements of the Second Matrix M2["+i+"]"+"["+j+"] :" );
				}
			}

		    for (int i = 0; i < R1; i++)
		    {
		       for (int j = 0; j < C2; j++)
		       {
		          for (int k = 0; k < R2; k++)
		          {
		           M3[i][j] += ((M1[i][k])* (M2[k][j]));
			      }
		       }
           }
         System.out.println("Multiplication of Matrix \n");
         PrintResult(M1,M2,M3);
		 return;
		}
			else
		{
			System.out.println("\nError in Input \nBoth the Matrix must have same dimension; that is, they must have the same number of rows and columns\n");
			return;
		}
		}
}
